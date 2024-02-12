import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double SHIPPING_LIMIT = 100;
        double SHIP_RATE = 0.02;
        double shipCost = 0;
        boolean done = false;
        double totalPrice = 0;

        do {
            System.out.print("please input the price of your purchase: ");
            if (in.hasNextDouble()) {
                itemPrice = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else{
                System.out.println("invalid input detected, please try again");
                in.nextLine();
                done = false;

            }


        }while(!done);

        System.out.println("you said the item price is: " + itemPrice);

        if(itemPrice >= 100){
            System.out.println("your shipping is free!");
        }
        else{
            shipCost = itemPrice * SHIP_RATE;
            System.out.println("shipping cost is: " + shipCost);
        }
        totalPrice = shipCost + itemPrice;
        System.out.println("your final total is: " + totalPrice);


    }
}