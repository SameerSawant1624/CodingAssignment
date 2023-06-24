package Javacode;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RecentlyPlayedStore {
	private final int capacity;
	private Map<String, LinkedList<String>> userSongMap;

	public RecentlyPlayedStore(int capacity) {
		this.capacity = capacity;
		this.userSongMap = new HashMap<>();
	}

	public void addSong(String user, String song) {
		if (!userSongMap.containsKey(user)) {
			userSongMap.put(user, new LinkedList<String>());
		}

		LinkedList<String> playlist = userSongMap.get(user);
		playlist.remove(song); // Remove if song already exists
		playlist.addFirst(song);

		if (playlist.size() > capacity) {
			playlist.removeLast();
		}
	}

	public List<String> getRecentlyPlayedSongs(String user) {
		return userSongMap.getOrDefault(user, new LinkedList<String>());
	}

}
