public class Book extends Item {
    private  int ISBN;
    private String author;

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    Book(){

    }

    Book(int I, String a, String t){
        ISBN = I;
        author = a;
        setTitle(t);
    }

    @Override
    public String getListing() {
        return "Book Name - " + getTitle() + "\nAuthor - " + author + "\nISBN # - " + ISBN;
    }
}
