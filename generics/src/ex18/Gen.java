package ex18;

class Gen<T extends Number> {
    T ob;
    T[] vals;
    Gen(T ob, T[] nums) {
        this.ob = ob;
        //Этот оператор неверен
        //vals = new T[10];//нельзя создать массив типа Т
        //Тем не менее этот оператор верен
        vals = nums;//можно присвоить существующую ссылку массиву
    }
}
