package ua.com.lozinska.my_project;

public class Movie {
    private int movieYear;
    private String movieName;
    private MovieGenre movieGenre;
    private double movieRating;
    private int voteCounter;
    private String movieDescription;

    public Movie(int movieYear, String movieName, MovieGenre movieGenre,
                 double movieRating, int voteCounter, String movieDescription) {
        this.movieYear = movieYear;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.movieRating = movieRating;
        this.voteCounter = voteCounter;
        this.movieDescription = movieDescription;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    public int getVoteCounter() {
        return voteCounter;
    }

    public void setVoteCounter(int voteCounter) {
        this.voteCounter = voteCounter;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    @Override
    public String toString() {
        return "Movie: " + movieName + ". Year: " + movieYear + ". Genre: " + movieGenre
                + ". Rating: " + movieRating + ". Count of votes: "
                + voteCounter + ". Description: " + movieDescription;
    }
}
