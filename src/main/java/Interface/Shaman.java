package Interface;

public class Shaman extends Hero implements MagicAttack,Healer{
 int magicAtt = 15;
  public Shaman(){
     physAtt = 10;
     physDef = 0.2;
     magicDef = 0.2;
  }

  @Override
  public void healHimself() {
    if( health >= 50){
      health = 100;
    }else {
      health += 50;
    }
  }

  @Override
  public void healTeammate(Hero hero) {
    if( hero.health >= 70){
      hero.health = 100;
    }else {
      hero.health += 30;
    }
  }

  @Override
  public void magicalAttack(Hero hero) {
    double attack = magicAtt * ( 1 - hero.magicDef);
    if (hero.health - attack < 0) {
      hero.health = 0;
    } else {
      hero.health -= attack;
    }
  }

  @Override
  public String toString() {
    return "Shaman{" +
            "health=" + health +
            '}';
  }
}
