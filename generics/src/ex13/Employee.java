package ex13;

class Employee<T, V> extends Person {
    V department;

    Employee(T ID, V department) {
        super(ID);
        this.department = department;
    }

    public V getDepartment() {
        return department;
    }
}
