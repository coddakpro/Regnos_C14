//package PlaylistMedia;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.text.MessageFormat;
//import java.util.Scanner;
//import java.util.stream.IntStream;
//
//public class Menu<Playlist, songSelection> {
//
//    private final Scanner scan = new Scanner(System.in);
//    private Playlist playlist;
//    private final String Song;
//
//
//    public Menu(String song) {
//        Song = song;
//        final Playlist playlist = this.playlist;
//    }
//
//    //    display a menu, prompt for user input (int selection), and returns input.
//    public int showMenu() {
//        int selection;
//
//        System.out.print("""
//
//                What would you like to do?
//                1- Add song
//                2- view playlist
//                3- update song
//                4- remove song
//                5- Delete playlist
//                6- Exist
//                Selection:\s""");
//        selection = scan.nextInt();
//        System.out.print("\n");
//
//        return selection;
//    }
//
//    //    Displays menu from show menu(): contains a switch,
////    executes case based on returned int from showMenu().
//    public void runMenu() {

//
//        int selection = showMenu();
//
//        switch (selection) {
//            case 1 -> {
//                addSong();
//                savePlaylist();
//                runMenu();
//            }
//            case 2 -> {
//                viewPlaylist();
//                runMenu();
//            }
//            case 3 -> {
//                updateSong();
//                savePlaylist();
//                runMenu();
//            }
//            case 4 -> {
//                removeSong();
//                savePlaylist();
//                runMenu();
//            }
//            case 5 -> {
//                runMenu();
//            }
//            case 6 -> {
//                savePlaylist();
//                System.exit(0);
//            }
//            default -> {
//                System.out.println("\nThat is not a valid selection!\n");
//                runMenu();
//            }
//        }
//
//    }
//
////    create a new song with user to input for artist, title,
////    length, genre, rating, adds songs to a playlist.
///* I had a lot of trouble getting the scanner get the input and assign it correctly.
// * Someone suggested I utilize scanner.reset(), but I'd get a scanner exception. This way worked.*/
//
// public Playlist addSong() {
//
//    Song song = new Song(null, null, 0, null, 0);
//    song.setArtist(scan.nextLine());
//    System.out.print("Enter artist: ");
//    song.setArtist(scan.nextLine());
//    System.out.print("Enter title: ");
//    song.setTitle(scan.nextLine());
//    do {
//        try {
//            System.out.print("Enter length: ");
//            song.setLength(scan.next());
//        } catch (InvalidLengthException invalidLength) {
//            System.out.print(invalidLength);
//            System.out.print("Enter length as \"minutes:seconds\".\n");
//        }
//    } while (song.getLength() == null);
//
//    song.setGenre(scan.nextLine());
//    System.out.print("Enter genre: ");
//    song.setGenre(scan.nextLine());
//    boolean flag = false;
//    do {
//        try {
//            System.out.print("Enter rating: ");
//            song.setRating(scan.nextInt());
//            flag = true;
//        } catch (Song.InvalidRatingException invalidRating) {
//            System.out.print(invalidRating);
//        }
//    } while (!flag);
//
//    song = (Song) addSong();
//    Song songs = song;
//
//    final String song1 = Song;
//    return (Playlist) song;
//
//}

