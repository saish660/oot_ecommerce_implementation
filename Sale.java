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

    public int launch_sale() {
        return 1;
    }

    public int stop_sale() {
        return 1;
    }

    public int add_offer(int offer) {
        try {
            this.offers.add(offer);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int remove_offer(String offer) {
        return 1;
    }

    public float get_duration() {
        return this.duration_hours;
    }

    public int set_start_date(String date) {
        try {
            this.start_date = date;
        } catch (Exception e) {
            return 0;
        }

        return 1;
    }

}