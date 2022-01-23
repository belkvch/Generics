package ex14;

public class Employee<T> extends Person {
    T ID;

    Employee(T ID, String surname) {
        super(surname);
        this.ID = ID;
    }

    public T getID() {
        return ID;
    }
}
