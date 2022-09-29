import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double TankSize = 0;
        double GasPerMile = 0;
        double GasPrice = 0;
        String trash = "";
        double CurrentGas = 0;

        System.out.print("How gas is in your car ");
        if (in.hasNextDouble())
        {
            CurrentGas = in.nextDouble();
            in.nextLine(); //have to clear the buffer after reading a number
            System.out.println("You said that your car has " + CurrentGas + "gallons right now");
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
            System.exit(0);
        }


        System.out.print("How many gallons of gas can your car hold ");
        if (in.hasNextDouble())
        {
            TankSize = in.nextDouble();
            in.nextLine(); //have to clear the buffer after reading a number
            System.out.println("You said that your car can hold " + TankSize + "gallons");
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
            System.exit(0);
        }


        System.out.print("How many miles per gallon of gas can you get in your car ");
        if (in.hasNextDouble())
        {
            GasPerMile = in.nextDouble();
            in.nextLine(); //have to clear the buffer after reading a number
            System.out.println("You said that your car can hold " + GasPerMile + "gallons");
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
            System.exit(0);
        }


        System.out.print("How much does gas cost per gallon of gas ");
        if (in.hasNextDouble())
        {
            GasPrice = in.nextDouble();
            in.nextLine(); //have to clear the buffer after reading a number
            System.out.println("You said that it cost " + GasPrice + " per gallon of gas");
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
            System.exit(0);
        }

        System.out.println("to travel 100 miles would cost you " + (GasPrice/GasPerMile) * 100 + "dollars ");
        System.out.println("with your current gas levels you can travel " + CurrentGas * GasPerMile + " miles");


    }
}