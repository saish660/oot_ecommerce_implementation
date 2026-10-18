#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class Seller : public User
{
    string seller_id, seller_name, location;
    vector<Product> products;

public:
    float avg_rating = 0;
    bool set_details(string new_email, string new_ph_no, string name, string place)
    {
        email = new_email;
        ph_no = new_ph_no;
        seller_name = name;
        location = place;
        return true;
    }
    bool set_location(string value)
    {
        location = value;
        return true;
    }
    vector<string> get_products() { return {"product1", "product2"}; }
    string get_location() { return location; }
    string get_seller_id() { return seller_id; }
    string get_seller_name() { return seller_name; }
};
