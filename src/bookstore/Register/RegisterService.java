/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Register;

/**
 *
 * @author KIATS
 */
public class RegisterService {
    public boolean checkUsername(String username){
        RegisterDAO RegDao = new RegisterDAO();
        return RegDao.checkUsername(username);
    }
    
    public void addUser(String username,String name,String surname,String password){
        RegisterDAO RegDao = new RegisterDAO();
        RegDao.addUser(username,name,surname,password);
    }
}
