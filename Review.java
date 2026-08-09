/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class represents the reviews written by buyers and also the replies to the reviews written by sellers.
*/


import java.util.ArrayList;
import java.util.List;

public class Review {
    private int user_id;
    private String review_title;
    private String review_text;
    private String seller_reply;
    public List<String> media_src = new ArrayList<>();  // public urls of the media

    public int set_review(String review_title, String review_text) {
        try {
            if (review_title.isEmpty()) {
                this.review_title = review_title;
            } else  {
                this.review_title = review_title;
            }

            if (review_text.isEmpty()) {
                this.review_text = review_text;
            } else  {
                this.review_text = review_text;
            }

            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int add_media() {
        return 1;
    }

    public int set_seller_reply(String reply) {
        try {
            this.seller_reply = reply;
            return 1;
        } catch(Exception e) {
            return 0;
        }
    }

    public String get_review_title() {
        return this.review_title;
    }

    public String get_review_text() {
        return this.review_text;
    }

    public String get_seller_reply() {
        return this.seller_reply;
    }


}