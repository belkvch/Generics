package ex16;

public class OverrideDemo {
    public static void main(String[] args) {
        Person<Integer> person = new Person<Integer>(88);
        Employee<Integer> employee = new Employee<Integer>(99, "Лапушкин");
        System.out.println(person.getID());
        System.out.println(employee.getID());
    }
}
