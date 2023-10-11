import java.util.Comparator;
import java.util.TreeSet;

public class Book implements Comparable<Book>{
    private String bookName;
    private String authorName;
    private int numberOfPages;
    private int date;

    public Book(String bookName, String authorName, int numberOfPages, int date){
        this.bookName = bookName;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.date = date;
    }

    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date = date;
    }


}
