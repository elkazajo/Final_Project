package enums;

public enum MusicGenre {
    RAP("rap"), ROCK("rock"), POP_LATINO("pop-Latino"), FLAMENCO("flamenco");

    private final String genre;

    MusicGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "MusicGenre{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
