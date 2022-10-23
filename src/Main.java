public class Main {

    public static void main(String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author( "Лев", "Толстой");
        Author Tolstoy2 = new Author("Лев", "Толстой");
                if ( Tolstoy.equals(Tolstoy2)) {
                    System.out.println("объекты равны");
                }
                if (Tolstoy.hashCode() == Tolstoy2.hashCode()){
                    System.out.println("hashCode равны");
                }
                        System.out.println("Author.name = " + Pushkin.getName());
        System.out.println("Author.surname = " + Pushkin.getSurname());
        System.out.println("Author.name = " + Tolstoy.getName());
        System.out.println("Author.surname = " + Tolstoy.getSurname());
        System.out.println(Pushkin);
        System.out.println(Tolstoy);
        Book autumn = new Book("Осень", 1815, Pushkin);

        System.out.println("autumn name = " + autumn.getTittle());
        System.out.println("publishingYear = " + autumn.getPublishingYear());
        System.out.println("Author = " + autumn.getAuthor().getName() + " " + autumn.getAuthor().getSurname());
        Book Blizzard = new Book("Метель", 1819, Tolstoy);
        Author Blizzard2 = new Book("Метель", 1819, Tolstoy).getAuthor();
        if ( Blizzard.equals(Blizzard2)) {
            System.out.println("объекты равны");
        }
        if (Blizzard.hashCode() == Blizzard2.hashCode()){
            System.out.println("hashCode равны");
        }
        autumn.setPublishingYear(1816);
        System.out.println("blizzard name = " + Blizzard.getTittle());
        System.out.println("autumn.getPublishingYear =" + autumn.getPublishingYear());
        System.out.println("blizzard.getPublishingYear =" + Blizzard.getPublishingYear());
        System.out.println("Author = " + Blizzard.getAuthor().getName() + " " + Blizzard.getAuthor().getSurname());
        System.out.println(Blizzard);
        System.out.println(autumn);



    }
}