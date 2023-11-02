package Library;

class Book {
    private  String bookId;
    private  String title;
    private String author;
    private boolean isAvailable;
    public Book(String bookId,String title,String author)
    {
        this.bookId=bookId;
        this.author=author;
        this.title=title;
        this.isAvailable=true;
    }
    public String getAuthor() {
        return author;
    }
    public String getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable()
    {
        return isAvailable;
    }
    public void rent()
    {
        isAvailable=false;
    }
    public void returnBook()
    {
        isAvailable=true;
    }


}

