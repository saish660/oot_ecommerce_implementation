/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This is the main class, where the program execution starts from. It creates objects of all the defined classes and uses them accordingly.

*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Seller seller = null;   // will by initialzed later in conditional block
        Buyer buyer = null;
        Random rand = new Random(); // for generating new user id

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Hello there, welcome");

        System.out.println("Are you a 1.buyer or 2.seller?");
        int userType = inputScanner.nextInt();
        inputScanner.nextLine();
        
        int uid = rand.nextInt(1000000);

        System.out.println("Enter your email id: ");
        String email = inputScanner.nextLine();

        System.out.println("Enter your phone number: ");
        String phNo = inputScanner.nextLine();

        if (userType == 1) {
            buyer = new Buyer();

            System.out.println("Enter your address: ");
            buyer.address = inputScanner.nextLine();

            if (buyer.update_details(uid, email, phNo)) {
                System.out.println("Details updated successfully");
            } else {
                System.out.println("An error occured while updating user details");
            }

        } else {
            seller = new Seller();
            System.out.println("Enter your location: ");
            String location = inputScanner.nextLine();

            System.out.println("Enter your seller name: ");
            String sellerName = inputScanner.nextLine();

            if (seller.update_details(email, phNo, sellerName, location)) {
                System.out.println("Seller account created successfully");
            } else {
                System.out.println("Error updating account details");
            }
        }

        if (userType == 1) {
            
        }



    }
}
