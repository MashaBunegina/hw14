public class Main {

    public static void main(String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author( "Лев", "Толстой");
        System.out.println("Author.name = " + Pushkin.getName());
        System.out.println("Author.surname = " + Pushkin.getSurname());
        System.out.println("Author.name = " + Tolstoy.getName());
        System.out.println("Author.surname = " + Tolstoy.getSurname());


        Book autumn = new Book("Осень", 1815, Pushkin);

        System.out.println("autumn name = " + autumn.getTittle());
        System.out.println("publishingYear = " + autumn.getPublishingYear());
        System.out.println("Author = " + autumn.getAuthor().getName() + " " + autumn.getAuthor().getSurname());
        Book Blizzard = new Book("Метель", 1819, Tolstoy);
        autumn.setPublishingYear(1816);
        System.out.println("blizzard name = " + Blizzard.getTittle());
        System.out.println("autumn.getPublishingYear =" + autumn.getPublishingYear());
        System.out.println("blizzard.getPublishingYear =" + Blizzard.getPublishingYear());
        System.out.println("Author = " + Blizzard.getAuthor().getName() + " " + Blizzard.getAuthor().getSurname());



    }
}