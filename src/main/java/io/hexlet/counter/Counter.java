package io.hexlet.counter;

public class Counter {
  public static void main(String[] args) {
    System.out.println(bigLettersCount("kjkKKKLjj"));


  }
  public static int bigLettersCount(String text){
   int num = 0;
    for(int x = 0; x < text.length(); x ++) {
      if( text.charAt(x) == text.toUpperCase().charAt(x)){
        num++;
      }
    }
   return num;
  }
}
