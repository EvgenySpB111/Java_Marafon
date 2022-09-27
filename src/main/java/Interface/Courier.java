package Interface;

public class Courier  implements Worker {
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

  public Courier( Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  @Override
  public void doWork() {
    salary = salary + 100;
    warehouse.countDeliveredOrders++;
  }

  @Override
  public void bonus() {
    if (isPayed > 0){
      System.out.println("Бонус уже был выплачен");
      bonus = "Бонус был выплачен";
      return;
    }
    if( warehouse.getCountDeliveredOrders() < 10000){
      System.out.println("Бонус пока не доступен");
      bonus = "Бонус не был выплачен";
    }
   if(warehouse.getCountDeliveredOrders() == 10000){
     salary += 50000;
     isPayed++;
     bonus = "Бонус был выплачен";
   }
  }


  @Override
  public String toString() {
    return "Courier{" +
            "salary=" + salary +
            ", bonus='" + bonus + '\'' +
            '}';
  }
}