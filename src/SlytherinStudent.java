public class SlytherinStudent extends HogwartsStudent {
    private final int cunning;
    private final int decisiveness;
    private final int ambitiousness;
    private final int resourcefulness;
    private final int lustForPower;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning,
                            int decisiveness, int ambitiousness, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Студент факультета Слизерин: " + super.toString() + ", хитрость = " + cunning + ", решительность = " + decisiveness +
                ", амбициозность = " + ambitiousness + ", находчивость = " + resourcefulness + ", жажда власти = " + lustForPower;
    }

    private int skillsSum() {
        return cunning + decisiveness + ambitiousness + resourcefulness + lustForPower;
    }


    public void innerCompareWith(SlytherinStudent other) {
        if (skillsSum() > other.skillsSum()) {
            System.out.println(getName() + " лучший Слизеринец, чем " + other.getName());
        } else if (skillsSum() < other.skillsSum()) {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + other.getName() + " равные по силе Слизеринцы");
        }
    }
}
