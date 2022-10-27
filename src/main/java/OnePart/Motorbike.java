package OnePart;

public class Motorbike {
   String model;
   String color;
  int age;
  public Motorbike( String model,String color,int age){
    this.model = model;
    this.color = color;
    this.age = age;
  }
  public void info(){
    System.out.println("It's bike");
  }
  public int yearDifference(int inputYear){
    return inputYear - age;
  }
}
