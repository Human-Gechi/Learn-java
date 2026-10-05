package simple_code.simple_library;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> listBooks;
    private ArrayList<Member> listMembers;

    public Library() {
        listBooks = new ArrayList<>();
        listMembers = new ArrayList<>();
    }

    public void addBook(Book book){
        listBooks.add(book);
    }

    public void addMember(Member member){
        listMembers.add(member);
    }

    public void listBooks(){
        for (Book b : listBooks){
            System.out.println(b);
        }
    }

    public void listMembes() {
        for (Member m : listMembers) {
            System.out.println(m);
        }
    }
    public ArrayList<Book> searchByAuthor(String keyword){
        ArrayList<Book> result = new ArrayList<>();

        for (Book b : listBooks){
            if (b.getAuthor().contains(keyword)){
                result.add(b);
            }
        }
        return result;
    }

    public Member searchMemberId(String id){
        for (Member m : listMembers) {
            if (m.getMemberId().equals(id)) {
                return  m;
            }
        }
        return  null;
    }

    public String checkout(String title, String memberId) {
        Member member = searchMemberId(memberId);
        if (member == null) {
            return "Member not found.";
        }

        for (Book b : listBooks) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                if (b.getAvailability()) {
                    b.checkedOut();
                    member.borrowBook(b);
                    return member.getMemeberName() + " borrowed " + b.getTitle();
                }
                return "Book is already checked out.";
            }
        }
        return "Book not found.";
}
}