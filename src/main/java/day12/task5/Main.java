package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Задание 5");
    MusicBand band1 = new MusicBand(new ArrayList<>(Arrays.asList(new MusicArtist("Jeka","Krasava"
    ,28),new MusicArtist("Albus","Fric",28))));
    MusicBand band2 = new MusicBand(new ArrayList<>(Arrays.asList(new MusicArtist("Vovan","Albuk",38))));
    System.out.println("Первая группа :" + band1);

    MusicBand.printMembers(MusicBand.getMembers(MusicBand.transferMembers(band1,band2)));
    System.out.println("Вторая группа :" + band2);




  }
}
