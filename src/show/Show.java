package show;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printListOfActors() {
        if (!listOfActors.isEmpty()) {
            System.out.println("Список актеров, выступающих в данном спектакле:");
            for (Actor actor : listOfActors) {
                System.out.println(actor);
            }
        } else {
            System.out.println("Список актеров пока пуст");
        }
    }

    public void printDirector() {
        System.out.println("Режиссер данного спектакля: " + director);
    }

    public void addNewActor(Actor newActor) {
        if (newActor != null) {
            for (Actor actor : listOfActors) {
                if (actor.equals(newActor)) {
                    System.out.println(actor + " уже есть в списке");
                    return;
                }
            }
            listOfActors.add(newActor);
            System.out.println("Актер " + newActor + " успешно добавлен");
        } else {
            System.out.println("Информация о новом актере введена некорректно");
        }
    }

    public void changeActor(Actor newActor, String surname) {
        if (newActor != null) {
            for (Actor actor : listOfActors) {
                if (actor.getSurname().equalsIgnoreCase(surname)) {
                    if (actor.equals(newActor)) {
                        System.out.println("Такой актер уже есть в списке");
                        return;
                    }
                    listOfActors.remove(actor);
                    listOfActors.add(newActor);
                    System.out.println("Актер " + actor + " был успешно заменен на актера " + newActor);
                    return;
                }
            }
            System.out.println("Актер с фамилией " + surname + " не был найден в списке");
        } else {
            System.out.println("Информация о новом актере введена некорректно");
        }
    }
}
