class Song {
    private String title;
    private String artist;
    public int length; // Length in minutes
    public Song next; // Reference to the next song in the playlist or history

    // Constructor
    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.next = null; // By default, there is no next song
    }

    // Display song information
    public void songInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Length: " + length + " minutes");
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }
}