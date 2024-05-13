public class RavenclawStudent extends HogwartsStudent{
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Студент факультета Когтевран: " + super.toString() + ", ум = " + intelligence +
                ", мудрость = " + wisdom + ", остроумие = " + wit + ", творчество = " + creativity;
    }

    private int skillsSum() {
        return intelligence + wisdom + wit + creativity ;
    }

    public void innerCompareWith(RavenclawStudent other) {
        if (skillsSum() > other.skillsSum()) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else if (skillsSum() < other.skillsSum()) {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + other.getName() + " равные по силе Когтевранцы");
        }
    }
}
