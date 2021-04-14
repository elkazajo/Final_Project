package model;

public class Composition {
    private Double duration;
    private String trackName;
    private String musicGenre;

    public Composition(Double length, String trackName, String musicGenre) {
        this.duration = length;
        this.trackName = trackName;
        this.musicGenre = musicGenre;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    @Override
    public String toString() {
        return "{" +
                "duration=" + duration +
                ", trackName='" + trackName + '\'' +
                ", musicGenre='" + musicGenre + '\'' +
                '}';
    }
}