//    //    Formats and displays all songs in playlist.
//    private void viewPlaylist() {
//        if (playlist != getPlaylistSize() != 0) {
//            System.out.println("\nPlaylist empty!");
//        } else {
//            IntStream.iterate(0,
//                    this::test,
//                    i -> i + 1).forEach(this::accept);
//            System.out.print("\n");
//        }
//    }
//
//    private int getPlaylistSize() {
//        return 0;
//    }
//
//    //Displays Playlist; prompts user to select song,
//    //asks which variable of song they would like to update,
//    //asks for input for that variable to update.
//    public <PlaylistMedia> void updateSong() {
//        if (playlist) {
//            final boolean b = getPlaylistSize() == 0;
//        } else {
//            final boolean b = getPlaylistSize() == 0;
//        }  {
//            System.out.println("\nPlaylist empty!");
//        } else {
//            viewPlaylist();
//            System.out.print("\nPlease select a song to update: ");
//            int songSelection = scan.nextInt();
//
//            System.out.print("\nWhat would you like to update?\n" + "1- Artist\n" + "2- Title\n"
//                    + "3- Length\n" + "4- Genre\n" + "5- Rating\n" + "Selection: ");
//
//            int updateSelection = scan.nextInt();
//
//            PlaylistMedia playlist ;
//            switch (updateSelection) {
//                case 1 -> {
//                    System.out.print("Enter artist: ");
//                    String artist = scan.next();
//
//                } case 2 -> {
//                    System.out.print("Enter title: ");
//                    String title = scan.next();
//                }
//                case 3 -> {
//                    boolean lengthFlag = false;
//                    do {
//                        System.out.print("Enter Length: ");
//                        songSelection length;
//                        lengthFlag = true;
//                    } while (lengthFlag);
//                } case 4 -> {
//                    System.out.print("Enter genre: ");
//                    String genreSelection1 = scan.nextLine();
//                }
//                case 5 -> {
//                    boolean ratingFlag = false;
//                    do {
//                        System.out.print("Enter rating: ");
//                        int rating = scan.nextInt();
//                        ratingFlag = true;
//                    } while (!ratingFlag);
//                } default -> {
//                    System.out.println("\nThat is not a valid selection!\n");
//                    runMenu();
//                }
//            }
//        }
//    }
//
//    //Displays Playlist; prompts user to select Song to delete and removes it from Playlist.
//    public void removeSong() {
//        if (playlist < getPlaylistSize; playlistMedia() != 0) {
//            viewPlaylist();
//            boolean flag = false;
//            do {
//                System.out.print("\nSelect a song to remove: ");
//                int removeSelection = scan.nextInt();
//
//                if (!(removeSelection < playlist || !playlist) = getPlaylistSize()))
//                    System.out.print("That is not a valid selection!\n");
//                else if (removeSelection > playlist || ) {
//                    System.out.print("That is not a valid selection!\n");
//                } else {
//                    playlist removeSong(--removeSelection);
//                    flag = true;
//                }
//            } while (!flag);
//        } else if (){
//            System.out.println("\nPlaylist is empty!");
//        }
//    }
//
//    private int playlistMedia() {
//        return extracted();
//    }
//
//    public int extracted() {
//        return 0;
//    }
//
//    private void getPlaylistSize(Playlist playlist) {
//    }
//
//    //Write the contents of Playlist to a file called playlist
//
//
//    private void savePlaylist() {
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("playlist");
//
//            ObjectOutputStream outObjectStream = new ObjectOutputStream(fileOutputStream);
//
//            outObjectStream.writeObject(playlist);
//
//            outObjectStream.flush();
//            outObjectStream.close();
//        } catch (FileNotFoundException fnfException) {
//            System.out.println("No file");
//        } catch (IOException ioException) {
//            System.out.println("bad IO");
//        }
//
//    }
//
//
//
//
//    public void loadPlaylist() {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("playlist");
//
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//            playlist = (Playlist) objectInputStream.readObject();
//
//            objectInputStream.close();
//        } catch (FileNotFoundException fnfException) {
//            System.out.println("No File");
//        } catch (IOException ioException) {
//            System.out.println("IO no good");
//        } catch (ClassNotFoundException cnfException) {
//            System.out.println("This is not a Playlist.");
//        }
//
//    }
//
//    private void accept(int i) {
//        System.out.print("\n#" + (i + 1) + " ");
//        System.out.print("" + playlist.getArtist(i) + " - ");
//        System.out.print("\"" + playlist.getTitle(i) + "\"" + ", ");
//        System.out.print(new StringBuilder().append(playlist.getLength(i)).append(", ").toString());
//        System.out.print(playlist getGenre(i) + ", ");
//        System.out.print(playlist.toString()MessageFormat.format("{0} out of 5", new Object[]{getRating(i)}));
//    }
//
//    private Object getGenre(int i) {
//    }
//
//    private Object getRating(int i) {
//        return null;
//    }
//
//    private boolean test(int i) {
//        return i < playlist, getPlaylistSize();
//    }
//}
//
////End class
//
//
//
//
//
//
//
