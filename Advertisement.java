/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class manages the advertisements shown on the system. It manages the ad balance, creation and managing the advertisements.

*/

import java.util.ArrayList;
import java.util.List;

public class Advertisement {
    private String product_id;
    private String category;
    private float ad_balance;    // stores how much the user has paid for the promotion and whats left of it
    public List<String> ad_media_src = new ArrayList<>();   //stores public urls of the media

    public int set_balance() {
        return (int)(Math.random() * 100);
    }

    public int set_category() {
        return 1;
    }

    public int add_media(String[] newMediaList) {
        return 1;
    }

    public String get_productId() {
        return this.product_id;
    }

    public String get_category() {
        return this.category;
    }

    public float get_adBalance() {
        return this.ad_balance;
    }
}