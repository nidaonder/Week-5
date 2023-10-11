import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Kitapları isme göre sıralıyorum.
        TreeSet<Book> bookListByName = new TreeSet<>();

        bookListByName.add(new Book("Hayvan Çiftliği", "George Orwell", 152, 1945));
        bookListByName.add(new Book("Küçük Prens", "Antoine de Saint", 112, 1943));
        bookListByName.add(new Book("Dönüşüm", "Franz Kafka", 74, 1915));
        bookListByName.add(new Book("Fareler ve İnsanlar", "John Steinback", 125, 1937));
        bookListByName.add(new Book("Otomatik Portakal", "Anthony Burgess", 172, 1962));

        System.out.println("--- Kitaplar isme göre sıralandı ---");
        for (Book books : bookListByName) {
            System.out.println(books.getBookName());
        }

        // Kitapları sayfa sayısına göre sıralıyorum.
        TreeSet<Book> bookListByPages = new TreeSet<>(new OrderPagesComparator());

        bookListByPages.add(new Book("Hayvan Çiftliği", "George Orwell", 152, 1945));
        bookListByPages.add(new Book("Küçük Prens", "Antoine de Saint", 112, 1943));
        bookListByPages.add(new Book("Dönüşüm", "Franz Kafka", 74, 1915));
        bookListByPages.add(new Book("Fareler ve İnsanlar", "John Steinback", 125,1937));
        bookListByPages.add(new Book("Otomatik Portakal", "Anthony Burgess", 172, 1962));

        System.out.println("--- Kitaplar sayfa sayısına göre sıralandı ---");
        for (Book books : bookListByPages){
            System.out.println(books.getBookName() + ":\t" + books.getNumberOfPages() + " sayfa");
        }
    }
}