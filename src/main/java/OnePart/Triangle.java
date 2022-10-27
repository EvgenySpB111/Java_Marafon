package OnePart;

public class Triangle extends Figure{
  double length1;
  double length2;
  double length3;

  public Triangle(String color, double length1,double length2 , double length3){
    super(color);
    this.length1 = length1;
    this.length2 = length2;
    this.length3 = length3;
  }

  @Override
  public double area() {
  double per = (length1 + length2 + length3)/2;
  double per2 = per*(per - length1)*(per - length2)*(per - length3);
  return Math.sqrt(per2);
  }

  @Override
  public double perimeter() {
 return length1 + length2 + length3;
  }
}
