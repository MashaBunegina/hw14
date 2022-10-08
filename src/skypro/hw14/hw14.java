package skypro.hw14;

  public class hw14 {
      public static void main(String[] args) {
      }

      public class Book {

          public final int pageAmount;
          public String publisherName;
          public int publishingYear;

          Book book = new Book(100, "Book Publishing Ltd.");


          public Book(int pageAmount, String publisherName) {
              this.pageAmount = pageAmount;
              this.publisherName = publisherName;
              this.publishingYear = publishingYear;

          }

          public int getPageAmount() {
              return pageAmount;
          }

          public String getPublisherName() {
              return publisherName;
          }

          public void setPublisherName(String publisherName) {
              this.publisherName = publisherName;
          }

          public int getPublishingYear() {
              return publishingYear;
          }

          public void setPublishingYear(int publishingYear) {
              if (publishingYear < 1950 || publishingYear > 2050) {
                  System.out.println("Год публикации книги: " + publishingYear);
                  return;
              }
              this.publishingYear = publishingYear;

          }

          public class Author {
              public String authorName;
              public String authorName2;

              Author Author = new Author("Александр Пушкин", "Лев Толстой");


              public Author(String authorName, String authorName2) {
                  this.authorName = authorName;
                  this.authorName2 = authorName2;
              }

              public String getAuthorName() {
                  return authorName;
              }

              public String getAuthorName2() {
                  return authorName2;

              }



          }
      }
  }
