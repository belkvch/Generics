package ex14;

public class HierarchyDemo {
    public static void main(String[] args) {
        Employee<Integer> employee = new Employee<Integer>(2211, "Потапов");
        System.out.print(employee.getID() + " ");
        System.out.println(employee.getSurname());
    }
}
