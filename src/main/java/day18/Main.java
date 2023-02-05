package day18;

public class Main {
  public static void main(String[] args) {
    System.out.println(print(0));

  }
  static public int print(int x) {
    if (x == 0) {
      return 1;
    }
  return x * print(  x - 1);

  }
}