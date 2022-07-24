import java.util.Scanner;
import java.util.HashMap;
import java.util.*;

public class mapExercise {
    public static void main(String[] args){
        Scanner model = new Scanner(System.in);

        HashMap<String, String> carInventory = new HashMap<String, String>(); 
            // vehicle inventory
            carInventory.put("Camry", "Toyota");
            carInventory.put("Corolla", "Toyota");
            carInventory.put("Forerunner", "Toyota");
            
            carInventory.put("Civic", "Honda");
            carInventory.put("Pilot", "Honda");
            carInventory.put("CR-V", "Honda");
            
            carInventory.put("Outback", "Subaru");
            carInventory.put("Crosstrek", "Subaru");
            carInventory.put("Impreza", "Subaru");

            carInventory.put("Sentra", "Nissan");
            carInventory.put("Altima", "Nissan");
            carInventory.put("Versa", "Nissan");

        System.out.println("Hello and welcome to Carissa's Japanese Cars. What vehicle model are you interested in?");
        String vehicleModel = model.nextLine();

        if(carInventory.containsKey(vehicleModel) == true){
             System.out.println("Oh, you're looking for a " + vehicleModel + "?");
             String make = carInventory.get(vehicleModel);
             System.out.println("Our " + make +" selection is right over here...");
        }
        
        else {
            System.out.println("Sorry, we don't carry that model");
        }
        
    }
}

