package FlowerBouquetBilling;
import java.util.*;

class customised_model{
    Scanner sc = new Scanner(System.in);

    // individual flowers
    int rose = 10;
    int tulip = 25;
    int oriental_lily = 30;
    int cherry_blossom = 45; 
    int daisy = 30;
    int vilot = 40;

     //available templates 
     int day_dreams = 150;
     int fancy_floral = 250;
     int tropical_breeze = 200;
     int velvet_valley = 350;
     int forest_fantasy =200;

    int bill = 0;
   
    private int CalculateBill_General_Customization()
    {
        int bill_amount = 0; 

        System.out.println("\nList of Flowers: \nPress, \n\t 1 for rose\n\t 2 for tulip\n\t 3 for oriental lily \n\t 4 for cherry blossom\n\t 5 for daisy\n\t 6 for voilet");

        int choice = sc.nextInt();
        int n=0;
        switch(choice)
        {
            case 1:
            System.out.print("You have choosen ROSE\nEnter no.");
            n=sc.nextInt();
            bill_amount = rose*n;
            break;
            case 2:
            System.out.println("You have choosen TULIP\nEnter no.");
            n=sc.nextInt();
            bill_amount = tulip*n;
            break;
            case 3:
            System.out.println("You have choosen ORIENTAL LILY\nEnter no.");
            n=sc.nextInt();
            bill_amount = oriental_lily*n;
            break;
            case 4:
            System.out.println("You have choosen CHERRY BLOSSOM\nEnter no.");
            n=sc.nextInt();
            bill_amount = cherry_blossom*n; 
            break;
            case 5:
            System.out.println("You have choosen DAISY\nEnter no.");
            n=sc.nextInt();
            bill_amount = daisy*n;
            break;
            case 6:
            System.out.println("You have choosen VOILET\nEnter no.");
            n=sc.nextInt();
            bill_amount = vilot*n; 
            break;
            default:
            System.out.println("Invalid input");
            break;
        }
        return bill_amount;
    }

    //selective customization
    
    private int existing_bouquests()
    {
        int bill_amount = 0; 

        System.out.println("\nList of Bouquests: \nPress, \n\t 1 for Day Dreams\n\t 2 for Fancy Floral\n\t 3 for Tropical breeze \n\t 4 for Velvet valley\n\t 5 for Forest fantancy");

        int choice = sc.nextInt();
    
        switch(choice)
        {
            case 1:
            System.out.println("You have choosen DAY DREAMS");
            bill_amount = day_dreams;
            break;
            case 2:
            System.out.println("You have choosen FANCY FLORAL");
            bill_amount = fancy_floral;
            break;
            case 3:
            System.out.println("You have choosen TROPICAL BREEZE");
            bill_amount = tropical_breeze;
            break;
            case 4:
            System.out.println("You have choosen VELVET VALLEY");
            bill_amount = velvet_valley; 
            break;
            case 5:
            System.out.println("You have choosen FOREST FANTASY");
            bill_amount = forest_fantasy;
            break;
            default:
            System.out.println("Invalid input");
            break;
        }
    
        return bill_amount;
    }


    private int CalculateBill_Selective_Customization(int template_amount)
    {
        int bill_amount=template_amount;
        String choice = "Y"; 
        do
        {
            bill_amount = bill_amount+CalculateBill_General_Customization();
            System.out.println("Do you want to continue (y/n):");
            choice = sc.next();
        }
        while(choice.equals("y"));
        return bill_amount;
    }

    public int Calculate_CustomizationBill()
    {
        int bill_amount=0;
        System.out.println("Choose one flower and enter number of flowers - Press 1\nChoose customized selection of your bouquet - Press 2");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            bill_amount = CalculateBill_General_Customization();
        }
        else if(choice == 2)
        {
            int template_amount = existing_bouquests();
            bill_amount = CalculateBill_Selective_Customization(template_amount);
        }
        return bill_amount;
    }
}
