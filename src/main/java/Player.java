public class Player {
  int stamina;
  final int MAX_STAMINA = 100;
  final int MIN_STAMINA = 0;
  static int countPlayers = 0;

  public Player(int stamina){
    this.stamina = stamina;
    if(countPlayers < 6) countPlayers++;
  }
public int getStamina(){
  return stamina;
}
public int getCountPlayers(){
  return countPlayers;
}

public void run (){
  if(stamina >= 1) stamina --;
  else if ( stamina == 0) countPlayers --;
}
static void info(){
  if(countPlayers < 6) System.out.println("Команды неполные. На поле еще есть " +(6 - countPlayers)+ " свободных мест");
  else System.out.println("На поле нет свободных мест");
}

}
