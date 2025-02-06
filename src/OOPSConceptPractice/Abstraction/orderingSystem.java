package OOPSConceptPractice.Abstraction;


/*
TODO: Design an abstract class Order with methods calculateTotalPrice() and placeOrder().
  Implement concrete subclasses like DineInOrder and DeliveryOrder,
  each calculating the total price differently based on additional charges like service fees or delivery charges.
 */
public class orderingSystem {

    public static void main(String[] args) {
        dineInOrder dio = new dineInOrder();
        dio.calculateTotalPrice();
    }
}


class dineInOrder extends order {

    @Override
    public void calculateTotalPrice() {
        System.out.println("Total price on dine in order");
    }

    @Override
  public  void placeOrder() {
        System.out.println("Place order on dine in order");

    }
}

class DeliveryOrder extends order {

    @Override
  public  void calculateTotalPrice() {

        System.out.println("Total price on delivery order");


    }

    @Override
   public void placeOrder() {

        System.out.println("place a delivery order");


    }
}


abstract class order {

    abstract void calculateTotalPrice();

    abstract void placeOrder();

}









