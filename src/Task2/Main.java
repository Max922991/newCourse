package Task2;

/**
 * 5.a создать массив, который будет создержать Животное
 * 5.б поместить туда тигра и льва
 * 5.в циклом for используя длину массива, пройтись по всем животным и вывести метод живЛи с добавлением имени животного
 */
public class Main {
    public static void main(String[] args) {

        Animal lion = new Lion(54, "orange", 21, "lllllll");
        Animal tiger = new Tiger(45, "red", 12, "ttttttt");

        Animal[] array = {lion, tiger};

        for (int i = 0; i < array.length; i++) {
            System.out.println(lion.isAlive() + " " + lion.getName());
            System.out.println(tiger.isAlive() + " " + tiger.getName());
        }


    }
}
