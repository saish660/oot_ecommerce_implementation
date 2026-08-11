/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class represents the sale events occuring on the platform. It stores data about the sale, offers in the sale. A sale can be created, launched and stopped.
*/

import java.util.ArrayList;
import java.util.List;

public class Sale {
    public String name;
    public String description;
    public List<Integer> offers = new ArrayList<>(); // stores the pid of the products (discount is stored with the
                                                     // product itself)
    public String start_date;
    public float duration_hours; // How long the sale will last from start date

    public boolean launch_sale() {
        return true;
    }

    public boolean stop_sale() {
        return true;
    }

    public boolean add_offer(int offer) {
        try {
            this.offers.add(offer);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean remove_offer(String offer) {
        return true;
    }

    public float get_duration() {
        return this.duration_hours;
    }

    public boolean set_start_date(String date) {
        try {
            this.start_date = date;
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}