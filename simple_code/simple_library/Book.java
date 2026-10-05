package simple_code.simple_library;

public class Book {

    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean getAvailability(){
        return available;
    }

    public void checkedOut() {
        available = false;
    }
    public void returned(){
        available = true;
    }

    @Override 
    public String toString() {
            return title + " by " + author + (available ? " (available)" : " (checked out)");
        }
}