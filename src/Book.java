public class Book {
   private String name;
   private int publishingYear;
   private String Author;

    public  Book (String name, int publishingYear, String Author){
        this.name = name;
        this.publishingYear = publishingYear;
        this.Author = Author;

    }
    public String getName() {
        return this.name;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public void setPublishingYear ( int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
