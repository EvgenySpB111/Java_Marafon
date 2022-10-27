package OnePart;

public class Airplane {
  String manufacturer;
  int year;
  int length;
  int weight;
  int fuel = 0; //количество топлива в баке

  public Airplane(String manufacturer, int year,int length, int weight){
    this.manufacturer = manufacturer;
    this.year = year;
    this.length = length;
    this.weight = weight;
  }


  public void setManufacturer(String manufacturer){
    this.manufacturer = manufacturer;
  }
  public void setYear( int year){
    this.year = year;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public void setWeight( int weight){
    this.weight = weight;
  }
  public void setFuel( int fuel){
    this.fuel = fuel;
  }
  public int getFuel(){
    return fuel;
  }
  public void info(){
    System.out.println("Изготовитель: "+manufacturer+ ", год выпуска: "+year
            + ", длина: "+length+ ", вес: "+weight+", количество топлива в баке: "+ fuel);
  }
  public void fillUp ( int fuelUp){
     fuel= fuel + fuelUp;
  }
  static void compareAirplanes (Airplane a,Airplane b){
    if(a.length > b.length) System.out.println(a.manufacturer + " самый длинный самолет.");
    else System.out.println(b.manufacturer + " самый длинный самолет.");
  }
  public String toString(){
     String info ="Изготовитель: "+manufacturer+ ", год выпуска: "+year
            + ", длина: "+length+ ", вес: "+weight+", количество топлива в баке: "+ fuel;
     return info;
  }
}
