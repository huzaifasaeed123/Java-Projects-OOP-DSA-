/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbook;

/**
 *
 * @author saeed
 */
public class PrintBook extends Book
{
    private String publisher;
    private String ISBN;

    public PrintBook(String publisher, String ISBN, String title, String name, int yearpub) {
        super(title, name, yearpub);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s\nPublisher:%s\nISBN:%s\n",super.toString(),this.getPublisher(),this.getISBN());
    }
    
    
}
