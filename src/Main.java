public class Main {

    public static void main(String[] args) {
        Book autumn = new Book("Осень", 1815, "Author");

        System.out.println("autumn name = " + autumn.getName());
        System.out.println("publishingYear = " + autumn.getPublishingYear());
        Book blizzard = new Book("Метель", 1819, "Author");
        autumn.setPublishingYear(1816);
        System.out.println("blizzard name = " + blizzard.getName());
        System.out.println("autumn.getPublishingYear =" + autumn.getPublishingYear());
        System.out.println("blizzard.getPublishingYear =" + blizzard.getPublishingYear());


        Author nameAuthor = new Author("Александр", "Пушкин");
        System.out.println("nameAuthor.name = " + nameAuthor.getname());
        System.out.println("nameAuthor.surname = " + nameAuthor.getSurname());
    }
}