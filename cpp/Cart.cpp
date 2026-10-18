#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class Cart {
    vector<Product> products;
    int total_price = 0;
public:
    bool add_item(Product newItem) { products.push_back(newItem); return true; }
    bool remove_item(Product item) { return true; }
    bool create_order() { return true; }
    vector<Product>& get_products() { return products; }
    int get_total() { return total_price; }
};
