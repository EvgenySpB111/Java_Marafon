package OnePart;

public class Car {

  private String model;
  private int age ;
  private String color;


  public void setModel(String model){
    if( model.equals("Audi")){
      System.out.println("Ошибка");
    }else {
      this.model = model;
    }
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setAge( int age){
    this.age = age;
  }

  public String getModel(){
    return model;
  }
  public String getColor(){
    return color;
  }
  public int getAge(){
    return age;
  }
  void info(){
    System.out.println("It's  auto");
  }
  public int yearDifference(int inputYear){
    return inputYear - age;
  }

}
