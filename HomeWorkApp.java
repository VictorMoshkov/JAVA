//Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().

public class HomeWorkApp {

    public static void main(String[] args) {
        // Создайте метод printThreeWords(), который при вызове должен
        // отпечатать в столбец три слова: Orange, Banana, Apple.

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
//Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
// и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
// и если их сумма больше или равна 0,
// то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

    public static void checkSumSign() {
        int a = 50;
        int b = 60;
        int c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная");
    }
        else {
            System.out.println("Сумма отрицательная");
        }


    }
//Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте
// ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
// если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
// если больше 100 (100 исключительно) - “Зеленый”;

    public static void printColor() {
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100 ){
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
        }
//Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
// и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
// то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;

    public static void compareNumbers() {
        int a = 23;
        int b = 64;
        if (a >= b){
            System.out.println("a >= b");
        }
else {
            System.out.println("a < b");
        }
    }
    }


