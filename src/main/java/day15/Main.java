package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
   File file = new File("CreateFile");
   if(! file.exists()) {
     try {
       throw new FileNotFoundException();
     } catch (FileNotFoundException e) {
       System.out.println("File not exist");
     }
   }
    PrintWriter pw = new PrintWriter(file);
   pw.println("Первая запись");
   pw.println("Вторая запись");

   pw.close();
   Scanner scanner = new Scanner(file);
   List<String> str = new ArrayList<>();
   while (scanner.hasNextLine()){
     str.add(scanner.nextLine());
   }
   scanner.close();
    System.out.println(str);




  }
}
