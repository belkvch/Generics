package ex16;

public class Employee<T> extends Person<T> {
    String surname;

    public Employee(T ID, String surname) {
        super(ID);
        this.surname = surname;
    }

    @Override
    T getID() {
        System.out.print("ID сотрудника компании "+this.surname+": ");
        return ID;
    }
}
