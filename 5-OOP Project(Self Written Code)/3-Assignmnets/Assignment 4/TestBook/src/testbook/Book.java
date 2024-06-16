/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbook;

/**
 *
 * @author saeed
 */
public class Book {
    private String title,name;
    private int yearpub;

    public Book(String title, String name, int yearpub) {
        this.title = title;
        this.name = name;
        this.yearpub = yearpub;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearpub() {
        return yearpub;
    }

    public void setYearpub(int yearpub) {
        this.yearpub = yearpub;
    }
    @Override
    public String toString()
    {
        return String.format("Name:%s   Year Of Publication:%d      Book Titale:%s" ,this.getName(),this.getYearpub(),this.getTitle());
    }
    
}
