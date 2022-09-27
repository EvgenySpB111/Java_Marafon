package Interface;

public class Picker  implements Worker {
  public int salary ;
  public int isPayed ;
  public String bonus;
  public Warehouse warehouse;

  public int getSalary() {
    return salary;
  }

  public int getIsPayed() {
    return isPayed;
  }

  public Picker( Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  @Override
  public void doWork() {
    salary = salary + 80;
    warehouse.countPickedOrders ++;
  }

  @Override
  public void bonus() {
    if (isPayed > 0){
      System.out.println("Бонус уже был выплачен");
      bonus = "Бонус был выплачен";
      return;
    }
    if(warehouse.getCountPickedOrders() < 10000){
      System.out.println("Бонус пока не доступен");
      bonus = "Бонус не был выплачен";
    }
    if( warehouse.getCountPickedOrders() == 10000){
      salary += 70000;
      isPayed++;
      bonus = "Бонус был выплачен";
    }

  }



  @Override
  public String toString() {
    return "Picker{" +
            "salary=" + getSalary() +
            ", bonus='" + bonus + '\'' +
            '}';
  }
}