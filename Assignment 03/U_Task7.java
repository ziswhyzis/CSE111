public class Movie {
    public String name;
    public String director;
    public double rating;
    public String actors = "";

    public void setMovieDetails(String name, String director, double rating) {
        setMovieDetails(name, director);
        this.rating = rating;
    }

    public void setMovieDetails(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public void updateRating(double rating) {
        this.rating = rating;
        System.out.println("Updated rating of \"Parasite\" to " + rating);
    }

    public void addActors(String actor) {
        actors += actor + ", ";
        System.out.println("Added actor \"" + actor + "\" to \"" + name + "\".");
    }

    public void addActors(String actor1, String actor2) {
        addActors(actor1);
        addActors(actor2);
    }

    public void addActors(String actor1, String actor2, String actor3) {
        addActors(actor1);
        addActors(actor2);
        addActors(actor3);
    }

    public void showInfo() {
        System.out.println("Title: " + name);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
        System.out.println("Actors: " + actors);
    }
}