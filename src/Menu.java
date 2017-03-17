import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String buff;

    private Title title = new Title();
    private Author author = new Author();
    private Publisher publisher = new Publisher();
    private ISBN isbn = new ISBN();
    private Year year = new Year();
    private Languege languege = new Languege();

    Menu(){
        System.out.println("Welcome to our Library");
        System.out.println("You can : ");
        /*System.out.println("1. Find Book too reed it");
        System.out.println("2. Insert/Update Book");
        System.out.println("3. Dell Book");
        System.out.println("4. Dell Book");*/
    }

    public void getBook(int key){
        System.out.println("Title : " + title.getData(key));
        System.out.println("Author : " + author.getData(key));
        System.out.println("Publisher : " + publisher.getData(key));
        System.out.println("ISBN : " + isbn.getData(key));
        System.out.println("Year : " + year.getData(key));
        System.out.println("Language : " + languege.getData(key));
    }

    public void pointer(){
        try {

            System.out.println("Commands" + "\n" + "1. Find Book too reed it" + "\n" + "2. Insert/Update Book" + "\n" + "3. Dell Book" + "\n" + "4. Show all Title" + "\n" + "5. Exit");
            buff = reader.readLine();
            if (buff.equals("1")) find();
            else if (buff.equals("2")) insert();
            else if (buff.equals("3")) dell();
            else if (buff.equals("4")) showTitle();
            else if (buff.equals("5")) System.out.println("By By !! =)");
        } catch (IOException e) {
            System.out.println("Error command");
            pointer();
        }

    }

    private void showTitle(){
        for (int i = 0; i < title.size(); i++) {
            System.out.println(title.getData(i));
        }
        pointer();
    }

    private void dell(){
        System.out.println("Please point Number of book to dell : ");
        try {
            int key = reader.read();
            title.remove(key);
            author.remove(key);
            publisher.remove(key);
            isbn.remove(key);
            year.remove(key);
            languege.remove(key);

            pointer();
        } catch (IOException e) {
            System.out.println("Error command");
            pointer();
        }
    }

    private void insert(){
        System.out.println("Please point Number for Book");

        try {
            int key = reader.read();
            reader.readLine();

            System.out.println("Please insert Title");
            title.setUpdateData(key, reader.readLine());

            System.out.println("Please insert Author");
            author.setUpdateData(key, reader.readLine());

            System.out.println("Please insert Publisher");
            publisher.setUpdateData(key, reader.readLine());

            System.out.println("Please insert Year");
            year.setUpdateData(key, reader.readLine());

            System.out.println("Please insert Language");
            languege.setUpdateData(key, reader.readLine());

            System.out.println("This is it : " );
            getBook(key);

            pointer();

        } catch (IOException e) {
            System.out.println("Error command");
            pointer();
        }
    }

    private void find(){
        System.out.println("Find by" + "\n" + "1. Title" + "\n" + "2. Author" + "\n" + "3. ISBN");
        try {
            buff = reader.readLine();
            if (buff.equals("1")){
                int keyNum = -1;
                buff = reader.readLine();
                for (int i = 0; i < title.size(); i++) {
                    if (buff.equals(title.getData(i))) keyNum = i;
                }

                if (keyNum >= 0) getBook(keyNum);
                else {
                    System.out.println("Sorry no such Title");
                    pointer();
                }
                pointer();
            } else if (buff.equals("2")){
                int keyNum = -1;
                buff = reader.readLine();
                for (int i = 0; i < author.size(); i++) {
                    if (buff.equals(author.getData(i))) keyNum = i;
                }

                if (keyNum >= 0) getBook(keyNum);
                else {
                    System.out.println("Sorry no such Author");
                    pointer();
                }
                pointer();
            }else if (buff.equals("1")){
                int keyNum = -1;
                buff = reader.readLine();
                for (int i = 0; i < isbn.size(); i++) {
                    if (buff.equals(isbn.getData(i))) keyNum = i;
                }

                if (keyNum >= 0) getBook(keyNum);
                else {
                    System.out.println("Sorry no such Author");
                    pointer();
                }
                pointer();
            }
        } catch (IOException e) {
            System.out.println("Error command");
            pointer();
        }

    }

}
