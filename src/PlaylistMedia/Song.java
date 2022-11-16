package PlaylistMedia;


import java.io.Serializable;
import java.lang.reflect.Type;

public class Song implements Serializable {

        private String artist;
        private String title;
        private int length;
        private String genre;
        private int rating;

        //Creates a playlist object with an artist, title, length, genre, and rating.
        public Song(String artist, String title, int length, String genre, int rating)
        {
            this.artist = artist;
            this.title = title;
            this.length = length;
            this.genre = genre;
            this.rating = rating;
        }

    public Song() {
        this.artist = getArtist();
        this.genre = getGenre();
        this.title = getTitle();
    }

    //Sets Song's artist to argument artist.
        public void setArtist(String artist)
        {
            this.artist = artist;
        }

        //Return the value of artist in a Song.
        public String getArtist()
        {
            return artist;
        }

        //Sets Song's title to argument title.
        public void setTitle(String title)
        {
            this.title = title;
        }

        //Returns the value of title in a Song.
        public String getTitle()
        {
            return this.title;
        }

        //Sets song's length to length argument; creates InvalidLengthException.
        /* This is not exactly how I wanted to do this, instead
         * this checks for validity by seeing if the argument String
         * contains both a colon and only numbers.*/
        public void updateLength(int index, String length) throws InvalidLengthException
        {
            if(length.matches("(\\d.*):(\\d.*)"))
            {
                this.length = Integer.parseInt(length);
            }
            else
            {
                Type subString = null;
                throw new InvalidLengthException(null, length);
            }
        }

        //Returns the value of length in a Song.
        public String getLength()
        {
            return String.valueOf(this.length);

        }

        //Sets Song's genre to argument genre.
        public void setGenre(String genre)
        {
            this.genre = genre;
        }

        //Returns value of genre in a Song.
        public String getGenre()
        {
            return this.genre;
        }

        //Sets Song's rating to argument rating; creates InvalidRatingException.
        public void setRating(int rating) throws InvalidRatingException
        {
            this.rating = rating;

        }

        //Returns rating value in a Song.
        public int getRating()
        {
            return this.rating;
        }

    public void setLength(String length) {
    }

    public void add(Song song) {
    }

    public int size() {
        return 0;
    }

    public playlist get(int index) {
        return null;
    }

    public void clear() {
    }


    public static class InvalidRatingException extends Exception {
    }
} //End class



