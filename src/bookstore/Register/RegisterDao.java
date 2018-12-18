/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Register;
import static bookstore.Database.UserDAO.db;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
/**
 *
 * @author dell
 */
public class RegisterDAO {
    public boolean checkUsername(String username){
        MongoCollection <Document> userCollection = db.getCollection("user");
        Document findUser = new Document("username",username);
        MongoCursor <Document> cursor = userCollection.find(findUser).iterator();
        boolean check = false;
        if (cursor.hasNext()){
            check = true;
        }
        return check;
    }
    
    public void addUser(String username,String name,String surname,String password){
         MongoCollection <Document> userCollection = db.getCollection("user");
         Document User = new Document("username",username).append("password", password).append("firstname", name)
                 .append("lastname", surname).append("usertype", "user");
         userCollection.insertOne(User);
    }
}
