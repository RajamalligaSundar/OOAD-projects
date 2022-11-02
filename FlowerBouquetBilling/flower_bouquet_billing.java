package FlowerBouquetBilling;
import java.util.*;

public class flower_bouquet_billing{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        existing_model u1 = new existing_model();
        customised_model c1 = new customised_model();
        System.out.println("\n\n\nWelcome to Girikalaa Flower Shop\n\nPress -1- to get an existing model\nPress -2- to get a customised model");
        int choice=sc.nextInt();
        int bill=0;
        if(choice == 1)
        {
            //existing
            bill = u1.Get_BillOfExistingModels();
            System.out.println("Bill Amount: Rs. "+bill); 
        }
        else if(choice == 2)
        {
            //customised
            bill = c1.Calculate_CustomizationBill();
            System.out.println("Bill Amount: Rs. "+bill); 
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}