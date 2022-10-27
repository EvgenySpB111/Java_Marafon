package day12.task4;

public class MusicArtist {
  private String name;
  private String lastName;

  public MusicArtist(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "MusicArtist{" +
            "name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }
}
