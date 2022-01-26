public class Sportsman extends Human {
    int experience;
    int medal;

    public Sportsman(String name, int weight, int price, int experience, int medal) {
        super(name, weight, price);
        this.experience = experience;
        this.medal = medal;
    }

    public int getExperience() {
        return experience;
    }

    public int getMedal() {
        return medal;
    }

}
