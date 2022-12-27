package Task2;

/**
 * 3.а Сделать дочерний класс Лев от класса Животное
 * 3.б Переопределить родительский метод голос, чтобы он возвращал форматированную строку (String.format) "мяу, мой цвет = %s, а возраст = %s"
 * 3.в Через сеттер задать имя Льву "Бонифаций"
 */
public class Lion extends Animal {
    public Lion( int weight, String color,int age, String name){
        super(weight, color, age, "Бонифаций");

        Lion lion = new Lion(54, "orange", 21, "lllllll");
        lion.setName("Бонифаций");
    }
    public Lion(boolean isAlive) {
        super(true);
    }

    @Override
    protected String voice () {
        return String.format("мяу, мой цвет = %s, а возраст = %s", getColor(), getAge());
    }


}