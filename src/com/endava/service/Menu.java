package com.endava.service;

import com.endava.entities.*;
import com.endava.validator.Validator;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private Integer buff;

    private Validator validator = new Validator();
    private List<Book> books = new ArrayList<>();

    public Menu(){
        books.add(new Book(1, new Title("The Hunger Games"), new Author("Suzanne Collins"), new ISBN("0439023483"), new Language("English"), new Publisher("Scholastic Press"), new Year("2008")));
        books.add(new Book(2, new Title("Harry Potter"), new Author("J.K. Rowling"), new ISBN("0439358078"), new Language("English"), new Publisher("Scholastic Inc."), new Year("1998")));
        books.add(new Book(3, new Title("To Kill a Mockingbird"), new Author("Harper Lee"), new ISBN("0061120081"), new Language("English"), new Publisher("Harper Perennial Modern Classics"), new Year("2006")));
    }

    public void pointer(){

        System.out.println("Commands" + "\n" +
                "1. Find Book too reed it" + "\n" +
                "2. Insert/Update Book" + "\n" +
                "3. Dell Book" + "\n" +
                "4. Show All Books" + "\n" +
                "5. Exit");

        buff = validator.isDigit();

        if (buff == 1) find();
        else if (buff == 2) insert();
        else if (buff == 3) dell();
        else if (buff == 4) showTitle();
        else if (buff == 5) System.out.println("Buy Buy !! =)");

    }

    private void showTitle(){
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle().getPart() + ", " + books.get(i).getAuthor().getPart() + ", ID :" + books.get(i).getID());
        }
        pointer();
    }

    private void dell(){

        System.out.println("Please point ID of book to dell : ");
        buff = validator.isDigit();
        boolean done = validator.findID(buff, books);

        int a = 1000;

        if (done) {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getID() == buff) a = i;
            }
            books.remove(a);
        }
        else System.out.println("No Such ID");
        pointer();
    }


    private void insert(){
        boolean done = false;

        System.out.println("Please insert ID Number for Book");
        buff = validator.isDigit();
        //done = validator.findID(buff, books);


        System.out.println("Please insert Title");
        String title = validator.isString();

        System.out.println("Please insert Author");
        String author = validator.isString();

        System.out.println("Please insert Publisher");
        String publisher = validator.isString();

        System.out.println("Please insert ISBN");
        String isbn = validator.isString();

        System.out.println("Please insert Year");
        Integer year = validator.isDigit();

        System.out.println("Please insert Language");
        String language = validator.isString();

        books.add(new Book(buff, new Title(title), new Author(author), new ISBN(isbn), new Language(language), new Publisher(publisher), new Year(year.toString())));

        System.out.println("This is it : " );
        getBook(buff);

        pointer();
    }

    public void getBook(int key){
        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getID() == key){
                System.out.println("Title : " + books.get(i).getID());
                System.out.println("Author : " + books.get(i).getAuthor().getPart());
                System.out.println("Publisher : " + books.get(i).getPublisher().getPart());
                System.out.println("ISBN : " + books.get(i).getIsbn().getPart());
                System.out.println("Year : " + books.get(i).getYear().getPart());
                System.out.println("Language : " + books.get(i).getLanguage().getPart());
            }
        }
    }

    private void find(){
        System.out.println("Find by ID");

        buff = validator.isDigit();
        if (validator.findID(buff, books)) getBook(buff);
        else System.out.println("No Such ID");

        pointer();
    }

}
