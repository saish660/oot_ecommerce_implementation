#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class Sale {
public:
    string name, description, start_date;
    vector<int> offers;
    float duration_hours = 0;
    bool launch_sale() { return true; }
    bool stop_sale() { return true; }
    bool add_offer(int offer) { offers.push_back(offer); return true; }
    bool remove_offer(string offer) { return true; }
    float get_duration() { return duration_hours; }
    bool set_start_date(string date) { start_date = date; return true; }
};
