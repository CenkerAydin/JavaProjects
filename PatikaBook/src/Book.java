import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class Main{
    public static void main(String[] args) {
        Set<Book> books=new TreeSet<>();
        books.add(new Book("Java",400,"John",new Date()));
        books.add(new Book("Python",200,"Mick",new Date()));
        books.add(new Book("C",150,"Mark",new Date()));
        books.add(new Book("Mobil",800,"David",new Date()));

        System.out.println("Sorted By Name");
        for (Book book:books){
            System.out.println(book);
        }
        System.out.println();

        Set<Book> booksPage=new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        booksPage.add(new Book("Java",400,"John",new Date()));
        booksPage.add(new Book("Python",200,"Mick",new Date()));
        booksPage.add(new Book("C",150,"Mark",new Date()));
        booksPage.add(new Book("Mobil",800,"David",new Date()));

        System.out.println("Sorted By Page");
        for (Book book:booksPage){
            System.out.println(book);
        }
    }
}
public class Book implements Comparable<Book>{
    private String title;
    private int pageCount;
    private String author;
    private Date date;

    public Book(String title,int pageCount,String author,Date date){
        this.title=title;
        this.pageCount=pageCount;
        this.author=author;
        this.date=new Date();
    }
    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return title+" - "+pageCount+" pages - "+author+" - "+date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
