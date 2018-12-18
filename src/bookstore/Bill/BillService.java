/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Bill;

import java.util.ArrayList;

/**
 *
 * @author KIATS
 */
public class BillService {
    
    public void addBillToDatabase(ArrayList<String> bookName, ArrayList<String> num, ArrayList<String> price,int total){
        new bookstore.Bill.BillDAO().insertBill(bookName, num, price, total);
        
    }
    
    public void removeCart(){
        new bookstore.Bill.BillDAO().deleteCart();
    }
    
    public void updateStock(ArrayList<String> bookName,ArrayList<String> num){
        new bookstore.Bill.BillDAO().setStock(bookName,num);
    }
}
