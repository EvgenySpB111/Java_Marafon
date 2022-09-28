package Game;

public class Magician extends Hero implements MagicAttack{
    int magicAtt = 20;
  public Magician(){
    physAtt = 5;
    physDef = 0;
    magicDef = 80;
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
    return "Magician{" +
            "hearth=" + hearth +
            '}';
  }
}
