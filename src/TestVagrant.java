import java.util.*;

class RecentlyPlayedStore {
    private final int initialCapacity;
    private final int maxSongsPerUser;
    private final Map<String, LinkedList<String>> userSongMap;

    public RecentlyPlayedStore(int initialCapacity, int maxSongsPerUser) {
        this.initialCapacity = initialCapacity;
        this.maxSongsPerUser = maxSongsPerUser;
        this.userSongMap = new LinkedHashMap<>(initialCapacity, 0.75f, true);
    }

    public void playSong(String user, String song) {
        userSongMap.putIfAbsent(user, new LinkedList<>());

        LinkedList<String> songsList = userSongMap.get(user);

        if (songsList.size() >= maxSongsPerUser) {
            songsList.removeFirst(); // Remove the least recently played song
        }

        songsList.addLast(song); // Add the new song at the end
    }

    public List<String> getRecentlyPlayedSongs(String user) {
        return userSongMap.getOrDefault(user, new LinkedList<>());
    }
}

public class TestVagrant {
    public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3, 3);

        store.playSong("user1", "S1");
        store.playSong("user1", "S2");
        store.playSong("user1", "S3");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // [S1, S2, S3]

        store.playSong("user1", "S4");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // [S2, S3, S4]

        store.playSong("user1", "S2");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // [S3, S4, S2]

        store.playSong("user1", "S1");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // [S4, S2, S1]
    }
}
