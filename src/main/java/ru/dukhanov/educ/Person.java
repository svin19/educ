package ru.dukhanov.educ;

public class Person {
    private final boolean man;
    private final String name;

    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (person.man) {
            return false;
        } else {
            return true;
        }
    }

    public boolean devorce() {
        if (this.spouse == null) return false;

        spouse.spouse = null;
        spouse = null;
        return true;
    }

    public Person getSpouse() {
        return spouse;
    }
}
