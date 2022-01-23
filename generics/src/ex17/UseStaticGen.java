package ex17;

public class UseStaticGen {
    public static void main(String[] args) {
        Pair<String, Float> pair1 = new Pair<>("Смирнов", 2000.5f);
        Pair<String, Float> pair2 = new Pair<>("Кукшинов", 3000.5f);
        Pair<String, Float> pair3 = new Pair<>("Смирнов", 2000.5f);
        if (Util.compare(pair1, pair2))
            System.out.println("Данные совпадают");
        else System.out.println("Данные не совпадают");
        if (Util.compare(pair1, pair3))
            System.out.println("Данные совпадают");
        else System.out.println("Данные не совпадают");
    }
}
