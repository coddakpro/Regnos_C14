package WavPlayerApp;

import java.security.cert.Extension;

public interface WAVFacePlayer {
    Extension[] getSupportedExtensions();

    void run();

    void pause();

    void resume();

    int getVolume();

    int setVolume();

    boolean isRunning();

    void exit();
}
