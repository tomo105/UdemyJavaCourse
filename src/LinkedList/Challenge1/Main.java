package LinkedList.Challenge1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Nevermind", "Nirvana");
        album.addSong("Rape me", 3.45);
        album.addSong("Booze", 3.44);
        album.addSong("Something", 5.38);
        album.addSong("Lithium", 7.29);
        album.addSong("Heart", 2.41);
        album.addSong("Shaped", 1.42);
        album.addSong("Box", 2.45);
        albums.add(album);

        Album album1 = new Album("Hybrid Theory", "Linkin Park");
        album1.addSong("Runaway", 3.56);
        album1.addSong("In the end", 3.45);
        album1.addSong("Catalyst", 2.56);
        album1.addSong("Blackout", 3.09);
        album1.addSong("Graffiti", 2.43);
        albums.add(album1);

        LinkedList<Song> playlist = new LinkedList<Song>();
       albums.get(0).addToPlaylist("Box", playlist);
       albums.get(0).addToPlaylist("Booze", playlist);
       albums.get(0).addToPlaylist(4, playlist);

     //   albums.get(1).addToPlaylist(4, playlist);
     //   albums.get(1).addToPlaylist(3, playlist);

     play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in your album ");
            return;

        } else {
            System.out.println("You play " + listIterator.next().toString());
        }
    }

}
