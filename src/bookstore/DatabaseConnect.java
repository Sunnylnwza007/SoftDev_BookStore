/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author KIATS
 */
public class DatabaseConnect {
    
    static MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds243212.mlab.com:43212/ox-project"); 
    static MongoClient client = new MongoClient(uri);
    static MongoDatabase db = client.getDatabase(uri.getDatabase());
    
}
