package model;

import enums.MusicGenre;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

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

        out.println("Please, enter track duration by minute to filter tracks by minute duration:");
        int minutes = scanner.nextInt();
        disc.chooseTracksByMinutesDuration(minutes);

        out.println("Please, input your favorite music genre to filter tracks by genre of music:");
        String genre = scanner.next();
        disc.chooseTracksByGenre(genre.toLowerCase(Locale.ROOT));
    }
}
