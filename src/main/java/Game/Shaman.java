package Game;


public class Shaman extends Hero implements MagicAttack,Healer {
 int magicAtt = 15;
  public Shaman(){
    physAtt = 10;
    physDef = 0.2;
    magicDef = 0.2;
  }

  @Override
  public void healHimself() {
    if( hearth + 50 > 100){
      hearth = 100;
    } else{
      hearth += 50;
    }
  }

  @Override
  public void healTeammate(Hero hero) {
    if( hero.hearth + 30 > 100){
      hero.hearth = 100;
    } else{
      hero.hearth += 30;
    }
  }

  @Override
  public void magicalAttack(Hero hero) {
    double attack = magicAtt * ( 1 - hero.magicDef);
    if( hero.hearth - attack <= 0){
      hero.hearth = 0;
    } else {
      hero.hearth -= attack;
    }
  }

  @Override
  public String toString() {
    return "Shaman{" +
            "hearth=" + hearth +
            '}';
  }
}
