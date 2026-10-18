#include "User.cpp"
#include "Buyer.cpp"
#include "Product.cpp"
#include "Seller.cpp"
#include "Wishlist.cpp"
#include "Cart.cpp"
#include "Order.cpp"
#include "Review.cpp"
#include "Sale.cpp"
#include "Advertisement.cpp"

int main() {
    Seller* seller = nullptr;
    Buyer* buyer = nullptr;
    random_device device;
    mt19937 generator(device());
    uniform_int_distribution<int> distribution(0, 999999);
    cout << "Hello there, welcome" << endl;
    cout << "Are you a 1.buyer or 2.seller?" << endl;
    int userType;
    cin >> userType;
    cin.ignore();
    int uid = distribution(generator);
    cout << "Enter your email id: " << endl;
    string email;
    getline(cin, email);
    cout << "Enter your phone number: " << endl;
    string phNo;
    getline(cin, phNo);
    if (userType == 1) {
        buyer = new Buyer();
        cout << "Enter your name: " << endl;
        string buyerName;
        getline(cin, buyerName);
        cout << "Enter your address: " << endl;
        string address;
        getline(cin, address);
        if (buyer->set_details(uid, email, phNo) && buyer->set_name(buyerName) && buyer->set_address(address)) {
            cout << "Details updated successfully\nBuyer Name: " << buyer->getName() << "\nBuyer Address: " << buyer->getAddress() << endl;
        } else cout << "An error occured while updating user details" << endl;
    } else {
        seller = new Seller();
        cout << "Enter your location: " << endl;
        string location;
        getline(cin, location);
        cout << "Enter your seller name: " << endl;
        string sellerName;
        getline(cin, sellerName);
        if (seller->set_details(email, phNo, sellerName, location) && seller->set_location(location)) {
            cout << "Seller account created successfully\nSeller Name: " << seller->get_seller_name() << "\nSeller Location: " << seller->get_location() << endl;
        } else cout << "Error updating account details" << endl;
    }
    Product laptop;
    laptop.set_product_name("Pro Gaming Laptop");
    laptop.set_product_description("High-performance laptop with 16GB RAM.");
    laptop.set_price(1500);
    laptop.set_discount(100);
    cout << "\n--- Product Created ---\nProduct Name: " << laptop.get_product_name() << "\nProduct Description: " << laptop.get_product_description() << "\nProduct Price: " << laptop.get_product_price() << "\nProduct Discount: " << laptop.get_product_discount() << endl;
    laptop.get_details();
    Wishlist wishlist;
    wishlist.set_name("My Tech Wishlist");
    wishlist.add_item(laptop);
    cout << "\n--- Wishlist ---\nWishlist Name: " << wishlist.get_name() << "\nAdded '" << wishlist.get_wishlist()[0].get_product_name() << "' to wishlist." << endl;
    Cart cart;
    cart.add_item(laptop);
    int cartTotal = laptop.get_product_price() - laptop.get_product_discount();
    cout << "\n--- Shopping Cart ---\nAdded item to cart. Total Cart Value: $" << cartTotal << endl;
    cart.create_order();
    Order order;
    order.item_count = 1;
    order.add_order_item(121);
    order.set_order_status("Processing");
    order.set_order_date(20260809);
    order.place_order();
    cout << "\n--- Order Summary ---\nCurrent Order Status: " << order.get_status() << endl;
    Review review;
    review.set_review("Excellent Device!", "The laptop is extremely fast and handles games well.");
    review.set_seller_reply("Thank you for your purchase, John!");
    cout << "\n--- Customer Review ---\nTitle: " << review.get_review_title() << "\nText: " << review.get_review_text() << "\nSeller Reply: " << review.get_seller_reply() << endl;
    Sale blackFridaySale;
    blackFridaySale.name = "Black Friday Cyber Sale";
    blackFridaySale.add_offer(12);
    blackFridaySale.launch_sale();
    cout << "\n--- Active Sales ---\nSale Name: " << blackFridaySale.name << "\nCurrent Offer: " << blackFridaySale.offers[0] << endl;
    delete seller;
    delete buyer;
    return 0;
}
