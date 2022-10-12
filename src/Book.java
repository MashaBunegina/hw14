public class Book {
   private String tittle;
   private int publishingYear;
   private Author author;

    public  Book (String tittle, int publishingYear, Author author){
        this.tittle = tittle;
        this.publishingYear = publishingYear;
        this.author = author;

    }
    public String getTittle() {
        return this.tittle;
    }
    public Author getAuthor (){
        return this.author;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public void setPublishingYear ( int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
