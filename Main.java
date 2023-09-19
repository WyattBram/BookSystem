import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<Item>();
        Scanner x = new Scanner(System.in);
        String type;

        for(int i = 0; i < 5; i++){
            String name;
            String author;
            int isbn;
            System.out.println("Please enter B for Book or P for Periodical");
            type = x.nextLine();


            if(type.equals("B")){
                System.out.println("Please enter the name of the Book: ");
                name = x.nextLine();
                System.out.println("Please enter the author of the Book: ");
                author = x.nextLine();
                System.out.println("Please enter the ISBN of the Book: ");
                isbn = x.nextInt();
                x.nextLine();
                list.add(new Book(isbn, author, name));
            }
            else if(type.equals("P")){
                System.out.println("Please enter the author of the Periodical: ");
                name = x.nextLine();
                System.out.println("Please enter the issue number: ");
                isbn = x.nextInt();
                x.nextLine();
                list.add(new Periodicals(isbn, name));
            }
        }
        System.out.println("Your Items: ");
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i).getListing() + "\n");
        }
    }
}
