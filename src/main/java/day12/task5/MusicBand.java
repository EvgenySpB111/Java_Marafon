package day12.task5;

import java.util.List;

public class MusicBand {
private List<MusicArtist> artist;

public MusicBand( List<MusicArtist> artist){
  this.artist = artist;
}

  public List<MusicArtist> getArtist() {
    return artist;
  }

  public void setArtist(List<MusicArtist> artist) {
    this.artist = artist;
  }
  public static MusicBand transferMembers(MusicBand a, MusicBand b){
  for( int x = 0; x < b.artist.size(); x++){
    a.artist.add(b.artist.get(x));
    b.artist.remove(x);
  } return a;
  }
  public static void printMembers(MusicBand a){
    System.out.println(a);
  }
  public static MusicBand getMembers( MusicBand a){
  return a;
  }

  @Override
  public String toString() {
    return "MusicBand{" +
            "artist=" + artist +
            '}';
  }
}
