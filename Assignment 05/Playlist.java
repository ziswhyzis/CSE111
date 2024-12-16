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

    public void info() {
        System.out.println(name + " has the following songs:");
        if (start == null) {
            System.out.println("No songs in " + name + ".");
        } else {
            Song temp = start;
            int count = 1;
            while (temp != null) {
                System.out.println("Song-" + count);
                temp.songInfo();
                temp = temp.next;
                count++;
            }
        }
    }

    public void addSong(Song song) {
        if (start == null) {
            start = song;
            end = song;
            System.out.println(song.title + " added to " + name + ".");
        } else {
            end.next = song;
            end = song;
            System.out.println(song.title + " added to " + name + ".");
        }
        size++;
    }

    public void addSong(Song song, int index) {
        if (index > size) {
            System.out.println("Cannot add song to Index " + index + ".");
        } else if (index == 0) {
            song.next = start;
            start = song;
            System.out.println(song.title + " added to " + name + ".");
        } else {
            Song temp = start;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            song.next = temp.next;
            temp.next = song;
            System.out.println(song.title + " added to " + name + ".");
        }
        size++;
    }

    public void playSong(String n) {
        Song temp = start;
        while (temp != null) {
            if (temp.title == n) {
                System.out.println("Playing " + n + " by " + temp.artist + ".");
                addHistory(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println(n + " not found in playlist " + name + ".");
    }

    public void playSong(int index) {
        if (index >= size) {
            System.out.println("Song at Index " + index + " not found in " + name + ".");
        } else {
            Song temp = start;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            System.out.println("Playing " + temp.title + " by " + temp.artist + ".");
            addHistory(temp);
        }
    }

    public void deleteSong(String n) {
        Song temp = start;
        while (temp.next != null && !(temp.next.title == n)) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println(n + " not found in " + name + ".");
        } else {
            temp.next = temp.next.next;
            size--;
            System.out.println(n + " deleted from " + name + ".");
        }
    }

    public int totalSong() {
        return size - 1;
    }

    public void merge(Playlist other) {
            this.end.next = other.start;
            this.end = other.end;
        this.size += other.size;
        System.out.println("Merge Completed!");
    }

    // ungraded
    public void showHistory() {
        System.out.println("History of " + name + ":");
        Song temp = historyStart;
        while (temp != null) {
            temp.songInfo();
            temp = temp.next;
        }
    }

    public void addHistory(Song song) {
        Song history = new Song(song.title, song.artist, song.length);
        history.next = historyStart;
        historyStart = history;
    }
}