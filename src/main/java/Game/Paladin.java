package Game;

public class Paladin extends Hero implements Healer {

  public Paladin(){
    physAtt = 15;
    physDef = 0.5;
    magicDef = 0.2;
  }

  @Override
  public void healHimself() {
  if( hearth + 25 > 100){
    hearth = 100;
  } else{
    hearth += 25;
  }
  }

  @Override
  public void healTeammate(Hero hero) {
   if( hero.hearth + 10 > 100){
     hero.hearth = 100;
   } else{
     hero.hearth += 10;
   }
  }

  @Override
  public String toString() {
    return "Paladin{" +
            "hearth=" + hearth +
            '}';
  }
}
