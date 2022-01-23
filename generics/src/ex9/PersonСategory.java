package ex9;

public class PersonСategory {
    private double koeff;

    <T extends Number> PersonСategory(T koeff) {
        this.koeff = koeff.doubleValue();
    }

    void showKoeff() {
        System.out.println("Коэффициент сотрудника:" + koeff);
    }
}

