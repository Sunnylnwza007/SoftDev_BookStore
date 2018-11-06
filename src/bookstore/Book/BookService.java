/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Book;

import bookstore.Database.DatabaseConnect;
import java.util.Map;
/**
 *
 * @author Nitipon Chingthong
 */
public class BookService {
    public static Map<String, String> getBookList(int i){
        
        return DatabaseConnect.getBookList(i);
    };
    
}
