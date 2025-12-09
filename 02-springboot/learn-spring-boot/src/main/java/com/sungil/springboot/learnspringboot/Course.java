package com.sungil.springboot.learnspringboot;

public class Course {
    private int id;
    private String name;
    private String author;

    //Constructor
    public Course(int id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    //toString
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
