public abstract class Item {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    Item(){
        title = "";
    }

    Item(String title){
        this.title = title;
    }

    abstract String getListing();

    //getListing() is an abstract method that returns a string and is implemented in classes Book
    //and Periodicals

    @Override
    public String toString(){
        return title;
    }

}
