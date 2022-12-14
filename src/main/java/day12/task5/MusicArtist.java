package day12.task5;

public class MusicArtist {
  private String name;
  private String firstName;
  private int age;

   public MusicArtist(String name,String firstName, int age){
     this.name = name;
     this.firstName = firstName;
     this.age = age;
   }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "MusicArtist{" +
            "name='" + name + '\'' +
            ", firstName='" + firstName + '\'' +
            ", age=" + age +
            '}';
  }
}
