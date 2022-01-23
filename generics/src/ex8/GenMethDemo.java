package ex8;

class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T elem, V[] array) {
        for (int i = 0; i < array.length; i++) {
            if (elem.equals(array[i])) return true;
        }
        return false;
    }
}
