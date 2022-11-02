package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
  static public List<Message> messages = new ArrayList<>();

  public static void addNewMessage(User u1, User u2, String text){
    Message message = new Message(u1,u2,text);
    messages.add(message);

  }
  public static List<Message> getMessages(){
    return messages;
  }
  public static void showDialog(User u1, User u2) {
    for( int x = 0; x < messages.size(); x++){
      if( u1 == messages.get(x).getSender() && u2 == messages.get(x).getReceiver() ){
        System.out.println(messages.get(x));
      }
      if( u2 == messages.get(x).getSender() && u1 == messages.get(x).getReceiver() ){
        System.out.println(messages.get(x));
      }
    }


  }




}
