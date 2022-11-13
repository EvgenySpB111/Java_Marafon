package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("shoes.csv");
    if(! file.exists()){
      try {
        throw new FileNotFoundException();
      } catch (FileNotFoundException e) {
        System.out.println("File not exist");
      }
    }
    File file2 = new File("missing_shoes.txt");
    if(! file2.exists()){
      try {
        throw new FileNotFoundException();
      } catch (FileNotFoundException e) {
        System.out.println("File not exist");
      }
    }
    Scanner scanner = new Scanner(file);
    PrintWriter printWriter = new PrintWriter(file2);

    while (scanner.hasNextLine()){
      String line = scanner.nextLine();
      String[] quantity = line.split(";");
      int number = Integer.parseInt(quantity[2]);
        if(number == 0) {
          printWriter.println(line);
        }
    }
    scanner.close();
    printWriter.close();

  }
}
