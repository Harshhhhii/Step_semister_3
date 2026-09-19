import java.util.Arrays;

public class Playlist {
    private String[] songs;
    private int count;

    public Playlist(int maxPlaylistSize) {
        this.songs = new String[maxPlaylistSize];
        this.count = 0;
    }

    public void addSong(String songTitle) {
        if (count < songs.length) {
            songs[count] = songTitle;
            count++;
        }
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, count);
    }

    public int getSongCount() {
        return count;
    }
}
