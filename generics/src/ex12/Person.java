package ex12;

class Person<T> {
    T ID;

    Person(T ob) {
        this.ID = ob;
    }

    T getID() {
        return ID;
    }
}
