/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Database;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author KIATS
 */
public class DatabaseConnect {
    
    public static MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds145563.mlab.com:45563/book_shop"); 
    public static MongoClient client = new MongoClient(uri);
    public static MongoDatabase db = client.getDatabase(uri.getDatabase());
    
    public static String checkUser(String username , String password){
        String usertype = "";
        
        MongoCollection<Document> room = db.getCollection("user");
        Document findUser = new Document("username",username).append("password", password);
        MongoCursor<Document> cursor = room.find(findUser).iterator();
         try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                usertype = doc.getString("usertype");            
       
            }
        } finally {}
         return usertype;
    }
    
    public static String getBook(){
        String id,name,price;
        
         
            
            
        return "id";
    }
    
    public static Map<String, String> getBookList(int i){
        int id=0;
        Map<String, String> bookDetail = new HashMap<>();
        Map<String, String> bookDetailFalse = new HashMap<>();
        MongoCollection<Document> book = db.getCollection("book");
        Document findBook = new Document("book_id",String.valueOf(i));
        MongoCursor<Document> cursor = book.find(findBook).iterator();
        //do things to get the Map built
          try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                
         
                bookDetail.put("id", doc.getString("book_id"));
                bookDetail.put("name", doc.getString("name"));
                bookDetail.put("price", doc.getString("price"));
                
                
                id = Integer.parseInt(doc.getString("book_id"));
                
                if(id == i){
                    return bookDetail;
                }
            }
        } finally {}
        
        return null;
    }
    
}
