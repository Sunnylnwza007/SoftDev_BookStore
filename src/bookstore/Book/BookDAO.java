/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Book;

import static bookstore.Database.UserDAO.db;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author dell
 */
public class BookDAO {
    
    public static String getBook(int i){
        
        String setOfBook = "";
        MongoCollection<Document> room = db.getCollection("book");
        Document findBook = new Document("book_id",Integer.toString(i));
        MongoCursor<Document> cursor = room.find(findBook).iterator();
         try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                String book_id = doc.getString("book_id");
                String name = doc.getString("name");
                String price = doc.getString("price");
                String author = doc.getString("writer");
                String publisher = doc.getString("publisher");
                String typeBook = doc.getString("doc_type");
                String publishYear = doc.getString("writeyear");
                String numPage = doc.getString("page");
                String ISBN = doc.getString("isbn");
                
                
                setOfBook = book_id + "/" + name + "/" + price + "/" + author + "/" 
                        + publisher + "/" + typeBook + "/" + publishYear + "/" 
                        + numPage + "/" + ISBN;
       
            }
        } finally {}
         return setOfBook;
    }
    
    
    
}
