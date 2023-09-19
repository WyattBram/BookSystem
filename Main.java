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
                list.add(new Book(isbn, author, name));
            }
            else if(type.equals("P")){
                System.out.println("Please enter the author of the Periodical: ");
                name = x.nextLine();
                System.out.println("Please enter the issue number: ");
                isbn = x.nextInt();
                list.add(new Periodicals(isbn, name));
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i).getListing());

            /*if(list.get(i).getClass() == Book.class){
                System.out.println(list.get(i).getListing());
            }
            else if(list.get(i).getClass() == Periodicals.class){
                System.out.println(list.get(i).getListing());
            }*/

        }
    }
}