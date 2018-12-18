/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.CartBook;

/**
 *
 * @author dell
 */
public class CartService {

    public Cart searchCart(String user) {
        CartDAO cartDao = new CartDAO();
        return cartDao.getCart(user);
    }

    public void deleteBook(String bookName, String num, String price) {
        CartDAO cartDao = new CartDAO();
        cartDao.deleteBook(bookName, num, price);
    }

    public void addAddress(Address ad, String user) {
        CartDAO cartDao = new CartDAO();
        cartDao.insertAddress(ad, user);
    }

    public Address setAddress(String user) {
        CartDAO cartDao = new CartDAO();
        return cartDao.setAddress(user);
    }

}
