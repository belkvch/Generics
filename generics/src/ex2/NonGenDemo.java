package ex2;

class NonGenDemo {
    public static void main(String[] args) {
        Person integerPerson;
        integerPerson = new Person(223366);
        integerPerson.showType();
        int personIntegerID = (Integer) integerPerson.getPersonID();
        System.out.println("Знaчeниe:" + personIntegerID);
        System.out.println();
        Person stringPerson = new Person("22DD3366");
        stringPerson.showType();
        String personStringID = (String) stringPerson.getPersonID();
        System.out.println("Знaчeниe:" + personStringID);
        integerPerson = stringPerson;
        personIntegerID = (Integer) integerPerson.getPersonID();
    }
}
