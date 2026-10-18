#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class Order {
    string order_id, order_status;
    int total_price = 0, order_date = 0;
    vector<int> order_items;
public:
    int item_count = 0;
    bool place_order() { return true; }
    bool cancel_order() { return true; }
    bool add_order_item(int product_id) { order_items.push_back(product_id); return true; }
    bool set_order_date(int value) { order_date = value; return true; }
    bool set_order_status(string value) { order_status = value; return true; }
    string get_status() { return order_status; }
    int get_total_price() { return total_price; }
    int get_order_date() { return order_date; }
    vector<int>& get_order_items() { return order_items; }
    string get_order_id() { return order_id; }
};
