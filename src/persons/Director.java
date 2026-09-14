package persons;

public class Director extends Person {
    private final int numberOfShows;

    public Director(String name, String surname, GenderOfPerson gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname();
    }
}
