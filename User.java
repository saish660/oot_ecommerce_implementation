/*
    Author: Saish Gawade
    Roll no: 2639
    Description: This is the base class for creating any type of user on the platform. It includes the basic fields and function that is required by any type of user.

*/



public class User {
    public int user_id;
    public String email;
    protected String ph_no;
    private String password;

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

    public int login(int uid, String passwd) {
        return 1;
    }

}