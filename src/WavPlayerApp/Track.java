package WavPlayerApp;

import java.io.File;

    public class Track {
        private int index;
        private File file;
        private boolean played;
        private final boolean playing;
        private int previousTrackIndex, nextTrackIndex;

        public Track(int index, File file) {
            this.index = index;
            this.file = file;
            played = false;
            playing = false;
            previousTrackIndex = -1;
            nextTrackIndex = -1;
        }

        public Track() {
            this.playing = isPlaying();
        }

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public File getFile() {
            return file;
        }

        public void setFile(File file) {
            this.file = file;
        }

        public String getFileName() {
            return file.getName();
        }

        public String getFilePath() {
            return file.getPath();
        }

        public boolean isPlayed() {
            return played;
        }

        public void setPlayed(boolean played) {
            this.played = played;
        }

        public boolean isPlaying() {
            return playing;
        }


        public int getNextTrackIndex() {
            return this.nextTrackIndex;
        }

        public void setNextTrackIndex(int nextTrackIndex) {
            this.nextTrackIndex = nextTrackIndex;
        }

        public int getPreviousTrackIndex() {
            return previousTrackIndex;
        }

        public void setPreviousTrackIndex(int previousTrackIndex) {
            this.previousTrackIndex = previousTrackIndex;
        }
        @Override
        public String toString() {
            return index+1 + "| " + file.getName() + " - " + (file.getUsableSpace() / 1024 / 1024) + " MB";
        }
    }

