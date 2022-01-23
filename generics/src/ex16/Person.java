package ex16;

class Person <T>{
    T ID;

    Person(T ID) {
        this.ID = ID;
    }

    T getID() {
        System.out.print("ID: ");
        return ID;
    }
}
