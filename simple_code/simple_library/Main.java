package simple_code.simple_library;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        boolean running = true;

        Book b1 = new Book("Things Fall Apart", "Chinua Achebe");
        Book b2 = new Book("Learning Java", "Ogechukwu Okoli");
        Member m1 = new Member("ID_MEM_01", "Human-Gechi");
        Member m2 = new Member("ID_MEM_02", "Gechi");
        library.addBook(b1);
        library.addBook(b2);
        library.addMember(m1);
        library.addMember(m2);

        while (running) {
            System.out.println("1. Check out  2. List books 3. Add Books 4. List Members 0. Quit");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Member ID: ");
                    String id = sc.nextLine();
                    System.out.println(library.checkout(title, id));
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    System.out.print("Title: ");
                    String book_title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(book_title, author));
                    break;
                case 4:
                    library.listMembes();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}