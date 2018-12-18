/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.AllBook;

import bookstore.Book.Book;
import static bookstore.SearchBook.SearchBookDAO.db;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author RUNGSIMAN KAEWSOPAK
 */
public class AllBookDAO {

    static ArrayList<String> listOfBook = new ArrayList<>();

    public static int getBookByName() {
        
        int countBook = 0;
        listOfBook.clear();
        MongoCollection<Document> book = db.getCollection("book");
        MongoCursor<Document> cursor = book.find().iterator();

        try {
            
            while (cursor.hasNext()) {

                Document doc = cursor.next();

                String name = doc.getString("name");
                String book_id = doc.getString("book_id");
                String price = doc.getString("price");

                Book.setId(book_id);
                Book.setName(name);
                Book.setPrice(price);

                listOfBook.add(book_id + "/" + name + "/" + price);
                
                countBook++;

            }
        } finally {

        }

        return countBook;
    }
}
