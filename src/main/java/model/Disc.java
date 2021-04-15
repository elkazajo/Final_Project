package model;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Disc {
    private List<Composition> burn = new ArrayList<>();

    public void burnTracksToDisc(Composition composition) {
        burn.add(composition);
    }

    public void totalDuration() {
        Double totalLength = 0.0;
        for (Composition composition : burn) {
            totalLength += composition.getDuration();
        }
        out.println("Overall music duration:\n" + totalLength + " minutes\n");
    }

    public void chooseTracksByMinutesDuration(int minutes) {
        out.println("Filter by duration:");
        int tracksFound = 0;
        for (Composition composition : burn) {
            if (composition.getDuration().intValue() == minutes) {
                out.println(composition);
                tracksFound++;
            }
        }
        if (tracksFound == 0) {
            out.println("Track wasn't found. Try again entering another duration.");
        }
        out.println("");
    }

    public void chooseTracksByGenre(String genre) {
        out.println("Filter by music genre:");
        int tracksFound = 0;
        for (Composition composition : burn) {
            if (composition.getMusicGenre().equals(genre)) {
                out.println(composition);
                tracksFound++;
            }
        }
        if (tracksFound == 0) {
            out.println("Track wasn't found. Try again entering another music genre.");
        }
        out.println("");
    }
}
