package src.WavPlayerApp;

import java.security.cert.Extension;

public interface WAVFacePlayer {
    Extension[] getSupportedExtensions();

    void run();

    void pause();
}
