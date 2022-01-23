package ex15;

public class HierarchyDemo {
    public static void main(String[] args) {
        Person<Integer> person = new Person<Integer>(8899);
        Employee<Integer> intEmployee = new Employee<>(9988);
        Employee<String> strEmployee = new Employee<String>("Палицин");

        if (intEmployee instanceof Employee<?>)
            System.out.println("Объект intEmployee является экземпляром класса Employee");
        if (intEmployee instanceof Person<?>)
            System.out.println("Объект intEmployee является экземпляром класса Person");
        System.out.println();

        if (strEmployee instanceof Employee<?>)
            System.out.println("Объект strEmployee является экземпляром класса Employee");
        if (strEmployee instanceof Person<?>)
            System.out.println("Объект strEmployee является экземпляром класса Person");
        System.out.println();

        if (person instanceof Employee<?>)
            System.out.println("Объект person является экземпляром класса Employee");
        if (person instanceof Person<?>)
            System.out.println("Объект person является экземпляром класса Person");

        //Следующий код не скомпилируется, так как сведения об
        // обобщенном типе отсутствуют во время выполнения
        //if (person instanceof Employee <Integer>)
        // System.out.println("Объект person является экземпляромкласса Employee<Integer> ");
    }
}
