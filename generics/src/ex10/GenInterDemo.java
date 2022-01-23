package ex10;

class GenInterDemo {
    public static void main(String[] args) {
        Integer intArray[] = {3, 6, 2, 8, 6};
        String stringArray[] = {"Папанов", "Кубашник", "Зайцев", "Прилукский"};
        Staff<Integer> integerOb = new Staff<Integer>(intArray);
        Staff<String> stringOb = new Staff<String>(stringArray);
        System.out.println("Максимальное значение в массиве integerOb:" + integerOb.max());
        System.out.println("Минимальное значение в массиве integerOb:" + integerOb.min());
        System.out.println("Максимальное значение в массиве stringOb:" + stringOb.max());
        System.out.println("Минимальное значение в массиве stringOb:" + stringOb.min());
    }
}
