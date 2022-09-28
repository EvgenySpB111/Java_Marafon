package Interface;

public class Paladin extends Hero implements PhysAttack,Healer{
 public Paladin(){
   physDef = 0.50;
   magicDef = 0.20;
   physAtt = 15;

 }

  @Override
  public void healHimself() {
  if( health >= 75){
    health = 100;
  }else {
    health += 25;
  }
  }

  @Override
  public void healTeammate(Hero hero) {
    if( hero.health >= 90){
      hero.health = 100;
    }else {
      hero.health += 10;
    }

  }
  @Override
  public String toString() {
    return "Paladin{" +
            "health=" + health +
            '}';
  }
}
