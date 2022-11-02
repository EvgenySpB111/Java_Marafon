package day13;

public class Task1 {
  public static void main(String[] args) {
 User user1 = new User("Jeka");
 User user2 = new User("Vovan");
 User user3 = new User("Albert");


 MessageDatabase.addNewMessage(user1,user2,"Привет!!!");
 MessageDatabase.addNewMessage(user1,user2,"Работаешь сегодня?");
    MessageDatabase.addNewMessage(user2,user1,"Привет");
    MessageDatabase.addNewMessage(user2,user1,"Да, работаю");
    MessageDatabase.addNewMessage(user2,user1,"Еврей достал");
      MessageDatabase.addNewMessage(user3,user1,"Привет кабан");
      MessageDatabase.addNewMessage(user3,user1,"Меня достал этот румын");
      MessageDatabase.addNewMessage(user3,user1,"бла бла бла");
       MessageDatabase.addNewMessage(user1,user3,"Привет Вован");
       MessageDatabase.addNewMessage(user1,user3,"Да...жалуется постоянно");
       MessageDatabase.addNewMessage(user1,user3,"Меня тоже достал уже");
          MessageDatabase.addNewMessage(user2,user1,"Кабан, когда идем на Думскую?");
          MessageDatabase.addNewMessage(user1, user2,"Опять поздороваться с барменами?)))");
           MessageDatabase.addNewMessage(user2,user3,"Привет румын!!!");
           MessageDatabase.addNewMessage(user2,user3,"Привет мелкий прыщь!!");

    MessageDatabase.showDialog(user1,user2);

          user1.addFriend(user2);
    System.out.println("Проверка списка друзей");
    user1.checkFriend(user2);
    user1.checkFriend(user3);

    user1.addSubscriptions(user3);
    System.out.println("Проверка списка подписчиков");
    user1.checkSubscribed(user2);

  }
}
