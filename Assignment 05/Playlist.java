class Playlist {
    public String name;
    public Song start;
    public Song end;
    public Song historyStart; // start of history link
    public int size;

    public Playlist(String name) {
        this.name = name;
        this.start = null;
        this.end = null;
        this.historyStart = null;
        this.size = 0;
        System.out.println(name + " created.");
    }

    // Display playlist information
    public void info() {
        System.out.println(name + " has the following songs:");
        if (start == null) {
            System.out.println("No songs in " + name + ".");
            return;
        }
        Song current = start;
        int count = 1;
        while (current != null) {
            System.out.println("Song-" + count);
            current.songInfo();
            current = current.next;
            count++;
        }
    }

    // Add a song to the end of the playlist
    public void addSong(Song song) {
        if (start == null) {
            start = song;
            end = song;
        } else {
            end.next = song;
            end = song;
        }
        size++;
        System.out.println(song.getTitle() + " added to " + name + ".");
    }

    // Add a song at a specific index
    public void addSong(Song song, int index) {
        if (index < 0 || index > size) {
            System.out.println("Cannot add song to Index " + index + ".");
            return;
        }
        if (index == 0) {
            song.next = start;
            start = song;
            if (size == 0) {
                end = song;
            }
        } else {
            Song current = start;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            song.next = current.next;
            current.next = song;
            if (song.next == null) {
                end = song;
            }
        }
        size++;
        System.out.println(song.getTitle() + " added to " + name + ".");
    }

    // Play a song by title
    public void playSong(String title) {
        Song current = start;
        while (current != null) {
            if (current.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Playing " + title + " by " + current.getArtist() + ".");
                addToHistory(current);
                return;
            }
            current = current.next;
        }
        System.out.println(title + " not found in playlist " + name + ".");
    }

    // Play a song by index
    public void playSong(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Song at Index " + index + " not found in " + name + ".");
            return;
        }
        Song current = start;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Playing " + current.getTitle() + " by " + current.getArtist() + ".");
        addToHistory(current);
    }

    // Delete a song by title
    public void deleteSong(String title) {
        if (start == null) {
            System.out.println(title + " not found in " + name + ".");
            return;
        }
        if (start.getTitle().equalsIgnoreCase(title)) {
            start = start.next;
            if (start == null) {
                end = null;
            }
            size--;
            System.out.println(title + " deleted from " + name + ".");
            return;
        }
        Song current = start;
        while (current.next != null && !current.next.getTitle().equalsIgnoreCase(title)) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println(title + " not found in " + name + ".");
        } else {
            current.next = current.next.next;
            if (current.next == null) {
                end = current;
            }
            size--;
            System.out.println(title + " deleted from " + name + ".");
        }
    }

    // Count total songs in the playlist
    public int totalSong() {
        return size;
    }

    // Merge another playlist into the current playlist
    public void merge(Playlist otherPlaylist) {
        if (otherPlaylist.start == null) {
            System.out.println("Nothing to merge. The other playlist is empty.");
            return;
        }
        if (this.start == null) {
            this.start = otherPlaylist.start;
            this.end = otherPlaylist.end;
        } else {
            this.end.next = otherPlaylist.start;
            this.end = otherPlaylist.end;
        }
        this.size += otherPlaylist.size;
        System.out.println("Merge Completed!");
    }

    // Show the history of played songs
    public void showHistory() {
        System.out.println("History of " + name + ":");
        if (historyStart == null) {
            System.out.println("No songs were played from " + name + ".");
            return;
        }
        Song current = historyStart;
        while (current != null) {
            current.songInfo();
            current = current.next;
        }
    }

    // Helper method to add a song to the history
    public void addToHistory(Song song) {
        Song historyNode = new Song(song.getTitle(), song.getArtist(), song.length);
        historyNode.next = historyStart;
        historyStart = historyNode;
    }
}