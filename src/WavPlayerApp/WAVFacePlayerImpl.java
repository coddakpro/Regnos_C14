package WavPlayerApp;

import src.WavPlayerApp.WAVFacePlayerAbstract;

import java.security.cert.Extension;

/**
 *
 */
public class WAVFacePlayerImpl implements src.WavPlayerApp.WAVFacePlayer, WAVFacePlayerAbstract {
    @Override
    public Extension[] getSupportedExtensions() {
        return new Extension[0];
    }

    @Override
    public void run() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public int setVolume() {
        return 0;
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public void exit() {

    }
}
