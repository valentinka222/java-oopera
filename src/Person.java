public class Person {
    private final String name;
    private final String surname;
    private final GenderOfPerson gender;

    public Person(String name, String surname, GenderOfPerson gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}