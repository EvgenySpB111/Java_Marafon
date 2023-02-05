package day18;

import org.apache.commons.lang3.StringUtils;

public class Demo {
  public static void main(String[] args) {

    System.out.println(addDigits(9999));



  }
  public static int addDigits(int num){
    String str = String.valueOf(num);
    int sum = 0;
    if(num < 0) return 0;
    else if (str.length() == 1 ) return num;
    else if (str.length() >= 2) {
        String numFor = "";
      for( int x = 0; x < str.length(); x ++){
        char y = str.charAt(x);
        numFor = String.valueOf(y);
        sum += Integer.parseInt(numFor);
      }
      str = String.valueOf(sum);
      if(str.length() > 1) {
        numFor = "";
        sum = 0;
     for( int x = 0; x < str.length(); x++) {
          char y = str.charAt(x);
          numFor = String.valueOf(y);
          sum += Integer.parseInt(numFor);
        }
       str = String.valueOf(sum);
        if( str.length() > 1){
          numFor = "";
          sum = 0;
        for( int x = 0; x < str.length(); x++) {
          char y = str.charAt(x);
          numFor = String.valueOf(y);
          sum += Integer.parseInt(numFor);

        }
      }
    }
    }
    return sum;
  }



    public static String encrypt (String str){
      String response = "";
      int y = 0;
      int z = 1;
      if (str.length() % 2 == 0) {
        for (int x = 0; x < str.length(); x += 2) {
          response += str.charAt(z);
          response += str.charAt(y);
          y += 2;
          z += 2;
        }
      }
      if (str.length() % 2 != 0) {
        for (int x = 0; x < str.length(); x += 2) {
          if (x == str.length() - 1) {
            response += str.charAt(str.length() - 1);
            break;
          }
          response += str.charAt(z);
          response += str.charAt(y);
          y += 2;
          z += 2;
        }
      }
      return response;
    }


    public static void fib ( int x){
      int a = 0;
      int b = 1;
      int y = 2;

      if (x == b) {
        System.out.println(0);
      } else if (x == y) {
        System.out.println(1);
      } else if (x > 1) {
        int c = 0;
        for (int i = 2; i < x; i++) {
          c = a + b;
          a = b;
          b = c;
        }
        System.out.println(c);
      }
    }
  }


