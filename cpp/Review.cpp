#include <iostream>
#include <string>
#include <vector>
#include <random>
using namespace std;

class Review
{
    int user_id = 0;
    string review_title, review_text, seller_reply;

public:
    vector<string> media_src;
    int set_review(string title, string text)
    {
        review_title = title;
        review_text = text;
        return 1;
    }
    bool add_media() { return true; }
    bool set_seller_reply(string reply)
    {
        seller_reply = reply;
        return true;
    }
    string get_review_title() { return review_title; }
    string get_review_text() { return review_text; }
    string get_seller_reply() { return seller_reply; }
};
