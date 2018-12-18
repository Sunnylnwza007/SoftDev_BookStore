/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Detail;

import bookstore.Book.Book;
import bookstore.Database.User;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nitipon Chingthong
 */
public class DetailBookService {
    public static void setProductDetail(String idBook) {
        DetailBookDAO detail = new DetailBookDAO();
        detail.getBookByProduct(idBook);   
    }
    
    public static void addToCart (String userName, String bookName, String numOrder, String priceBook) {
        if ( checkLogin() && checkBookAmount(numOrder) ) {
            DetailBookDAO detail = new DetailBookDAO();
            detail.setToCartDB(userName ,bookName, numOrder, priceBook);
            showMessageAddComplete( ); 
        }     
    }

    public static void showMessageAddComplete() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "add complete!!." );
    }
    
    public static Boolean checkBookAmount (String numOrder){
        
        try{
           
            if ( Integer.parseInt(numOrder) > Integer.parseInt(Book.getAmount()) && Integer.parseInt(numOrder) > 0) {
                showMesssageProductNotEnough( ); 
                return false;
            }
            else if (Integer.parseInt(numOrder) <= 0){
                showMessageEnterNumber();
                return false;
            }
        }catch(Exception e){
            showMessageEnterNumber();
           return false;
        }
        
        return true;
    }

    public static void showMessageEnterNumber() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Please enter a number.");
    }

    public static void showMesssageProductNotEnough() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Product is not enough." );
    }
    
    public static Boolean checkOutOfStock() {
        if ( Integer.parseInt(Book.getAmount() ) <= 0 ) {
                showMessageOutOfStock( ); 
                return false; 
        }
        else {
            return true;
        }
    }

    public static void showMessageOutOfStock() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Out of stock!!." );
    }
    
     public static Boolean checkLogin() {
        if ( User.getName().equals("")) {
            showMessagePleaseLogin( );
            return false;
        }
        else {
            return checkOutOfStock();
        }
    }

    public static void showMessagePleaseLogin() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Please, login." );
    }
}
