package ex1;

public class Person<T> {// параметр типа, указываются классы
    T personID; //имя - PersonID, тип - Т

    Person(T personID) {
        this.personID = personID;
    }

    T getPersonID() {
        return personID;
    }

    void showType() {
        System.out.println("Tипoм T является " + personID.getClass().getName());
    }
}
