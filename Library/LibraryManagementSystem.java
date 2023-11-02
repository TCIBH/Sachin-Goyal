package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    private List<Book> books;
    private List<Member> members;
    private List<Rental> rentals;
    public LibraryManagementSystem()
    {
        books=new ArrayList<>();
        members=new ArrayList<>();
        rentals=new ArrayList<>();
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void addMember(Member member){
        members.add(member);
    }
    public void rentBook(Book book, Member member){
        if(book.isAvailable()){
            book.rent();
            rentals.add(new Rental(book,member));
        }
        else{
            System.out.println("the book is not available for borrow");
        }
    }
    public void returnBook(Book book){
        book.returnBook();
        Rental rentalToRemove=null;
        for(Rental rental:rentals){
            if(rental.getBook()==book){
                rentalToRemove=rental;
            }
        }
        if(rentalToRemove!=null){
            rentals.remove(rentalToRemove);
        }
        else{
            System.out.println("Book is not borrow");
        }
    }
    public void menu(){
        Scanner scan=new Scanner(System.in);
        int choice;
        do {
            System.out.println("=====Welcome to  Library Management system System =====");
            System.out.println("1. Borrow a BOOK");
            System.out.println("2. Return a Book");
            System.out.println("3. Show all Books");
            System.out.println("4. Show all Member");
            System.out.println("5. Exit..");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("==\n Borrow a Book");
                    System.out.println("enter your name");
                    String customerName = scan.nextLine();
                    System.out.println("\n ==Available Book==\n");
                    for(Book book:books) {
                        if (book.isAvailable()) {
                            System.out.println(book.getBookId() + " -- " + book.getTitle() + " -- " + book.getTitle());
                        }
                    }
                    System.out.println("Enter Book id you want to borrow");
                    String bookId=scan.nextLine();

                    Member newMember=new Member("Mem"+(members.size())+1,customerName);
                    addMember(newMember);
                    Book selectedBook=null;
                    for(Book book:books) {
                        if (book.getBookId().equals(bookId) && book.isAvailable()) ;
                        {
                            selectedBook = book;
                            break;
                        }
                    }
                    if(selectedBook!=null){
                        System.out.println("Borrow Information");
                        System.out.println("Member id"+newMember.getMemberId());
                        System.out.println("member name"+newMember.getName());
                        System.out.println("title  "+selectedBook.getTitle()+"author " +selectedBook.getAuthor());
                        System.out.println("\n confirm rental(y/n): ");
                        String confirm = scan.nextLine();
                        if (confirm.equalsIgnoreCase("Y")) {
                            rentBook(selectedBook, newMember);
                            System.out.println("Car Rented Successfully");
                        }
                        else {
                            System.out.println("\nInvalid car selection or car not available for rent.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("==Return a book ");
                    System.out.println("enter the book id you want to return");
                    String bookId2= scan.nextLine();
                    Book bookToReturn=null;
                    for(Book book:books){
                        if(book.getBookId().equals(bookId2)&& !book.isAvailable()){
                            bookToReturn=book;
                            break;
                        }
                    }
                    if (bookToReturn != null) {
                        Member member = null;
                        for (Rental rental : rentals) {
                            if (rental.getBook() == bookToReturn) {
                                member = rental.getMember();
                                break;
                            }
                        }
                        if (member != null) {
                            returnBook(bookToReturn);
                            System.out.println("Book returned successfully by " + member.getName());
                        } else {
                            System.out.println("Book was not Borrowed or rental information is missing.");
                        }
                    } else {
                        System.out.println("Invalid Book ID or Book is not rented.");
                    }
                    break;
                case 3:
                    System.out.println("All Available Book Is...");
                    for(Book book:books) {
                        if (book.isAvailable()) {
                            System.out.println(book.getBookId() + " - " + book.getTitle() + " - " + book.getAuthor());
                        }
                    }
                    break;
                case 4:
                    System.out.println("all borrowed member are ");
                    for(Member member:members){
                        System.out.println(member.getMemberId()+"--"+member.getName());
                    }
                    break;
                case 5:
                    System.out.println("\nThank you for using the Library System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        }while (choice != 5) ;
    }
    public static void  main(String args[]){
        LibraryManagementSystem system=new LibraryManagementSystem();
        Book book1=new Book("B001","Good Times","williams");
        Book book2=new Book("B002","How to Become Rich","Sachin Goyal");
        Book book3=new Book("B003","Bad Times","Chetan Bhagat");
        Book book4=new Book("B004","Once in a life time","Yuvraj");
        Book book5=new Book("B005","Ghost story","charlie ");
        Book book6=new Book("B006","Invisible Man","Dr. kishan");
        system.addBook(book1);
        system.addBook(book2);
        system.addBook(book3);
        system.addBook(book4);
        system.addBook(book5);
        system.addBook(book6);
        system.menu();
    }
}

