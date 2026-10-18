using System;
using System.Collections.Generic;

public class Program
{
    public static void Main(string[] args)
    {
        Seller seller = null;
        Buyer buyer = null;
        Random rand = new Random();
        Console.WriteLine("Hello there, welcome");
        Console.WriteLine("Are you a 1.buyer or 2.seller?");
        int userType = int.Parse(Console.ReadLine());
        int uid = rand.Next(1000000);
        Console.WriteLine("Enter your email id: ");
        string email = Console.ReadLine();
        Console.WriteLine("Enter your phone number: ");
        string phNo = Console.ReadLine();
        if (userType == 1)
        {
            buyer = new Buyer();
            Console.WriteLine("Enter your name: ");
            string buyerName = Console.ReadLine();
            Console.WriteLine("Enter your address: ");
            string address = Console.ReadLine();
            if (buyer.set_details(uid, email, phNo) && buyer.set_name(buyerName) && buyer.set_address(address))
            {
                Console.WriteLine("Details updated successfully");
                Console.WriteLine("Buyer Name: " + buyer.getName());
                Console.WriteLine("Buyer Address: " + buyer.getAddress());
            }
            else Console.WriteLine("An error occured while updating user details");
        }
        else
        {
            seller = new Seller();
            Console.WriteLine("Enter your location: ");
            string location = Console.ReadLine();
            Console.WriteLine("Enter your seller name: ");
            string sellerName = Console.ReadLine();
            if (seller.set_details(email, phNo, sellerName, location) && seller.set_location(location))
            {
                Console.WriteLine("Seller account created successfully");
                Console.WriteLine("Seller Name: " + seller.get_seller_name());
                Console.WriteLine("Seller Location: " + seller.get_location());
            }
            else Console.WriteLine("Error updating account details");
        }
        Product laptop = new Product();
        laptop.set_product_name("Pro Gaming Laptop");
        laptop.set_product_description("High-performance laptop with 16GB RAM.");
        laptop.set_price(1500);
        laptop.set_discount(100);
        Console.WriteLine("\n--- Product Created ---");
        Console.WriteLine("Product Name: " + laptop.get_product_name());
        Console.WriteLine("Product Description: " + laptop.get_product_description());
        Console.WriteLine("Product Price: " + laptop.get_product_price());
        Console.WriteLine("Product Discount: " + laptop.get_product_discount());
        laptop.get_details();
        Wishlist wishlist = new Wishlist();
        wishlist.set_name("My Tech Wishlist");
        wishlist.add_item(laptop);
        Console.WriteLine("\n--- Wishlist ---");
        Console.WriteLine("Wishlist Name: " + wishlist.get_name());
        Console.WriteLine("Added '" + wishlist.get_wishlist()[0].get_product_name() + "' to wishlist.");
        Cart cart = new Cart();
        cart.add_item(laptop);
        int cartTotal = laptop.get_product_price() - laptop.get_product_discount();
        Console.WriteLine("\n--- Shopping Cart ---");
        Console.WriteLine("Added item to cart. Total Cart Value: $" + cartTotal);
        cart.create_order();
        Order order = new Order();
        order.item_count = 1;
        order.add_order_item(121);
        order.set_order_status("Processing");
        order.set_order_date(20260809);
        order.place_order();
        Console.WriteLine("\n--- Order Summary ---");
        Console.WriteLine("Current Order Status: " + order.get_status());
        Review review = new Review();
        review.set_review("Excellent Device!", "The laptop is extremely fast and handles games well.");
        review.set_seller_reply("Thank you for your purchase, John!");
        Console.WriteLine("\n--- Customer Review ---");
        Console.WriteLine("Title: " + review.get_review_title());
        Console.WriteLine("Text: " + review.get_review_text());
        Console.WriteLine("Seller Reply: " + review.get_seller_reply());
        Sale blackFridaySale = new Sale();
        blackFridaySale.name = "Black Friday Cyber Sale";
        blackFridaySale.add_offer(12);
        blackFridaySale.launch_sale();
        Console.WriteLine("\n--- Active Sales ---");
        Console.WriteLine("Sale Name: " + blackFridaySale.name);
        Console.WriteLine("Current Offer: " + blackFridaySale.offers[0]);
    }
}
