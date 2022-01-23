package ex13;

class HierarchyDemo {
    public static void main(String[] args) {
        Employee<Integer, String> person = new Employee<Integer, String>(2233, "IT-отдел");
        System.out.print(person.getID());
        System.out.println(", " + person.getDepartment());
    }
}
