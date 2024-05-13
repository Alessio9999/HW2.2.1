public class Main {
    public static void main(String[] args) {

        GryffindorStudent garry = new GryffindorStudent(
                "Гарри Поттер", 10, 10, 3, 7, 9);
        GryffindorStudent germiona = new GryffindorStudent(
                "Гермиона Грейнджер",7,6,4,6,7);
        GryffindorStudent ron = new GryffindorStudent(
                "Рон Уизли", 6, 8, 4, 5, 5);

        SlytherinStudent draco = new SlytherinStudent(
                "Драко Малфой", 7, 8, 3, 7,
                7, 8,4);
        SlytherinStudent graham  = new SlytherinStudent(
                "Грэхэм Монтегю",5,9,8,6,
                4,9,5);
        SlytherinStudent gregory = new SlytherinStudent(
                "Грегори Гойл", 7, 8, 3, 7,
                7, 8,4);

        HufflepuffStudent zachariah = new HufflepuffStudent("Захария Смит", 7, 6,
                3, 4, 5);
        HufflepuffStudent cedric = new HufflepuffStudent("Седрик Диггори", 2, 3,
                6, 7, 8);
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", 2, 5,
                3, 8, 4);

        RavenclawStudent zhou = new RavenclawStudent("Чжоу Чанг", 2, 2, 8,
                8,8,9);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", 5, 4, 7,
                8,5,4);
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", 5, 4, 7,
                8,5,4);

        HogwartsStudent[] students = {garry, germiona, ron, draco, graham, gregory, zachariah, cedric, justin,
                zhou, padma, marcus};

        System.out.println();
        for (HogwartsStudent std : students) {
            System.out.println(std);
        }

        for (int i = 0; i < students.length; i++) {
            HogwartsStudent first = students[i];
            for (int j = i + 1; j < students.length; j++) {
                HogwartsStudent second = students[j];
                System.out.println("\nРезультаты сравнения двух учеников (любых факультетов) по общим свойствам:");
                first.compareMagicPowerWith(second);
                first.compareTransgressionDistanceWith(second);

                if (first instanceof GryffindorStudent && second instanceof GryffindorStudent){
                    GryffindorStudent firstGryffindorStudent = (GryffindorStudent) students[i];
                    GryffindorStudent secondGryffindorStudent = (GryffindorStudent) students[j];
                    System.out.println("\nРезультаты сравнения двух учеников одного факультета по свойствам только этого факультета:");
                    firstGryffindorStudent.innerCompareWith(secondGryffindorStudent);
                }
                if (first instanceof SlytherinStudent && second instanceof SlytherinStudent){
                    SlytherinStudent firstSlytherinStudent = (SlytherinStudent) students[i];
                    SlytherinStudent secondSlytherinStudent = (SlytherinStudent) students[j];
                    System.out.println("\nРезультаты сравнения двух учеников одного факультета по свойствам только этого факультета:");
                    firstSlytherinStudent.innerCompareWith(secondSlytherinStudent);
                }
                if (first instanceof HufflepuffStudent && second instanceof HufflepuffStudent){
                    HufflepuffStudent firstHufflepuffStudent = (HufflepuffStudent) students[i];
                    HufflepuffStudent secondHufflepuffStudent = (HufflepuffStudent) students[j];
                    System.out.println("\nРезультаты сравнения двух учеников одного факультета по свойствам только этого факультета:");
                    firstHufflepuffStudent.innerCompareWith(secondHufflepuffStudent);
                }
                if (first instanceof RavenclawStudent && second instanceof RavenclawStudent){
                    RavenclawStudent firstRavenclawStudent = (RavenclawStudent) students[i];
                    RavenclawStudent secondRavenclawStudent = (RavenclawStudent) students[j];
                    System.out.println("\nРезультаты сравнения двух учеников одного факультета по свойствам только этого факультета:");
                    firstRavenclawStudent.innerCompareWith(secondRavenclawStudent);
                }
            }
        }
    }
}