package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        List<MusicArtist> blackpink = new ArrayList<>();
        blackpink.add(new MusicArtist("Jisoo", 28));
        blackpink.add(new MusicArtist("Jennie", 27));
        blackpink.add(new MusicArtist("Rose", 26));
        blackpink.add(new MusicArtist("Lisa", 26));

        MusicBand musicBand1 = new MusicBand("Blackpink", 2016, blackpink);

        List<MusicArtist> newJeans = new ArrayList<>();
        blackpink.add(new MusicArtist("Minji", 19));
        blackpink.add(new MusicArtist("Hanni", 18));
        blackpink.add(new MusicArtist("Danielle", 18));
        blackpink.add(new MusicArtist("Haerin", 17));
        blackpink.add(new MusicArtist("Hyein", 15));

        MusicBand musicBand2 = new MusicBand("NewJeans", 2022, newJeans);

        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
