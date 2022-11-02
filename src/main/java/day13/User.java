package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
  private String username;
  private List<User> subscriptions = new ArrayList<>();
  private List<User> friends = new ArrayList<>();

  public User( String username){
    this.username = username;
    List<User> subscriptions;
    List<User> friends;
  }
  public List<User> getFriends() {
    return friends;
  }

  public String getUsername() {
    return username;
  }

  public List<User> getSubscriptions() {
    return subscriptions;
  }

  public void subscribe(User user){
    subscriptions.add(user);
  }
  public void checkSubscribed(User user){
    String subs = "Пользователь " + user + " нет в списке ваших подписчиков";
    for( int x = 0; x < subscriptions.size(); x ++){

      if( subscriptions.get(x) == user) {
        subs = "Пользователь "+ user + " есть в списке ваших подписчиков";
      }
    }
    System.out.println(subs);
  }

  public void checkFriend(User user){
    String fren = "Пользователя "+ user+ " нет в списке ваших друзей";
    for(int x = 0; x < friends.size(); x++){
      if( friends.get(x) == user){
        fren = "Пользователь "+ user + " есть в списке ваших друзей";
      }
    }
    System.out.println(fren);
  }
  public void addFriend(User friend) {
    friends.add(friend);
  }
  public void addSubscriptions(User subscription) {
    subscriptions.add(subscription);
  }

  @Override
  public String toString() {
    return  username + " ";
  }
}
