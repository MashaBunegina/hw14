public class Main {

    public static void main(String[] args) {
        Book autumn = new Book("Осень", 1815);

        System.out.println("autumn name = " + autumn.getName());
        System.out.println("publishingYear = " + autumn.getPublishingYear());
        Book blizzard = new Book("Метель", 1819);
        autumn.setPublishingYear(1816);
        System.out.println("autumn.getPublishingYear =" + autumn.getPublishingYear());

    Author author =  new Author("Александр Пушкин");
        System.out.println( "author.NameAuthor = " + author.NameAuthor);
    }

}