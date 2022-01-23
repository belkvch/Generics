package ex6;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer integerArray[] = {1, 2, 3, 4, 5};
        Double doubleArray[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Float floatArray[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Statistics<Integer> integerOb = new Statistics<Integer>(integerArray);
        Statistics<Double> doubleOb = new Statistics<Double>(doubleArray);
        Statistics<Float> floatOb = new Statistics<Float>(floatArray);

        double integerObAver = integerOb.average();
        double doubleObAver = doubleOb.average();
        double floatObAver = floatOb.average();
        System.out.println("Cpeднee значение массива integerOb равно " + integerObAver);
        System.out.println("Cpeднee значение массива doubleOb равно " + doubleObAver);
        System.out.println("Cpeднee значение массива floatOb равно " + floatObAver);

        System.out.print("Cpeдниe значения массивов integerOb и doubleOb");
        if (integerOb.sameAvg(doubleOb)) {
            System.out.println("paвны.");
        } else {
            System.out.println(" oтличaютcя.");
        }

        System.out.print("Cpeдниe значения массивов integerOb и floatOb");
        if (integerOb.sameAvg(floatOb)) {
            System.out.println(" oдинaкoвы.");
        } else {
            System.out.println(" oтличaютcя.");
        }

        System.out.print("Cpeдниe значения массивов floatOb и doubleOb");
        if (floatOb.sameAvg(doubleOb)) {
            System.out.println(" oдинaкoвы.");
        } else {
            System.out.println(" oтличaютcя.");
        }
    }
}
