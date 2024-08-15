package Day_5_Library;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Book getBooksInfo() throws IOException {
        System.out.print("Enter details for a new book: ");
        String title = br.readLine();
        System.out.print("Subtitle (or press Enter to skip): ");
        String subtitle = br.readLine();

        Book book;
        if (subtitle.isEmpty()){
            book = new Book(title);
        }else{
            book = new Book(title,subtitle);
        }

        return book;

    }

    public static void main(String[] args) throws IOException {
        String flag;
        do{
            Book book = getBooksInfo();
            Library.addBook(book);
            System.out.print("Do you want to add another book? yes/no: ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));

        Library.displayBooks();



    }
}
