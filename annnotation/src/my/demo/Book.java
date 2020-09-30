package my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 13/8/20 9:36 PM
 */

@Table(value = "book")
public class Book {

    @Column
    private int id;

    @Column("book_name")
    private String bookName;

    @Column
    private String author;

    @Column
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
