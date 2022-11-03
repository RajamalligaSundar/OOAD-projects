package SwitchONOFF;
import java.util.*;

public class SwitchONOFF {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("\n\nSimple Electric Switch with ON/OFF Functionality\n\n0 - OFF LIGHT\n1 - ON LIGHT\n\nEnter Choice: ");

        int choice = sc.nextInt(); // 0 - OFF , 1 - ON
        trackONOFF t1 = new trackONOFF();

        if(choice == 0)
        {
            //open circuit - Light off
            t1.track_ONOFF(choice);
        }
        else if(choice == 1)
        {
            //close circuit - Light ON
            t1.track_ONOFF(choice);
        }
        else 
        {
            //invalid - input
            System.out.println("Invalid Input");
        }
        
    }
    
}
