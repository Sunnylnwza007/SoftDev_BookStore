/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Database;

/**
 *
 * @author KIATS
 */
public class User {

    public static String username, password, usertype;

    public static void setUser(String username, String password, String usertype){
        User.username = username;
        User.password = password;
        User.usertype = usertype;
    }
    
}
