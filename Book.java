package HW_Les_9;

import com.fasterxml.jackson.databind.ObjectMapper;

class Book {
     
    private String id;
    private String title;
    private String author;
    private int year;
    private Double price;
    private String genre;
    private String bookPublishingHouse;

    public Book(String id, String title, String author, int year, Double price, String genre, String bookPublishingHouse){
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.genre = genre;
        this.bookPublishingHouse = bookPublishingHouse;
    }

    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getYear(){
        return year;
    }
    public Double getPrice(){
        return price;
    }
    public String getGenre(){
        return genre;
    }
    public String getBookPublishingHouse(){
        return bookPublishingHouse;
    }
    
    public void setId(String id){
        this.id = id; 
    }
    public void setTitle(String title){
        this.title = title; 
    }
    public void setAuthor(String author){
        this.author = author; 
    }
    public void setYear(String year){
        this.year = year; 
    }
    public void setPrice(Double price){
        this.price = price;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
     public void setBookPublishingHouse(String bookPublishingHouse){
        this.bookPublishingHouse = bookPublishingHouse;
    }
    public String getInfo() {
        return String.format("ID: %s, Title: %s, Author: %s,  Price: %d.", 
        this.id, this.title, this.author, this.year, this.price, this.genre, this.bookPublishingHouse, this.getClass().getSimpleName());
    }
       
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}