public class GryffindorStudent extends HogwartsStudent {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance,
                             int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Студент факультета Гриффиндор: " + super.toString() + ", благородство = " + nobility +
                ", честь = " + honor + ", храбрость = " + bravery;
    }

    private int skillsSum() {
        return nobility + honor + bravery;
    }

    public void innerCompareWith(GryffindorStudent other) {
        if (skillsSum() > other.skillsSum()) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else if (skillsSum() < other.skillsSum()) {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + other.getName() + " равные по силе Гриффиндорцы");
        }
    }
}
