
import java.util.HashSet;
import java.util.TreeSet;

/*  Book isminde bir sınıf tasarlayınız.
    Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
    Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
    Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
    Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve
    kitapları sayfa sayısına göre sıralamasını sağlayınız. */
public class Main {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book("Taht Oyunları", 400, "George R.R. Martin", 1996));
        books.add(new Book("Dune", 200, "Frank Herbert", 1965));
        books.add(new Book("Açlık Oyunları", 250, "Suzanne Colins", 2008));
        books.add(new Book("Yüzüklerin Efendisi", 550, "J.R.R. Tolkien", 1954));
        books.add(new Book("Harry Potter", 300, "J.K. Rowling", 1997));

        TreeSet<Book> booksName = new TreeSet<>(new OrderByName());

        for (Book book : books) {
            booksName.add(book);
        }

        for (Book book : booksName) {
            System.out.println(book.getName() + " " + book.getPageNumber() + " " + book.getWriter() + " " + book.getYear());
        }
        System.out.println("- - - - - - - - - - - - - - - - -");
        TreeSet<Book> booksPage = new TreeSet<>(new OrderByPageNumber());

        for (Book book : books) {
            booksPage.add(book);
        }
        for (Book book : booksPage) {
            System.out.println(book.getName() + " " + book.getPageNumber() + " " + book.getWriter() + " " + book.getYear());
        }


    }
}
