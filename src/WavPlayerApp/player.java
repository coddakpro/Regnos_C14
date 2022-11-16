package WavPlayerApp;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.Extension;

public class player {

    // Singleton instance
    private static player instance;
    private Object track;
    private Clip clip;
    private AudioInputStream audioInputStream;
    private boolean paused;
    private boolean userStopped;
    private boolean running;
    private double soundLevel;


    public static <Player> void setInstance(Player instance) {
    }

    public static player getInstance() {
        return instance;
    }


    /**
     * Plays the song in the playlist
     * @throws LineUnavailableException if line is unavailable
     * @throws IOException              if file is not found
     */

    public void play(File audioFile) throws Exception {
        if (!isRunning()) {
            try {
                setAudioInputStream(AudioSystem.getAudioInputStream(audioFile));
            } catch (Exception e) {
                e.printStackTrace();
            }
            setClip(AudioSystem.getClip());
            getClip().open(getAudioInputStream());

            setUserStopped(false);

            // Set the volume
            setVolume();

            getClip().start();
            setRunning(true);
            getClip().addLineListener(event -> {
                if (Paused() && !isUserStopped() || getClip().getFramePosition() == getClip().getFrameLength()) {
                    sendEvent(event);
                    setRunning(false);
                }
            });
        }
    }

    private void setVolume() {
    }

    private void sendEvent(LineEvent event) {
    }



    public static Extension[] getExtensions() {
        return new Extension[]{new Extension() {

            @Override
            public String getId() {
                return getId();
            }

            @Override
            public boolean isCritical() {
                return false;
            }

            @Override
            public byte[] getValue() {
                return new byte[0];
            }

            @Override
            public void encode(OutputStream out) {

            }
        }};
    }


    public void run() {
        play();
    }

    private void play() {
    }

    /**
     * Stops the song
     */
    private void stop() {
        getClip().setMicrosecondPosition(0L);
        getClip().stop();
        getClip().close();
        setUserStopped(true);
        setRunning(false);
    }

    /**
     * Pauses the song
     */

     void pause() {
        getClip().stop();
        setPaused(true);
    }

    /**
     * Resumes the playing of the song
     */

     void resume() {
        getClip().start();
        setPaused(false);
    }

    /**
     * Get the current volume of the song
     * @return the volume
     */

    int getVolume() {
        return getVolume(0);
    }

    /**
     * Get the current volume of the song
     * @return the volume
     */

    int getVolume(int soundLevel) {
        this.soundLevel = soundLevel;
        return (int) getSoundLevel();
    }


    /**
     * Set the volume of the song
     */

        public double setVolume(int volume) {
            if (volume < 0.0 || volume > 1.0) {
                System.out.println("Volume must be between 0 and 1, volume = " + volume);
                return 0;
            }
            setSoundLevel(volume);
            if (getClip() != null) {
                setUserStopped(true);
                if (Paused())
                    getClip().stop();
                FloatControl gainControl = (FloatControl) getClip().getControl(FloatControl.Type.MASTER_GAIN);
                float db = (float) (Math.log(volume) / Math.log(10.0) * 20.0);
                gainControl.setValue(db);
                if (Paused())
                    getClip().start();
            }
            return 0;
        }

    public boolean isRunning() {
        return running;
    }

    /**
     * Stop and close the player
     */

    public void exit() {
        if (getClip() != null) {
            stop();
            getClip().close();
        }
    }

    /**
     */
    void getTrack() {
        this.clip = (Clip) track;
    }


    public void setTrack(Object track) {
        this.track = track;
    }

    public Clip getClip() {
        return clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public AudioInputStream getAudioInputStream() {
        return audioInputStream;
    }

    public void setAudioInputStream(AudioInputStream audioInputStream) {
        this.audioInputStream = audioInputStream;
    }

    public boolean Paused() {
        return !paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public boolean isUserStopped() {
        return userStopped;
    }

    public void setUserStopped(boolean userStopped) {
        this.userStopped = userStopped;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public double getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(double soundLevel) {
        this.soundLevel = soundLevel;
    }

}

