
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Istina
 */
public class User {
    private static int nextId = 1;
    private String userId;
    private String userName;
    private String password;
    private static ArrayList<User> users;
    private static User loggedInUser; // Static variable to store the currently logged-in user
 

    public User(String userName, String password) {
        this.userId = "USER" + nextId++;
        this.userName = userName;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    //method to verify username and password of User
    //returns a boolean value - true if the login is successful, false otherwise.
 public static boolean userLogin(String username, String password) {
        // Check if the user exists in the list
        for (User user : getUsers()) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                loggedInUser = user; // Set the currently logged-in user
                return true; // User found, login successful
            }
        }
        return false; // User not found, login unsuccessful
    }

    // Method to get the currently logged-in user's name
    public static String getLoggedInUser() {
        return loggedInUser.getUserName();
    }
    
    //adding users/operators to the system
    public static List<User> getUsers() {
        users = new ArrayList<>();
       
        users.add(new User("mary", "123"));
        users.add(new User("istina", "123"));
        
        return users;
    }
    
}
