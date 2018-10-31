/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Login;

import bookstore.Database.DatabaseConnect;

/**
 *
 * @author KIATS
 */
public class LoginService {
    
    public static String username , password , usertype;

    public static String checkUser(String username ,  String password){
        usertype = DatabaseConnect.checkUser(username, password);
        return usertype;
    }
    
}
