package Task2;

/**
 * 2.а СДелать дочерний класс Тигр от класса Животное
 * 2.б Переопределить родительский метод голос, чтобы он возвращал "Ррр, мне лет " и добавить его возраст
 *
 * 4.а Создать экземпляр класса Тигр с передачей в конструктор с параметром живЛи со значением true
 * 4.б Задать через сеттер возраст тигра равный 10
 * 4.в Вызвать метод голос у тигра
 * 4.г Сделать имя тигру "Тигруля"
 */
public class Tiger extends Animal {

    public Tiger(boolean isAlive) {
        super(true);
    }

    public Tiger(int weight, String color, int age, String name) {
        super(weight, color, age, name);


        Tiger tiger = new Tiger(45, "red", 12, "ttttttt");
        tiger.setAge(10);
        tiger.setName("Тигруля");




    }

    @Override
    protected String voice() {
        return "PPP, мне лет " + getAge();
    }
}
