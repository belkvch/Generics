package ex3;

class Person<T, V> {
    T ID;
    V surname;

    Person(T ID, V name) {
        this.ID = ID;
        this.surname = name;
    }

    void showТypes() {
        System.out.println("Tип Т:" + ID.getClass().getName());
        System.out.println("Tип V:" + surname.getClass().getName());
    }

    T getID() {
        return ID;
    }

    V getSurname() {
        return surname;
    }
}
