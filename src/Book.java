public class Book {
    private Author author;
   private String tittle;
   private int publishingYear;

    public Author getAuthor (){
        return this.author;
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
}
