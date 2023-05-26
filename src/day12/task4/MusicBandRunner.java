package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBandRunner {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("YEJI");
        members1.add("LIA");
        members1.add("CHAERYEONG");
        members1.add("YUNA");

        MusicBand musicBand1 = new MusicBand("Itzy", 2019, members1);
        //musicBand1.printMembers();
        musicBand1.addMember("RYUJIN");
        //musicBand1.printMembers();

        List<String> members2 = new ArrayList<>();
        members2.add("KARINA");
        members2.add("WINTER");
        members2.add("NINGNING");
        members2.add("GISELLE");

        MusicBand musicBand2 = new MusicBand("Aespa", 2020, members2);
        musicBand2.removeMember("GISELLE");
        //musicBand2.printMembers();
        musicBand2.addMember("GISELLE");

        MusicBand.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
