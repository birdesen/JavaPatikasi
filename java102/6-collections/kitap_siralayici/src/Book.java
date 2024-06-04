

public class Book {
    private String name;
    private int pageNumber;
    private String writer;
    private int year;

    public Book(String name, int pageNumber, String writer, int year) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writer = writer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
