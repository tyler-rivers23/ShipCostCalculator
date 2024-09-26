//Class Task2
//Main ()
//num ItemPrice
//num FreeShipping = 100
//ShippingCost = ItemPrice * .02
//num totalCost
//
//output "Enter price of item"
//input ItemPrice
//if ItemPrice <  FreeShipping
//totalCost = ItemPrice + ShippingCost
//output "Your total cost is " + totalCost
//else
//totalCost = ItemPrice
//output "Your total cost is " + totalCost
//end if
//return
//end Class
import java.util.Scanner;
public class Main
  {
    public static void main(String[] args)
    {

        double itemPrice;
       final double freeShipping = 100.00;
        double totalCost;

        Scanner in = new Scanner(System.in);
        String trash = "";

        System.out.println("Enter price of item: ");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();

            if(itemPrice <= freeShipping)
            {
                double shippingCost = itemPrice * .02;
                totalCost = itemPrice + shippingCost;
                System.out.println("Your total cost is $" + totalCost);
                System.out.println("Your shipping cost is $" + shippingCost);
            }
            else
            {
                totalCost = itemPrice;
                System.out.println("Your total cost is" + totalCost);
                System.out.println("Your shipping cost is 0 because you spent over 100$" );
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You did not enter a valid price run program again");
        }
    }
  }

