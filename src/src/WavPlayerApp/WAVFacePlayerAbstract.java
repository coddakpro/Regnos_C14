package src.WavPlayerApp;

public interface WAVFacePlayerAbstract {
    void resume();

    int getVolume();

    int setVolume();

    boolean isRunning();

    void exit();
}
