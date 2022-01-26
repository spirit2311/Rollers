import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int minExp = 5;
        Rollerblading pinch = new Rollerblading("Пинч", 650, 12000, 8, 15, "Слалом", "Powerslide Hardcore");
        Rollerblading zakhar = new Rollerblading("Захар", 70, 24000, 2, 1, "Колдуны", "Seba FR1");
        Rollerblading bodyan = new Rollerblading("Бодян", 65, 1500, 13, 40, "Агресивы", "Razors SL1");
        Rollerblading sheva = new Rollerblading("Шева", 96, 15400, 13, 100, "Free Jump", "Powerslide Tau");
        List<Rollerblading> people = new ArrayList<>();


        people.add(pinch);
        people.add(zakhar);
        people.add(bodyan);
        people.add(sheva);
        for (Human out : people) {
//            System.out.println(out);
        }

        for (Rollerblading human : people) {
            if (human.getExperience() > minExp) {
                System.out.println("Имя: " + human.getName() + " " + " Стаж катания: " + human.getExperience());
            }
        }
        List<Rollerblading> sortRollers = people.stream().sorted((s1, s2) -> s2.getWeight() - s1.getWeight()).toList();
        for (Rollerblading out : sortRollers) {
            System.out.println(out);
        }
    }
}
