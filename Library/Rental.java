package Library;
class Rental {
    private Book book;
    private Member member;
    public Rental(Book book, Member member)
    {
        this.book=book;
        this.member=member;
    }
    public Book getBook() {
        return book;
    }
    public Member getMember() {
        return member;
    }
}

