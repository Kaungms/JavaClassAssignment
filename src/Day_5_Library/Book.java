package Day_5_Library;

public class Book {
    private String title;
    private String subtitle;
    private static int bookCount;

    public Book(String title){
        this.title = title;
        bookCount++;
    }

    public Book(String title,String subtitle){
        this.title = title;
        this.subtitle = subtitle;
        bookCount++;
    }

    public void displayInfo(){

        if (!(subtitle == null)){
            System.out.println("Title: "+title);
            System.out.println("Subtitle: "+subtitle);
        }else{
            System.out.println("Title: "+title);
            System.out.println("");

        }

    }

    public static int getbookCount(){
        return bookCount;
    }

}
