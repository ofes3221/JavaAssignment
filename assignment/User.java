package assignment;

public class User {
    private int userid;
    private String username;
    private String email;


public User(int userid,String username,String email ) {
this.userid=userid;
    this.username=username;
    this.email=email;
}
String getusername() {
   return username;
}
    String getuserDetails() {
        return "Username: " + username + ", UserID: " + userid + ", Email: " + email;
    }
}
