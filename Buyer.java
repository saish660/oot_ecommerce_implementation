/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This class is extended from the User base class. It represents the buyer/customer accounts on the platform. It stores and manages their details and data.

*/


import java.util.ArrayList;
import java.util.List;

public class Buyer extends User {
    public String address;
    public String name;
    public List<String> paymentOptions = new ArrayList<>(); //Only stores the names of the payment options, further linking is done seperately

    public boolean update_details(int uid, String email, String ph_no) {
        try {
            this.user_id = uid;
            this.email = email;
            this.ph_no = ph_no;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean add_payment_option(String payment_method) {
        try {
            this.paymentOptions.add(payment_method);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean place_order() {
        return true;
    }

    public int[] get_cart() {
        return new int[]{1, 2};
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}