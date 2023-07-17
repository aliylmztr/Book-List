import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();

        book.add(new Book("Book-1", 165, "Author-1", "01-01-2014"));
        book.add(new Book("Book-2", 212, "Author-2", "01-01-2015"));
        book.add(new Book("Book-3", 88, "Author-3", "01-01-2016"));
        book.add(new Book("Book-4", 261, "Author-4", "01-01-2017"));
        book.add(new Book("Book-5", 95, "Author-5", "01-01-2018"));
        book.add(new Book("Book-6", 176, "Author-6", "01-01-2019"));
        book.add(new Book("Book-7", 305, "Author-7", "01-01-2020"));
        book.add(new Book("Book-8", 92, "Author-8", "01-01-2021"));
        book.add(new Book("Book-9", 223, "Author-9", "01-01-2022"));
        book.add(new Book("Book-10", 101, "Author-10", "01-01-2023"));

        Map<String, String> map = new TreeMap<>();
        book.forEach(b -> map.put(b.getName(), b.getAuthorName()));
        map.forEach((bookName, authorName) -> System.out.println("Kitap Adı: " + bookName + ", Yazar Adı: " + authorName));

        List<Book> list = book.stream().filter(b -> b.getPageCount() > 100).toList();
        System.out.println("\nSayfa Sayısı 100'den Fazla Olan Kitaplar:");
        list.forEach(b -> System.out.println("Kitap Adı: " + b.getName() + ", Yazar Adı: " + b.getPageCount()));

    }
}
