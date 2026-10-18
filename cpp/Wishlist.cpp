#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class Wishlist
{
    string name;

public:
    int item_count = 0;
    vector<Product> wishlisted_items;
    vector<Product> &get_wishlist() { return wishlisted_items; }
    bool add_item(Product newItem)
    {
        wishlisted_items.push_back(newItem);
        return true;
    }
    bool set_name(string value)
    {
        name = value;
        return true;
    }
    string get_name() { return name; }
};
