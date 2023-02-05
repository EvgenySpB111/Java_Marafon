package day18;

public class Main3 {
  public static void main(String[] args) {
   Node root = new Node(20);

   int [] numbers = {14,23,11,16,22,27,5,15,18,24,150,8};

   for(int x = 0; x < numbers.length; x++){
     addNode(numbers[x], root);
   }

  }
  public static void addNode( int num , Node root){
    if( root == null){
      throw  new IllegalArgumentException("Корень не может быть null");
    }
    Node nextNode = root; //20
    Node secondNode = null;

    while ( nextNode != null) {
      secondNode = nextNode;

      if( secondNode.getValues() < num){
        nextNode = secondNode.getLeft();
      } else {
        nextNode = secondNode.getRight();
      }



    }



  }
}
