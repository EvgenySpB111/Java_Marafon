package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args)  {
    File file = new File("Test2");
    printResult(file);


  }
static public void printResult(File file) {
 try {
   Scanner scanner = new Scanner(file);
   int x = 0;
   String line = scanner.nextLine();
   String[] number = line.split(" ");
   List<Integer> numbers = new ArrayList<>();
   for( int y = 0; y < number.length; y++){
    numbers.add(x,Integer.parseInt(number[x++]));
   }
   double z = 0;
   for(int s = 0; s < numbers.size(); s++){
     z += numbers.get(s);
   }
   DecimalFormat df = new DecimalFormat("##.###");
   System.out.println(z/numbers.size() + " --> " + df.format(z/numbers.size()));
 }catch (FileNotFoundException e) {
   System.out.println("File not Found");
 }
}



}
