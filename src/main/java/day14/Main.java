package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("Test2");

      if (file.exists()) System.out.println("File exist");
     else {
        try {
          throw new FileNotFoundException();
        }catch (FileNotFoundException e){
          System.out.println("File not found");
        }
      }
     try{
       printSumDigits(file);
     }catch (FileNotFoundException e){
       System.out.println("File not exist");
     }



  }
  public static void printSumDigits(File file) throws FileNotFoundException {
 Scanner scanner = new Scanner(file);
  String line = scanner.nextLine();
  String[] number = line.split(" ");
    try {
  int [] numbers = new int[10];
  int sum = 0;
    for( int x = 0 ; x < number.length; x++){
      numbers[x] = Integer.parseInt(number[x]);
    }
    for( int x = 0 ; x < numbers.length; x++) {
     sum += numbers[x];
    }
      if( numbers.length == 10) {
        System.out.println(sum);
      }
    }catch (Exception e) {
      System.out.println("Некорректный входной файл");
    }
    scanner.close();
  }

  }
