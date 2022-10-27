package Game;

 abstract class Hero implements PhysAttack {
  int hearth ;
  int physAtt;
  double physDef;
  double magicDef;

  public Hero(){
    hearth = 100;
  }


   @Override
   public void physicalAttack(Hero hero) {
    double attack = physAtt * ( 1 - hero.physDef);
    if( hero.hearth - attack <= 0){
      hero.hearth = 0;
    } else {
      hero.hearth -= attack;
    }
   }
 }
