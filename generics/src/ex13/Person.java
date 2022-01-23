package ex13;

class Person<T> {
    T ID;

    Person(T ID) {
        this.ID = ID;
    }

    T getID() {
        return ID;
    }
}
