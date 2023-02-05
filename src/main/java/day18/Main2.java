package day18;


public class Main2 {
  public static void main(String[] args) {
    int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
    int sum = 0;
    for( int x = 0; x < numbers.length; x++){
      sum += numbers[x];
    }
    System.out.println("Решение циклом :" + sum);
    System.out.println(recursionSum(numbers,0));
    System.out.println("----------");
    count10("717771237");
    System.out.println(count7("71777123777877",0));
  }
static public int recursionSum(int[] numbers, int x) {
    if(x == numbers.length)
      return 0;

    return numbers[x] + recursionSum(numbers, x + 1);
}
 static public void count10( String num){
    String [] array = num.split("");
    int count = 0;
    for( int x = 0; x< array.length; x++){
      int num1 = Integer.parseInt(array[x]);
      if(num1 == 7){
        count++;
      }
    }
   System.out.println(count);
 }
 static public int count7 ( String num, int x){
    String [] array = num.split("");

    if( x == array.length){
      return 0;
    }
   int num1 = Integer.parseInt(array[x]);

     if (num1 == 7) {
       return 1 + count7(num, x + 1);
     } else {
       return count7(num, x + 1);
     }

 }
}