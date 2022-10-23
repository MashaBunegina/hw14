import java.util.Objects;

public class Book {
    private Author author;
   private String tittle;
   private int publishingYear;

    public Author getAuthor (){
        return this.author;
    }
     public String toString () {
        return " Название книги: " + this.tittle + ". год публикации: " + this.publishingYear + ". Автор: " + this.author;
     }

    public  Book (String tittle, int publishingYear, Author author){
        this.tittle = tittle;
        this.publishingYear = publishingYear;
        this.author = author;

    }

    public String getTittle() {
        return this.tittle;
    }

    public int getPublishingYear(){
        return this.publishingYear;
    }
    public void setPublishingYear ( int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(tittle,book.tittle) &&
                Objects.equals(author, book.author);
    }

    public int hashCode () {
        return Objects.hash(tittle, publishingYear, author);
    }
}


