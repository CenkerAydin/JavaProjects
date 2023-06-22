import java.time.LocalDate;
import java.util.Date;

public class BookList {
   private String bookName;
   private int pageNumber;
   private String author;
   private LocalDate date;

   public BookList(String bookName,int pageNumber,String author,LocalDate date){
       this.bookName=bookName;
       this.pageNumber=pageNumber;
       this.author=author;
       this.date=date;
   }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}