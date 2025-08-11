package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Data
public class Book {
    private Long id;
    private String title;
    private String author;
    private Long serialno;
    private Long pages;

    //constructors
    public Book(Long id, String title, String author, Long serialno, Long pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.serialno = serialno;
        this.pages = pages;
    }

//    //Getters and setters
    //no need for this since we have @Getter and setters defined in the beginning with the help of lombock
//    public long getId() {
//        return id;
//    }
//    public void setId(long id) {
//        this.id = id;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public String getAuthor() {
//        return author;
//    }
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//    public int getSerialno() {
//        return serialno;
//    }
//    public void setSerialno(int serialno) {
//        this.serialno = serialno;
//    }
//    public int getPages() {
//        return pages;
//    }
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
}
