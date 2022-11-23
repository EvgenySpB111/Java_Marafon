package day16;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class Task2 {
  public static void main(String[] args) throws IOException {
    File file = new File("file1.txt");
    File file2 = new File("file2.txt");

    Random random = new Random();
    PrintWriter pw1 = new PrintWriter(file);
    PrintWriter pw2 = new PrintWriter(file2);
    Scanner scanner = new Scanner(file);

    for (int x = 0; x < 1000; x++) {
      int num = random.nextInt(100) + 0;
      pw1.println(num);
    }
    pw1.close();

    List<Integer> numbers = new ArrayList<>();
    int x = 0;
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] num = line.split("\\n");

      int number = Integer.parseInt(num[0]);
      numbers.add(x, number);
      x++;
    }
    int from = 0;
    int before = 20;
    int sum = 0;

    for (int w = 0; w < numbers.size() / 20; w++) {
      for (int q = 0; q < numbers.size(); q++) {
        if (q >= from && q < before) {
          sum += numbers.get(q);
        }
      }
      pw2.println((double) sum / 20);
      from = from + 20;
      before = before + 20;
      sum = 0;
    }
    pw2.close();
    scanner.close();

    printResult(file2);


  }

  public static void printResult(File file) throws IOException {
 Scanner scanner = new Scanner(file);

    double sum1 = 0.0;
    int sum= 0;

 while (scanner.hasNextLine()) {
   String line = scanner.nextLine();
   String [] num = line.split("\\n");
   double num1 = Double.parseDouble(num[0]);
   sum1 += num1;
   sum =(int)sum1;

 }
    scanner.close();
    System.out.println("Сумма всех вещественных чисел из Файла 2 : " + sum);

  }
}