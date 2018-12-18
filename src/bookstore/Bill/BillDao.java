/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Bill;

import bookstore.CartBook.CartService;
import bookstore.Database.User;
import static bookstore.Database.UserDAO.db;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import org.bson.Document;

public class BillDAO {
    
    ArrayList<String> bookName = new ArrayList<String>();
    ArrayList<String> num = new ArrayList<String>();
    ArrayList<String> price = new ArrayList<String>();
    
    public int getCountAllBook(){

        MongoCollection<Document> bill = db.getCollection("bill");
        Document findUser = new Document();
        MongoCursor<Document> cursor = bill.find(findUser).iterator();
        int count = 0;
         try {
            while (cursor.hasNext()) {
              cursor.next();
                    count++;
       
            }
        } finally {}
         return count;
    }
    
     public void insertBill(ArrayList<String> bookName, ArrayList<String> num, ArrayList<String> price,int total){
        this.bookName = bookName;
        this.num = num;
        this.price = price;
        
        MongoCollection<Document>  billCol = db.getCollection("bill");
        int idNumber = getBillId();
        Document insert = new Document("id",idNumber+"").append("bookname", bookName).append("num", num).append("price", price);
        
        billCol.insertOne(insert);      
    }
     public int getBillId(){
          int idNumber = getCountAllBook()+1;
          return idNumber;
     }
        
     public void deleteCart(){
         MongoCollection<Document>  cartCollection = db.getCollection("cart");
         String user = User.getName();
         Document findBook = new Document("user",user);
         cartCollection.deleteMany(findBook);
     }
     
     public void setStock (ArrayList<String> bookName,ArrayList<String> num){
         MongoCollection<Document>  bookCollection = db.getCollection("book");
         ArrayList<String> amount = new ArrayList<String>();
         for (int i = 0;i<bookName.size();i++){
              Document findAmount = new Document("name",bookName.get(i));
              MongoCursor<Document> cursor = bookCollection.find(findAmount).iterator();
              try{
              Document doc = cursor.next();
              amount.add(doc.getString("amount"));
              }finally {}
         }
         for (int i = 0;i<bookName.size();i++){
              Document update = new Document("name",bookName.get(i));
              int amount1 =  Integer.parseInt(amount.get(i))-Integer.parseInt(num.get(i));
              System.out.println(amount1);
              System.out.println(String.valueOf(amount1));
              bookCollection.updateOne(update, new Document("$set", new Document("amount", String.valueOf(amount1))));
         }
         
     }
}
