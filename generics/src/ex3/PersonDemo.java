package ex3;

public class PersonDemo {
    public static void main(String[] args) {
        Person<Integer, String> integerStringPerson = new Person<Integer, String>(223366, "Замойский");
        integerStringPerson.showТypes();
        System.out.println("Личный   номер сотрудника: " + integerStringPerson.getID());
        System.out.println("Фамилия  сотрудника: " + integerStringPerson.getSurname());
        Person<String, String> stringStringPerson = new Person<String, String>("223355", "Замойская");
        stringStringPerson.showТypes();
        System.out.println("Личный номер сотрудника:" + stringStringPerson.getID());
        System.out.println("Фамилия сотрудника:" + stringStringPerson.getSurname());
    }
}
