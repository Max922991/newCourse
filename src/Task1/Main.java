package Task1;

/**
 * Создать Main класс и создать в нем метод public static void main(String[] args) {}
 * Создать Строковую константу со значением "Я строка с полной готовностью"
 * Создать булевое поле доступное только внутри класса со значением false
 * Создать float поле доступное из другого класса со значением 0,25
 * Создать приватный метод внутри класса Main с возвращаемым типом булеан и
 * входными параметрами int firstValue, int secondValue
 * <p>
 * Метод должен внутри проверять разницу между эти 2 значениями.
 * Если значения не равны, возвращать false, если равны, то true
 * <p>
 * Из метода main вызывать метод из пункта 5 в рамках цикла в течение 10 итераций со значениями 1 и 8.
 * Если метод возвращает false, то прибавлять 1 к первому значению, если они равны, закончить проход по циклу и
 * вывести константное значение в консоль, объявленное во 2 пункте.
 */
public class Main {
    public static final String READY = "Я строка с полной готовностью";
    public boolean value;
    public float n = 0.25f;

    public static void main(String[] args) {

        int firstValue = 1;
        int secondValue = 8;

        for (int i = 0; i < 10; i++) {
            boolean method = method(firstValue, secondValue);
            if (!method) {
                firstValue++;
            } else {
                System.out.println(READY);
                break;
            }
        }
    }

    private static boolean method(int firstValue, int secondValue) {
        return firstValue == secondValue;
    }
}
