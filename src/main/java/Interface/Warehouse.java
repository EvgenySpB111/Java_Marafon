package Interface;

public class Warehouse {

  public int  countPickedOrders = 0;
  public int countDeliveredOrders = 0;



  public int getCountPickedOrders(){
    return countPickedOrders;
  }
  public int getCountDeliveredOrders(){
    return countDeliveredOrders;
  }
  public String toString(){
    return "Колисество собранных товаров : " + countPickedOrders
            + "  Количество доставленных товаров : " + countDeliveredOrders;
  }

}
