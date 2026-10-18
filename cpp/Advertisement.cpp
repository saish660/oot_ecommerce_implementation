#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class Advertisement {
    string product_id, category;
    float ad_balance = 0;
public:
    vector<string> ad_media_src;
    int set_balance() { return rand() % 100; }
    int set_category(string value) { category = value; return 1; }
    int add_media(vector<string> newMediaList) { return 1; }
    string get_productId() { return product_id; }
    string get_category() { return category; }
    float get_adBalance() { return ad_balance; }
};
