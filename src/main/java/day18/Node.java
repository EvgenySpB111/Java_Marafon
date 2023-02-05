package day18;

public class Node {
 private int values;
 private Node left;
 private Node right;

 public Node(int values){
   this.values = values;
 }

  public int getValues() {
    return values;
  }

  public void setValues(int values) {
    this.values = values;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }
}
