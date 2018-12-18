/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.SearchBook;

import bookstore.Book.Book;
/**
 *
 * @author KIATS
 */
public class SearchBookService {
    
    public static void getBook (int bookId) {
        SearchBookDAO.getBookById(bookId);
    };
    
    public static String getListOfBook (int bookId) {
        return SearchBookDAO.listOfBook.get(bookId);
    }
    
    public static int getBookName (String type, String text) {
        if ( type.equals("name") ) {
            return SearchBookDAO.getBookByName(text);
        }
        else if ( type.equals("writer") ) {
            return SearchBookDAO.getBookByWriter(text);
        }
        else {
            return 0;
        }
        
    }
   

}
