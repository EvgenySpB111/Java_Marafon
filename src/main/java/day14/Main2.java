package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("people");
    if (!file.exists()) {
      try {
        throw new FileNotFoundException();
      } catch (FileNotFoundException e) {
        System.out.println("Файл не найден");
      }
    }
    System.out.println(parseFileToStringList(file));
  }


    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
     Scanner scanner = new Scanner(file);
     List<String> people = new ArrayList<>();
     while (scanner.hasNextLine()){
       String s1 = scanner.nextLine();
       String [] array = s1.split(" ");
       int age = Integer.parseInt(array[1]);
        if( age < 0){
          try {
            throw new ArithmeticException();
          }catch (ArithmeticException e){
            System.out.println("Некорректный входной файл");
          }
          people.clear();
           break;
        } else {
          people.add(s1);
        }
     }
     scanner.close();
     return people;
  }


}

