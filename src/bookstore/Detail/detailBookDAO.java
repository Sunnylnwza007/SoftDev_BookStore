/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Detail;

import bookstore.Book.Book;
import static bookstore.Database.UserDAO.db;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

/**
 *
 * @author Nitipon Chingthong
 */
public class DetailBookDAO {
     public void getBookByProduct (String idBook) {
        
        MongoCollection<Document> book = db.getCollection("book");
        Document findBook = new Document("book_id", idBook );
        MongoCursor<Document> cursor = book.find(findBook).iterator();
        
         try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                String book_id = doc.getString("book_id");
                String name = doc.getString("name");
                String price = doc.getString("price");
                String writer = doc.getString("writer");
                String publisher = doc.getString("publisher");
                String type = doc.getString("doc_type");
                String writeyear = doc.getString("writeyear");
                String page = doc.getString("page");
                String isbn = doc.getString("isbn");
                String writenum = doc.getString("writenum");
                String amount = doc.getString("amount");
                               
                Book.setId(book_id);
                Book.setName(name);
                Book.setPrice(price);
                Book.setWriter(writer);
                Book.setPublisher(publisher);
                Book.setType(type);
                Book.setWriteyear(writeyear);
                Book.setPage(page);
                Book.setISBN(isbn);
                Book.setWritenum(writenum);
                Book.setAmount(amount);
                
            }
        }
         finally {}
    }
     
    public void setToCartDB (String userName, String bookName, String numOrder, String priceBook) {
        MongoCollection<Document> book = db.getCollection("cart");
        Document insert = new Document("user", userName).append("bookname", bookName).append("num", numOrder).append("price", priceBook);
        
        book.insertOne(insert);
        
    }
}
