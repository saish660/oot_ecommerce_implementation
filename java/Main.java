/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This is the main class, where the program execution starts from. It creates objects of all the defined classes and uses them accordingly.

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Seller seller = null; // will by initialzed later in conditional block
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

            System.out.println("Enter your name: ");
            String buyerName = inputScanner.nextLine();

            System.out.println("Enter your address: ");
            String address = inputScanner.nextLine();

            if (buyer.set_details(uid, email, phNo) && buyer.set_name(buyerName)
                    && buyer.set_address(address)) {
                System.out.println("Details updated successfully");
                System.out.println("Buyer Name: " + buyer.getName());
                System.out.println("Buyer Address: " + buyer.getAddress());
            } else {
                System.out.println("An error occured while updating user details");
            }

        } else {
            seller = new Seller();
            System.out.println("Enter your location: ");
            String location = inputScanner.nextLine();

            System.out.println("Enter your seller name: ");
            String sellerName = inputScanner.nextLine();

            if (seller.set_details(email, phNo, sellerName, location) && seller.set_location(location)) {
                System.out.println("Seller account created successfully");
                System.out.println("Seller Name: " + seller.get_seller_name());
                System.out.println("Seller Location: " + seller.get_location());
            } else {
                System.out.println("Error updating account details");
            }
        }

        // if (userType == 1) {
        // int choice=0;
        // System.out.println("\nWhat do you want to do? ");
        // System.out.println("1. List products\n2. Add product to cart\n3. View
        // cart\n4. Create wishlist\n5. Add to wishlist\n6. View wishlist");
        // choice = inputScanner.nextInt();

        // switch(choice) {
        // case 1:

        // }
        // }

        Product laptop = new Product();
        laptop.set_product_name("Pro Gaming Laptop");
        laptop.set_product_description("High-performance laptop with 16GB RAM.");
        laptop.set_price(1500);
        laptop.set_discount(100);

        System.out.println("\n--- Product Created ---");
        System.out.println("Product Name: " + laptop.get_product_name());
        System.out.println("Product Description: " + laptop.get_product_description());
        System.out.println("Product Price: " + laptop.get_product_price());
        System.out.println("Product Discount: " + laptop.get_product_discount());
        laptop.get_details();

        Wishlist wishlist = new Wishlist();
        wishlist.set_name("My Tech Wishlist");
        wishlist.add_item(laptop);
        System.out.println("\n--- Wishlist ---");
        System.out.println("Wishlist Name: " + wishlist.get_name());
        System.out.println("Added '" + wishlist.get_wishlist().get(0).get_product_name() + "' to wishlist.");

        // 5. Buyer adds Product to Shopping Cart
        Cart cart = new Cart();
        cart.add_item(laptop);
        int cartTotal = laptop.get_product_price() - laptop.get_product_discount();
        System.out.println("\n--- Shopping Cart ---");
        System.out.println("Added item to cart. Total Cart Value: $" + cartTotal);
        cart.create_order();

        // 6. Create an Order
        Order order = new Order();
        order.item_count = 1;
        order.add_order_item(121);
        order.set_order_status("Processing");
        order.set_order_date(20260809);
        order.place_order();
        System.out.println("\n--- Order Summary ---");
        System.out.println("Current Order Status: " + order.get_status());

        // 7. Buyer leaves a Review and Seller replies
        Review review = new Review();
        review.set_review("Excellent Device!", "The laptop is extremely fast and handles games well.");
        review.set_seller_reply("Thank you for your purchase, John!");

        System.out.println("\n--- Customer Review ---");
        System.out.println("Title: " + review.get_review_title());
        System.out.println("Text: " + review.get_review_text());
        System.out.println("Seller Reply: " + review.get_seller_reply());

        // 8. Launch a Promotional Sale
        Sale blackFridaySale = new Sale();
        blackFridaySale.name = "Black Friday Cyber Sale";
        blackFridaySale.add_offer(12);
        blackFridaySale.launch_sale();

        System.out.println("\n--- Active Sales ---");
        System.out.println("Sale Name: " + blackFridaySale.name);
        System.out.println("Current Offer: " + blackFridaySale.offers.get(0));

        inputScanner.close();

    }
}
