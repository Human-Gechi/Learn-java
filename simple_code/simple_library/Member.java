package simple_code.simple_library;
import java.util.ArrayList;

public class Member {
    private String memberId;
    private String name;
    private ArrayList<Book> booksList;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.booksList = new ArrayList<>();
    }

    public void borrowBook(Book book){
        booksList.add(book);
    }

    public String getMemberId(){
        return memberId;
    }

    public String getMemeberName(){
        return name;
    }

    public void remove(Book book){
        booksList.remove(book);
    }

    public void showBorrowed(){
        for (Book b : booksList){
            System.out.println(b);
        }
    }

    @Override 
    public String toString() {
            return  "MemberId: " + memberId + " Name: " + name + " Borrowed"  + booksList;
        }
}


