package ex2;

class Person {
    Object personID;

    Person(Object personIntegerID) {
        this.personID = personIntegerID;
    }

    Object getPersonID() {
        return personID;
    }

    void showType() {
        System.out.println("Oбъeкт personID относится к типу " + personID.getClass().getName());
    }
}
