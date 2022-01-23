package ex15;

class Person<T> {
    T ID;

    Person(T ID) {
        this.ID = ID;
    }

    T getID() {
        return ID;
    }
}
