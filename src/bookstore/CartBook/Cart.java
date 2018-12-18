/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.CartBook;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Cart {
    ArrayList <String> bookName = new ArrayList<String>();
    ArrayList <String> num = new ArrayList<String>();
    ArrayList <String> price = new ArrayList<String>();
    
     public void addBookName (String bookname) {
         this.bookName.add(bookname);
     }
     
     public void addNum (String num) {
         this.num.add(num);
     }
     
     public void addPrice(String price) {
        this.price.add(price);
     }
     
     public String getBookName (int positionOfBookInCart) {
         return bookName.get(positionOfBookInCart);
     }
     
      public String getNum (int positionOfBookInCart) {
         return num.get(positionOfBookInCart);
     }
      
      public String getPrice (int positionOfBookInCart) {
         return price.get(positionOfBookInCart);
     }
     
     public int numberOfProductInCart() {
        try{
         return bookName.size();
        }catch(Exception e){
            return 0;
        }
     }
     
     public void deleteListCart (int positionOfBookInCart) {
         bookName.remove(positionOfBookInCart);
         num.remove(positionOfBookInCart);
         price.remove(positionOfBookInCart);
     }
        
    }
