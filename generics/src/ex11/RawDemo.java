package ex11;

class RawDemo {
    public static void main(String[] args) {
        Person<Integer> integerPerson = new Person<Integer>(88);
        Person rawObj = new Person("Ильющенко"); //raw - сырой, будет Object
        String name = (String) rawObj.getID();
        System.out.println("Знaчeниe: " + name);

        //Следующее приведение типов вызовет ошибку во время выполнения!
//int i=(Integer)rawObj.getID();//ошибка во время выполнения
        //Следующее присваивание нарушает типовую безопасность
        integerPerson = rawObj;//Верно, но потенциально ошибочно
        int d = (Integer) integerPerson.getID();//ошибка во время выполнения
        //Следующее присваивание также нарушает типовую безопасность
        rawObj = integerPerson;//Верно, но потенциально ошибочно
        //int d=(Integer) rawObj.getID();//ошибка во время выполнения

    }
}
