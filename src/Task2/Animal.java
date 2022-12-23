package Task2;

/**
 * 1. Создать класс Животное
 * 1.a. Создать приватные поля:
 * 1.а.а. Вес (числовое)
 * 1.а.б.  цвет(строковое)
 * 1.а.в возраст(числовое)
 * 1.а.г живойЛи (булевое)
 * 1.а.д имя(строковое)
 * 1.б. Для каждого поля сделать геттеры и сеттеры (они должны быть публичные)
 * 1.в. Сделать конструктор с заданием всех полей. ( то есть они не должны быть пустыми изначально)
 * 1.г Сделать конструктор с заданием живЛи ( также с заданием значений по умолчанию)
 *
 * 1.д Сделать протектед метод voice, который должен возвратщать строку "привет"
 */

public class Animal {

    protected String voice() {
        return "Привет";
    }

    private int weight;
    private  String color;
    private int age;
    private boolean isAlive;
    private String name;



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(int weight, String color, int age, boolean isAlive, String name) {
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Animal(boolean isAlive) {
        this.isAlive = isAlive;
    }
}
