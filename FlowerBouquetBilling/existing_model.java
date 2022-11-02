package FlowerBouquetBilling;
import java.util.*;

class existing_model{
    static Scanner sc = new Scanner(System.in);

    // individual flower
    int rose = 10;
    int tulip = 25;
    int oriental_lily = 30;
    int cherry_blossom = 45;
    int daisy = 30;
    int vilot = 40;

    //existing bouquests
    int day_dreams = 150;
    int fancy_floral = 250;
    int tropical_breeze = 200;
    int velvet_valley = 350;
    int forest_fantasy =200;

    //individual flower bill
    private int individual_bill()
    {
        int bill_amount = 0; 

        System.out.println("\nList of Flowers: \nPress, \n\t 1 for rose\n\t 2 for tulip\n\t 3 for oriental lily \n\t 4 for cherry blossom\n\t 5 for daisy\n\t 6 for voilet");

        int choice = sc.nextInt();
 
        switch(choice)
        {
            case 1:
            System.out.println("You have choosen ROSE");
            bill_amount = rose;
            break;
            case 2:
            System.out.println("You have choosen TULIP");
            bill_amount = tulip;
            break;
            case 3:
            System.out.println("You have choosen ORIENTAL LILY");
            bill_amount = oriental_lily;
            break;
            case 4:
            System.out.println("You have choosen CHERRY BLOSSOM");
            bill_amount = cherry_blossom; 
            break;
            case 5:
            System.out.println("You have choosen DAISY");
            bill_amount = daisy;
            break;
            case 6:
            System.out.println("You have choosen VOILET");
            bill_amount = vilot; 
            break;
            default:
            System.out.println("Invalid input");
            break;
        }
        return bill_amount;
    }

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

    //Get Bill
    public int Get_BillOfExistingModels()
    {
        int bill = 0;

        System.out.print("Press 1 - get Piece rate and 2 - existing bouquests model\nEnter Your Choice: ");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            bill = individual_bill();
        }
        else if(choice == 2)
        {
            bill = existing_bouquests();
        }
        else 
        {
            System.out.println("Invalid Input");
        }
        return bill;
    }
} 