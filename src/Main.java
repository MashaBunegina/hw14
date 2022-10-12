public class Main {

    public static void main(String[] args) {
        Book autumn = new Book("Осень", 1815, Pushkin);

        System.out.println("autumn name = " + autumn.getTittle());
        System.out.println("publishingYear = " + autumn.getPublishingYear());
        System.out.println("Author =" + Author.getAuthor());
        Book blizzard = new Book("Метель", 1819, author);
        autumn.setPublishingYear(1816);
        System.out.println("blizzard name = " + blizzard.getTittle());
        System.out.println("autumn.getPublishingYear =" + autumn.getPublishingYear());
        System.out.println("blizzard.getPublishingYear =" + blizzard.getPublishingYear());


        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author( "Лев", "Толстой");
        System.out.println("nameAuthor.name = " + Author.getName());
        System.out.println("nameAuthor.surname = " + Author.getSurname());
    }
}