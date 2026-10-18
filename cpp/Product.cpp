#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class Product {
    string product_id, name, description;
    int price = 0, discount = 0;
public:
    vector<string> image_src;
    float rating = 0;
    int stock = 0;
    bool update_stock() { return true; }
    void get_details() { cout << "ProductId: " << product_id << "\nName: " << name << "\nDescription: " << description << "\nPrice: " << price << "\nDiscount: " << discount << "\nRatings: " << rating << endl; }
    string get_product_id() { return product_id; }
    string get_product_name() { return name; }
    string get_product_description() { return description; }
    int get_product_price() { return price; }
    int get_product_discount() { return discount; }
    float get_product_rating() { return rating; }
    bool set_product_name(string value) { name = value; return true; }
    bool set_product_description(string value) { description = value; return true; }
    bool set_price(int value) { price = value; return true; }
    bool set_discount(int value) { discount = value; return true; }
};
