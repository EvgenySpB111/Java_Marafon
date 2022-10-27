package day12.task4;

import java.util.List;

public class MusicBand {

 private List<MusicArtist> player ;

 public MusicBand( List<MusicArtist> player){

  this.player = player;
 }


 public List<MusicArtist> getPlayer() {
  return player;
 }

 public void setPlayer(List<MusicArtist> player) {
  this.player = player;
 }
 static public MusicBand transferMembers (MusicBand a,MusicBand b) {
 for(int x =0; x < b.player.size(); x++){
  a.player.add(b.player.get(x));
 }
return a;
 }
  public void printMembers(List<MusicBand> list) {
   System.out.println(list);
  }
  public List getMember(MusicBand a){
  return a.player;
  }

 @Override
 public String toString() {
  return "MusicBand{" +
          "player=" + player +
          '}';
 }
}

