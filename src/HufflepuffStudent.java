public class HufflepuffStudent extends HogwartsStudent {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Студент факультета Пуффендуй: " + super.toString() + ", трудолюбие = " + diligence +
                ", верность = " + loyalty + ", честность = " + honesty;
    }

    private int skillsSum() {
        return diligence + loyalty + honesty ;
    }

    public void innerCompareWith(HufflepuffStudent other) {
        if (skillsSum() > other.skillsSum()) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + other.getName());
        } else if (skillsSum() < other.skillsSum()) {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + other.getName() + " равные по силе Пуффендуйцы");
        }
    }
}
