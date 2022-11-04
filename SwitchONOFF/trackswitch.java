package SwitchONOFF;
class trackONOFF {
   
    //0 open circuit -light off
    //1 close circuit - light On


    private boolean Circuit(int choice)
    {
        boolean circuit = false;

        if(choice == 0)
        {
        System.out.println("Circuit : ON"); //light off
        circuit = true;
        return circuit;
        }
        if(choice == 1)
        {
            System.out.println("Circuit : OFF"); //light on
        return circuit = false;
        }
        return circuit;
    }

    private void LightStatus(Boolean circuit)
    {
        if(circuit.equals(true))
        {
            System.out.print("Light: OFF");
        }
        if(circuit.equals(false))
        {
            System.out.print("Light: ON");
        }
    }

    public void track_ONOFF(int choice)
    {
        boolean circuit_status = Circuit(choice);
        LightStatus(circuit_status);
    }
}
