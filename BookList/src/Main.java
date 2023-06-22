import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<BookList> bookLists=new ArrayList<>();
        bookLists.addAll(List.of(
                new BookList("Book1", 200, "Author1", LocalDate.of(2020, 1, 1)),
                new BookList("Book2", 150, "Author2", LocalDate.of(2021, 2, 2)),
                new BookList("Book3", 300, "Author3", LocalDate.of(2022, 3, 3)),
                new BookList("Book4", 50, "Author4", LocalDate.of(2023, 4, 4)),
                new BookList("Book5", 180, "Author5", LocalDate.of(2024, 5, 5)),
                new BookList("Book6", 220, "Author6", LocalDate.of(2025, 6, 6)),
                new BookList("Book7", 270, "Author7", LocalDate.of(2026, 7, 7)),
                new BookList("Book8", 30, "Author8", LocalDate.of(2027, 8, 8)),
                new BookList("Book9", 90, "Author9", LocalDate.of(2028, 9, 9)),
                new BookList("Book10", 320, "Author10", LocalDate.of(2029, 10, 10))
        ));

        Map<String,String>bookMap=bookLists.stream()
                .collect(Collectors.toMap(BookList::getBookName, BookList::getAuthor));

        List<BookList>newBookList=bookLists.stream().filter(bookList -> bookList.getPageNumber()>100)
                .collect(Collectors.toList());

        newBookList.forEach(bookList -> System.out.println(bookList.getBookName()));
    }
}
