package OnePart;

public class TestFigures {
  public static void main(String[] args) {
    Figure[] figures = {
            new Triangle("Red", 10, 10, 10),
            new Triangle("Green", 20, 30, 10),
            new Triangle("Red", 20, 15, 10),
            new Rectangle("Red", 10, 5),
            new Rectangle("Orange", 15, 40),
            new Circle("Red", 4),
            new Circle("Red", 10),
            new Circle("Blue", 5)
    };
    System.out.println("Сумма периметров красных фигур  : " + calculateRedPerimeter(figures));
    System.out.println("Сумма  площадей красных фигур  :" + calculateRedArea(figures));


  }

  public static double calculateRedPerimeter(Figure[] figures) {
    double sum = 0;
    for (int x = 0; x < figures.length; x++) {
      if (figures[x].getColor().equals("Red"))  sum +=  figures[x].perimeter();
    }
    return sum;
  }
  public static double calculateRedArea(Figure[] figures){
    double sumArea= 0;
    for( int x = 0; x < figures.length; x ++){
      if(figures[x].getColor().equals("Red")) sumArea += figures[x].area();
    }
    return sumArea;
  }

}

