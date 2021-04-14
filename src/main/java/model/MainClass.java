package model;

import enums.MusicGenre;

import static java.lang.System.*;

public class MainClass {
    public static void main(String[] args) {
        Disc disc = new Disc();
        disc.burnTracksToDisc(new Composition(4.12,"Despacito - Luis Fonsi", MusicGenre.POP_LATINO.getGenre()));
        disc.burnTracksToDisc(new Composition(4.47,"Still Loving You - Scorpions", MusicGenre.ROCK.getGenre()));
        disc.burnTracksToDisc(new Composition(3.58,"Como el Agua - Camaron de la Isla", MusicGenre.FLAMENCO.getGenre()));
        disc.burnTracksToDisc(new Composition(5.59,"Queen – Bohemian Rhapsody", MusicGenre.ROCK.getGenre()));
        disc.burnTracksToDisc(new Composition(3.56,"Shakira – Ojos Asi", MusicGenre.POP_LATINO.getGenre()));
        disc.burnTracksToDisc(new Composition(3.36,"Lola Flores - A tu vera", MusicGenre.FLAMENCO.getGenre()));
        disc.burnTracksToDisc(new Composition(5.34,"2pac feat Dr.Dre - California Love", MusicGenre.RAP.getGenre()));
        disc.burnTracksToDisc(new Composition(3.17,"Kris Kross - Jump", MusicGenre.RAP.getGenre()));

        disc.totalDuration();
        disc.chooseTracksByMinutesDuration(3);
        disc.chooseTracksByGenre("Flamenco");
    }
}
