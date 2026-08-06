/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class manages the advertisements shown on the system. It manages the ad balance, creation and managing the advertisements.

*/

import java.util.ArrayList;
import java.util.List;

public class Advertisement {
    public String product_id;
    public String category;
    public float ad_balance;    // stores how much the user has paid for the promotion and whats left of it
    public List<String> ad_media_src = new ArrayList<>();   //stores public urls of the media

    public int update_balance() {
        return (int)(Math.random() * 100);
    }

    public int update_category() {
        return 1;
    }

    public int update_media(String[] newMediaList) {
        return 1;
    } 
}