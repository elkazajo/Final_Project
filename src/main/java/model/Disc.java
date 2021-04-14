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
        out.println("Filter tracks by duration:");
        for (Composition composition : burn) {
            if (composition.getDuration().intValue() == minutes) {
                out.println(composition);
            }
        }
        out.println("");
    }

    public void chooseTracksByGenre(String genre) {
        out.println("Filter tracks by music genre:");
        for (Composition composition : burn) {
            if (composition.getMusicGenre().equals(genre)) {
                out.println(composition);
            }
        }
        out.println("");
    }
}
