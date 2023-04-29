import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) throws PriceException {
        this.title = title;
        this.author = author;

        if(price < 0 ){
            throw new PriceException("Price is negative");
        }
        this.price = price;



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(price, book.price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}


