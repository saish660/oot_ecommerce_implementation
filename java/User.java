/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This is the base class for creating any type of user on the platform. It includes the basic fields and function that is required by any type of user.

*/

public class User {
    protected int user_id;
    protected String email;
    protected String ph_no;
    protected String password;

    public boolean register(int uid, String email, String ph_no, String passwd) {
        try {
            this.user_id = uid;
            this.email = email;
            this.ph_no = ph_no;
            this.password = passwd;
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean set_uid(int uid) {
        try {
            this.user_id = uid;
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean set_email(String email) {
        try {
            this.email = email;
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean set_ph_no(String ph_no) {
        try {
            this.ph_no = ph_no;
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean set_passwd(String passwd) {
        try {
            this.password = passwd;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean login(int uid, String passwd) {
        return true;
    }

    public String get_user_email() {
        return this.email;
    }

    public String get_ph_no() {
        return this.ph_no;
    }

}