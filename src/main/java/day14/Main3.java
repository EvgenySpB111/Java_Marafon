package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("people");
    if (!file.exists()) {
      try {
        throw new FileNotFoundException();
      } catch (FileNotFoundException e) {
        System.out.println("Файл не найден");
      }
    }

   try {
     System.out.println(parseFileToObjList(file));
   } catch (FileNotFoundException e){
     System.out.println("Файл не найден");
   }


  }
  public static List<Person> parseFileToObjList(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    List<Person> person = new ArrayList<>();
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String [] array = line.split(" ");
      int age = Integer.parseInt(array[1]);
      Person person1 = new Person(array[0],age );
      if( age < 0) {
        System.out.println("Некорректный входной файл");
        person.clear();
        break;
      } else{
        person.add(person1);
      }
    }
    return person;
  }




}