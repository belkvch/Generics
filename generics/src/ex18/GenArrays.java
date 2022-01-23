package ex18;

public class GenArrays {
    public static void main(String[] args) {
        Integer n[] = {1, 2, 3, 4, 5};
        Gen<Integer> integerOb = new Gen<Integer>(50, n);
        //Нельзя создать массив специфических для типа обобщенных ссылок
        //Gen <Integer> gens[] = new Gen<Integer>[10];//Неверно !
        //А это верно !
        Gen<?> gens[] = new Gen<?>[10];//Верно !
    }
}
