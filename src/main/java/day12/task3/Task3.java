package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
  public static void main(String[] args) {
    MusicBand musicBand =  new MusicBand("band" ,2022);
    MusicBand musicBand1 = new MusicBand("band1",1998);
    MusicBand musicBand2 = new MusicBand("band2",1990);
    MusicBand musicBand3 = new MusicBand("band3",2001);
    MusicBand musicBand4 = new MusicBand("band4",2020);
    MusicBand musicBand5 = new MusicBand("band5",1992);
    MusicBand musicBand6 = new MusicBand("band6",1989);
    MusicBand musicBand7 = new MusicBand("band7",2006);
    MusicBand musicBand8 = new MusicBand("band8",2007);
    MusicBand musicBand9 = new MusicBand("band9",2015);
    MusicBand musicBand10 = new MusicBand("band10",2000);
    MusicBand musicBand11 = new MusicBand("band10",2017);
    MusicBand musicBand12 = new MusicBand("band10",2003);
    
    List<MusicBand> bands = new ArrayList<>();
    bands.add(musicBand);
    bands.add(musicBand1);
    bands.add(musicBand2);
    bands.add(musicBand3);
    bands.add(musicBand4);
    bands.add(musicBand5);
    bands.add(musicBand6);
    bands.add(musicBand7);
    bands.add(musicBand8);
    bands.add(musicBand9);
    bands.add(musicBand10);
    bands.add(musicBand11);
    bands.add(musicBand12);

    Collections.shuffle(bands); //перемешиваем список

    System.out.println("Первый список :");
    System.out.println(bands);

    System.out.println("Второй список :");
    System.out.println(groupsAfter2000(bands));
    System.out.println("Колличество групп :" + groupsAfter2000(bands).size());

    }
  public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
    List<MusicBand> bandsFrom2000 = new ArrayList<>();
   for( int x = 0; x < bands.size(); x++){
     if( bands.get(x).getAge() > 2000){
       MusicBand musicBand = new MusicBand(bands.get(x).getName(),bands.get(x).getAge());
       bandsFrom2000.add(musicBand);
     }
   }
   return bandsFrom2000;
  }

  }



