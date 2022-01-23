package ex6;

class Statistics<T extends Number> {
    T[] numberArray;

    Statistics(T[] numberArray) {
        this.numberArray = numberArray;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < numberArray.length; i++)
            sum += numberArray[i].doubleValue();
        return sum / numberArray.length;
    }

    boolean sameAvg(Statistics<?> ob) {
        if (average() == ob.average()) return true;
        return false;
    }
}
