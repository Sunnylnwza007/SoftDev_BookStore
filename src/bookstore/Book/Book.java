/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Book;

/**
 *
 * @author Nitipon Chingthong
 */
public class Book {
    public static String id, name,  author, priceBook, publisher, typeBook, publishYear, numPage,ISBN,numPrint,status; 


    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Book.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Book.name = name;
    }

 

    public static String getNameAuthor() {
        return author;
    }

    public static void setNameAuthor(String nameAuthor) {
        Book.author = nameAuthor;
    }

    public static String getPriceBook() {
        return priceBook;
    }

    public static void setPriceBook(String priceBook) {
        Book.priceBook = priceBook;
    }

    public static String getPublisher() {
        return publisher;
    }

    public static void setPublisher(String publisher) {
        Book.publisher = publisher;
    }

    public static String getTypeBook() {
        return typeBook;
    }

    public static void setTypeBook(String typeBook) {
        Book.typeBook = typeBook;
    }

    public static String getPublishYear() {
        return publishYear;
    }

    public static void setPublishYear(String publishYear) {
        Book.publishYear = publishYear;
    }

    public static String getNumpage() {
        return numPage;
    }

    public static void setNumpage(String Numpage) {
        Book.numPage = Numpage;
    }

    public static String getISBN() {
        return ISBN;
    }

    public static void setISBN(String ISBN) {
        Book.ISBN = ISBN;
    }

   
    
    
}
