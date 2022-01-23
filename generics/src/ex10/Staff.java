package ex10;

class Staff<T extends Comparable<T>> implements MinMax<T> {
    T[] arrOfEmployee;

    Staff(T[] arrOfValues) {
        this.arrOfEmployee = arrOfValues;
    }

    public T min() {
        T minValue = arrOfEmployee[0];
        for (int i = 1; i < arrOfEmployee.length; i++) {
            if (arrOfEmployee[i].compareTo(minValue) < 0) {
                minValue = arrOfEmployee[i];
            }
        }
        return minValue;
    }

    public T max() {
        T maxValue = arrOfEmployee[0];
        for (int i = 1; i < arrOfEmployee.length; i++) {
            if (arrOfEmployee[i].compareTo(maxValue) > 0) {
                maxValue = arrOfEmployee[i];
            }
        }
        return maxValue;
    }
}
