package Interface;

public class Warrior extends Hero implements PhysAttack{
   public Warrior(){
     physDef = 0.8;
     physAtt = 30;
   }


  @Override
  public String toString() {
    return "Warrior{" +
            "health=" + health +
            '}';
  }
}
