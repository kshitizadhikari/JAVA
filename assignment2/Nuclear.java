import java.text.DecimalFormat;
import java.util.Scanner;

public class Nuclear
{
    public static void main(String[] args){

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Nuclear Reactor Name: X00-XC-HB1");
        System.out.println("\nEnter the name of Supervisor: ");
        String supervisorName = scannerObj.nextLine();
        System.out.println("\nEnter the total number of employees: ");
        int totalEmployees = scannerObj.nextInt();
        System.out.println("\nEnter the number of times the waste is removed from the core:  ");
        int wasteCount = scannerObj.nextInt();
        System.out.println("\nEnter the total weight of waste produced every 1 week: ");
        float wasteWeight = scannerObj.nextFloat();
        System.out.println("\nIs the electric motor being replaced every 18 days? : ");
        char replaced = scannerObj.next().charAt(0);
        System.out.println("\nEnter the core average temperature of the Nuclear Reactor in CELCIUS: ");
        float tempCelcius = scannerObj.nextFloat();

        //calculate temp in Kelvin
        double tempKelvin = tempCelcius + 273.14;

        System.out.println("\nNuclear Reactor: X00-XC-HB1");
        System.out.println("\nSupervisor Name: " + supervisorName);
        System.out.println("Total Number of Employees " + totalEmployees);
        System.out.println("Number of times the waste is removed from the core: " + wasteCount);
        System.out.println("Total Weight of Waste every 1 week: " + wasteCount);
        System.out.println("Electric Motor replaced or not? : " + replaced);
        System.out.println("Core Average Temperature in Celcius : " + tempCelcius + "'C");
        System.out.println("Core Average Temperature in Kelvin : " + tempKelvin + "'K\n");


    }
}