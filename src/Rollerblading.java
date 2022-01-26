public class Rollerblading extends Sportsman {
    private final String discipline;
    private final String skates;
    public Rollerblading(String name, int weight, int price, int experience, int medal, String discipline, String skates) {
        super(name, weight, price, experience, medal);
        this.discipline = discipline;
        this.skates = skates;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getSkates() {
        return skates;
    }
    @Override
    public String toString() {
        return "Имя = '" + name + '\'' + ", Вес = " + weight + ", Зарплата = " + salary + ", Стаж работы = " + experience + ", Кол-во медалей = " + medal + ", Дисциплина = " + discipline + ", Модель роликов = " + skates + '.';
    }
}
