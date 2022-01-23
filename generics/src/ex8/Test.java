package ex8;

class Test extends GenMethDemo {
    public static void main(String[] args) {
        Integer intArray[] = {1, 2, 3, 4, 5};
        String stringArray[] = {"Солошенко", "Квачева", "Петров", "Загорский", "Запрудный"};

        if (isIn(2, intArray)) {
            System.out.println("Чиcлo 2 содержится в массиве intArray");
        }
        if (!isIn(7, intArray)) {
            System.out.println("Чиcлo 7 отсутствует в массиве intArray");
        }

        if (isIn("Загорский", stringArray)) {
            System.out.println("Строка \"Загорский\" содержится в массиве stringArray");
        }
        if (!isIn("Сидоров", stringArray)) {
            System.out.println("Строка \"Сидоров\" отсутствует в массиве stringArray");
        }

        //if (isIn("Пашутин", intArray)) //типы не совместимы
        //System.out.println("Строка \"Пашутин\" содержится в массиве stringArray"); //ошибка с компиляцией

    }
}
