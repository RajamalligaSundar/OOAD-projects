package TwoWaySwitch;

public class track_switch {
    //switch 2 - input varum
    //either 2 should be different
    //track circuit 
    //circuit on - off off - on

    int choice1=0;
    public boolean track_switch1(int choice1)
    {
        boolean circuit1 = false;
        //circuit tracking for switch 1
        if(choice1==0)
        {
            circuit1 = true;
            System.out.print("Circuit Status: ON\n");
            return circuit1;
        }
        if(choice1==1)
        {
            circuit1 = false;
            System.out.print("Circuit Status: OFF\n");
            return circuit1;
        }
        return circuit1;
    }

    public boolean track_switch2(int choice1)
    {
        boolean circuit2 = false;
        //circuit tracking for switch 2
        if(choice1==0)
        {
            circuit2 = true;
            System.out.println("Circuit Status: ON\n");
            return circuit2;
        }
        if(choice1==1)
        {
            circuit2 = false;
            System.out.println("Circuit Status: OFF\n");
            return circuit2;
        }
        return circuit2;
    }

    public void switch_working(int choice1, int choice2)
    {
        boolean switch1 = track_switch1(choice1);
        boolean switch2= track_switch1(choice2);

        if(switch1!=switch2)
        {
            System.out.println("Light ON");
        }
        else
        {
            System.out.println("Light OFF");
        }
    }






}
