package TwoWaySwitch;
import java.util.*;

public class TwowaySwitch{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        //2 switch either 1 must be on
        System.out.print("\n\nTwo Way Electrical Switch with ON/OFF Functionality\n\nGive Two input\nPress 0 - OFF\nPress 1 - ON\n\nSwitch 1 : ");
        int choice1 = sc.nextInt();
        System.out.print("Switch 2 : ");
        int choice2 = sc.nextInt();

        track_switch u1 = new track_switch();
        u1.switch_working(choice1, choice2);
    
    }
}