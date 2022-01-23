package ex5;

class Statistics<T extends Number> {
    T[] numbersArray;

    Statistics(T[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    double average() {
        double sum = 0;
        for (T num : numbersArray) sum += num.doubleValue();
        return sum / numbersArray.length;
    }
}