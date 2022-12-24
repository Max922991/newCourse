package Task2;

/**
 * 3.а Сделать дочерний класс Лев от класса Животное
 * 3.б Переопределить родительский метод голос, чтобы он возвращал форматированную строку (String.format) "мяу, мой цвет = %s, а возраст = %s"
 * 3.в Через сеттер задать имя Льву "Бонифаций"
 */
public class Lion extends Animal {
    public Lion( int weight, String color,int age, boolean isAlive, String name){
        super(weight, color, age, isAlive, "Бонифаций");
    }

    @Override
    protected String voice () {
        return String.format("мяу, мой цвет = %s, а возраст = %s", getColor(), getAge());
    }
    public static void main(String[] args) {
        Lion lion = new Lion(12, "blue", 11, true, "Simba");
        lion.setName("Бонифаций");

        System.out.println(lion.voice());


    }

}