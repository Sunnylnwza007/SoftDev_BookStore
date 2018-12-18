/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.AllBook;

import bookstore.Book.Book;

/**
 *
 * @author RUNGSIMAN KAEWSOPAK
 */
public class AllBookService {
    
    public static String getListOfBook (int i) {
        return AllBookDAO.listOfBook.get(i);
    }

    public static int countBook(){
        return AllBookDAO.getBookByName();
    }
    
}
