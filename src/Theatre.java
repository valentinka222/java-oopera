public class Theatre {

    public static void main(String[] args) {
        // Задание 1
        Actor actor1 = new Actor("Майя", "Плисецкая", GenderOfPerson.FEMALE, 167);
        Actor actor2 = new Actor("Федор", "Шаляпин", GenderOfPerson.MALE, 197);
        Actor actor3 = new Actor("Фаина", "Раневская", GenderOfPerson.FEMALE, 180);

        Director director1 = new Director("Константин", "Станиславский",
                GenderOfPerson.MALE, 70);
        Director director2 = new Director("Мариус", "Петипа", GenderOfPerson.MALE, 50);

        Person choreographer = new Person("Юрий", "Григорович", GenderOfPerson.MALE);
        Person musicAuthor = new Person("Петр", "Чайковский", GenderOfPerson.MALE);

        // Задание 2
        Show performance = new Show("Представление", 150, director1);
        Ballet ballet = new Ballet("Балет", 135, director2, musicAuthor,
                "Лебединое озеро", choreographer);
        Opera opera = new Opera("Опера", 140, director2, musicAuthor,
                "Евгений Онегин", 20);

        // Задание 3
        System.out.println();
        performance.addNewActor(actor1);
        performance.addNewActor(actor2);
        performance.addNewActor(actor3);
        System.out.println();

        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);
        System.out.println();

        opera.addNewActor(actor2);
        opera.addNewActor(actor3);
        System.out.println();

        // Задание 4
        performance.printDirector();
        performance.printListOfActors();

        System.out.println();

        ballet.printDirector();
        ballet.printListOfActors();

        System.out.println();

        opera.printDirector();
        opera.printListOfActors();

        System.out.println();

        // Задание 5
        opera.changeActor(actor1, "Шаляпин");
        opera.printListOfActors();
        System.out.println();

        // Задание 6
        performance.changeActor(actor3, "Михалков");
        System.out.println();

        // Задание 7
        opera.printLibrettoText();
        System.out.println();
        ballet.printLibrettoText();
    }
}
