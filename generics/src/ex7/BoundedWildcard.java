package ex7;

public class BoundedWildcard {
    static void showXY(Coords<?> ob) {
        System.out.println("Koopдинaты Х У:");
        for (int i = 0; i < ob.coords.length; i++) {
            System.out.println(ob.coords[i].x + " " + ob.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> ob) {
        System.out.println("Koopдинaты Х У Z:");
        for (int i = 0; i < ob.coords.length; i++) {
            System.out.println(ob.coords[i].x + " " + ob.coords[i].y + " " + ob.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> ob) {
        System.out.println("Koopдинaты Х У Z Тime:");
        for (int i = 0; i < ob.coords.length; i++) {
            System.out.println(ob.coords[i].x + " " + ob.coords[i].y + " " + ob.coords[i].z + " " + ob.coords[i].time);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD twoDArr[] = {new TwoD(0, 0), new TwoD(7, 9),
                new TwoD(18, 4), new TwoD(-1, -23)};
        Coords<TwoD> coordsTwoDOb = new Coords<TwoD>(twoDArr);
        System.out.println("Coдepжимoe объекта coordsTwoDOb.");
        showXY(coordsTwoDOb);
        //showXYZ (coordsTwoDOb);//ошибка, это не тип ThreeD
        // showAll (coordsTwoDOb);//ошибка, это не тип FourD

        FourD fourDArr[] = {new FourD(1, 2, 3, 4), new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9), new FourD(3, -2, -23, 17)};
        Coords<FourD> coordsFourDOb = new Coords<FourD>(fourDArr);
        System.out.println("Coдepжимoe объекта coordsFourDOb.");
        showXY(coordsFourDOb);
        showXYZ(coordsFourDOb);
        showAll(coordsFourDOb);
    }
}
