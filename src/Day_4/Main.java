package Day_4;

public class Main {
    public static void main(String[] args) {
        Bankaccount acc = new Bankaccount("39049",8000);
        acc.display();

        acc.withdraw(2000);
        acc.display();




    }
}
