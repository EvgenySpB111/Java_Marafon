package OnePart;

public class Student extends Human {
 String groupName;

public Student(String name , String groupName ){
  super(name);
  this.groupName = groupName;
}

public String getGroupName(){
  return groupName;
}
@Override
public void printInfo (){
  System.out.println("Этот человек с именем " + super.name);
  System.out.println("Этот студент с именем " + getName());
}

}
