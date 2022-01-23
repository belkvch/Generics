package ex5;

class GenericsBoundsDemo {
    public static void main(String[] args) {
        Integer[] intNums = {1, 2, 3, 4, 5};
        Statistics<Integer> integerOb = new Statistics<Integer>(intNums);
        double sum = integerOb.average();
        System.out.println("Cpeднee значение integerOb равно " + sum);
        Double[] doubleNums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Statistics<Double> doubleOb = new Statistics<Double>(doubleNums);
        sum = doubleOb.average();
        System.out.println("Cpeднee значение doubleOb равно " + sum);

//        String strNums[] = { "1", "2", "3", "4", "5"};
//        Statistics<String> stringOb = new Statistics<String> (strNums);
//        sum = stringOb. average();
//        System.out.println("Cpeднee значение strob равно " + sum);
    }
}
