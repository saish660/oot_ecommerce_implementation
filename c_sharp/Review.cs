using System;
using System.Collections.Generic;

public class Review
{
    private int user_id;
    private string review_title = "";
    private string review_text = "";
    private string seller_reply = "";
    public List<string> media_src = new List<string>();
    public int set_review(string title, string text) { try { review_title = title; review_text = text; return 1; } catch (Exception) { return 0; } }
    public bool add_media() { return true; }
    public bool set_seller_reply(string reply) { try { seller_reply = reply; return true; } catch (Exception) { return false; } }
    public string get_review_title() { return review_title; }
    public string get_review_text() { return review_text; }
    public string get_seller_reply() { return seller_reply; }
}
