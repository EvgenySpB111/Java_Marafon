package Interface;

public class Magician extends Hero implements MagicAttack{

 int magicAtt = 20;
  public Magician() {
    physDef = 0;
    magicDef = 0.8;
    physAtt = 5;

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
    return "Magician{" +
            "health=" + health +
            '}';
  }
}
