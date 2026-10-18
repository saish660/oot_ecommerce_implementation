import random

from catalog import Product, Wishlist
from commerce import Cart, Order, Review, Sale
from user import Buyer, Seller


def main():
    seller = None
    buyer = None
    print("Hello there, welcome")
    print("Are you a 1.buyer or 2.seller?")
    user_type = int(input())
    uid = random.randint(0, 999999)
    print("Enter your email id: ")
    email = input()
    print("Enter your phone number: ")
    ph_no = input()

    if user_type == 1:
        buyer = Buyer()
        print("Enter your name: ")
        buyer_name = input()
        print("Enter your address: ")
        address = input()
        if buyer.set_details(uid, email, ph_no) and buyer.set_name(buyer_name) and buyer.set_address(address):
            print("Details updated successfully")
            print("Buyer Name: " + buyer.getName())
            print("Buyer Address: " + buyer.getAddress())
        else:
            print("An error occured while updating user details")
    else:
        seller = Seller()
        print("Enter your location: ")
        location = input()
        print("Enter your seller name: ")
        seller_name = input()
        if seller.set_details(email, ph_no, seller_name, location) and seller.set_location(location):
            print("Seller account created successfully")
            print("Seller Name: " + seller.get_seller_name())
            print("Seller Location: " + seller.get_location())
        else:
            print("Error updating account details")

    laptop = Product()
    laptop.set_product_name("Pro Gaming Laptop")
    laptop.set_product_description("High-performance laptop with 16GB RAM.")
    laptop.set_price(1500)
    laptop.set_discount(100)
    print("\n--- Product Created ---")
    print("Product Name: " + laptop.get_product_name())
    print("Product Description: " + laptop.get_product_description())
    print("Product Price: " + str(laptop.get_product_price()))
    print("Product Discount: " + str(laptop.get_product_discount()))
    laptop.get_details()

    wishlist = Wishlist()
    wishlist.set_name("My Tech Wishlist")
    wishlist.add_item(laptop)
    print("\n--- Wishlist ---")
    print("Wishlist Name: " + wishlist.get_name())
    print("Added '" + wishlist.get_wishlist()[0].get_product_name() + "' to wishlist.")

    cart = Cart()
    cart.add_item(laptop)
    cart_total = laptop.get_product_price() - laptop.get_product_discount()
    print("\n--- Shopping Cart ---")
    print("Added item to cart. Total Cart Value: $" + str(cart_total))
    cart.create_order()

    order = Order()
    order.item_count = 1
    order.add_order_item(121)
    order.set_order_status("Processing")
    order.set_order_date(20260809)
    order.place_order()
    print("\n--- Order Summary ---")
    print("Current Order Status: " + order.get_status())

    review = Review()
    review.set_review("Excellent Device!", "The laptop is extremely fast and handles games well.")
    review.set_seller_reply("Thank you for your purchase, John!")
    print("\n--- Customer Review ---")
    print("Title: " + review.get_review_title())
    print("Text: " + review.get_review_text())
    print("Seller Reply: " + review.get_seller_reply())

    black_friday_sale = Sale()
    black_friday_sale.name = "Black Friday Cyber Sale"
    black_friday_sale.add_offer(12)
    black_friday_sale.launch_sale()
    print("\n--- Active Sales ---")
    print("Sale Name: " + black_friday_sale.name)
    print("Current Offer: " + str(black_friday_sale.offers[0]))


if __name__ == "__main__":
    main()
