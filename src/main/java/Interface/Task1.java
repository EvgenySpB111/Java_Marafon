package Interface;

public class Task1 {
  public static void main(String[] args) {
  Warehouse warehouse = new Warehouse();
  Picker picker = new Picker(warehouse);
  Courier courier = new Courier(warehouse);
  businessProcess(picker);
  businessProcess(courier);
    System.out.println(warehouse.toString());
    System.out.println(picker.toString());
    System.out.println(courier.toString());

    System.out.println();
    Warehouse warehouse2 = new Warehouse();
    Picker picker2 = new Picker(warehouse2);
    Courier courier2 = new Courier(warehouse2);
    businessProcess(picker2);
    businessProcess(courier2);
    System.out.println("Результаты работы другого склада : ");
    System.out.println(warehouse2);
    System.out.println(picker2);
    System.out.println(courier2);






  }

  static void businessProcess(Worker worker){
    for( int x = 0; x < 10000 ; x ++){
      worker.doWork();
    } worker.bonus();
  }
}
