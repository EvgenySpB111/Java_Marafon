package day12;

import day12.task4.MusicArtist;
import day12.task4.MusicBand;
import day12.task5.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Задание 1");
    List<String> markAuto = new ArrayList<>();
    markAuto.add("Audi");
    markAuto.add("BMW");
    markAuto.add("Mercedes-Benz");
    markAuto.add("Ford");
    markAuto.add("Volvo");
    System.out.println(markAuto);
    markAuto.add(3, "Honda");
    markAuto.remove(0);
    System.out.println(markAuto);
    System.out.println();

    System.out.println("Задание 2");
    List<Integer> numbers = new ArrayList<>();
    fieldList(0,30,numbers);
    fieldList(300,350,numbers);
    System.out.println(numbers);

    System.out.println("Задание 4");
    MusicBand musicBand = new MusicBand(new ArrayList<>(Arrays.asList(new MusicArtist("Jeka","Smorz"),new MusicArtist
            ("Albus","Fric"),new MusicArtist("Albuk","Vovan"))));
    MusicBand musicBand1 = new MusicBand(new ArrayList<>(Arrays.asList(new MusicArtist("Vitek","Rurva"),
            new MusicArtist("Valir","Osel"))));
  List<MusicBand> list = musicBand.getMember(MusicBand.transferMembers(musicBand,musicBand1));
  musicBand.printMembers(list);

  }
  public static List<Integer> fieldList(int from, int before, List<Integer> list) {
    for (int x = from; x <= before; x++) {
      if (x % 2 == 0) {
        list.add(x);
      }
    }
    return list;
  }

}