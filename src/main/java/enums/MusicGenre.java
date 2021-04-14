package enums;

public enum MusicGenre {
    RAP("Rap"), ROCK("Rock"), POP_LATINO("Pop-Latino"), FLAMENCO("Flamenco");

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
