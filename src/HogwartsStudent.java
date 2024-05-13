public class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return  "Имя = '" + name + '\'' + ", сила магии = " + magicPower +
                ", расстояние трансгрессии = " + transgressionDistance;
    }

    public void compareMagicPowerWith(HogwartsStudent other) {
        if (magicPower > other.magicPower) {
            System.out.println(name + " обладает бОльшей силой магии, чем " + other.name);
        } else if (magicPower < other.magicPower) {
            System.out.println(other.name + " обладает бОльшей силой магии, чем " + name);
        } else {
            System.out.println(name + " и " + other.name + " равны по силе магии");
        }
    }


    public void compareTransgressionDistanceWith(HogwartsStudent other) {
        if (transgressionDistance > other.transgressionDistance) {
            System.out.println(name + " обладает бОльшим расстоянием трансгрессии, чем " + other.name);
        } else if (transgressionDistance < other.transgressionDistance) {
            System.out.println(other.name + " обладает бОльшим расстоянием трансгрессии, чем " + name);
        } else {
            System.out.println(name + " и " + other.name + " равны по расстоянию трансгрессии");
        }
    }
}
