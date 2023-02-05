package io.hexlet.app;

import io.hexlet.counter.Counter;

public class App {
  public static void main(String[] args) {
    System.out.println(greaterThan("hgHH","Kkk"));


  }
  public static boolean greaterThan(String str , String str2) {
   if(Counter.bigLettersCount(str) > Counter.bigLettersCount(str2)) {
     return true;
   }else{
     return false;
   }
  }
}
