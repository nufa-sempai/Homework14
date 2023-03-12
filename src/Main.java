import java.util.Random;

public class Main {

    private static Random RANDOM = new Random();
    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        GryffindorStudent hermione = generateGryffindorStudent("Гермиона Грейнджер");

        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent graham = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent gregory = generateSlytherinStudent("Грегори Гойл");

        HufflepuffStudent zacharias = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent cedric = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent justin = generateHufflepuffStudent("Джастин Финч-Флетчли");

        RavenclawStudent luna = generateRavenclawStudent("Полумна Лавгуд");
        RavenclawStudent zhou = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");

        harry.print();
        ron.print();
        hermione.print();
        draco.print();
        graham.print();
        gregory.print();
        zacharias.print();
        cedric.print();
        justin.print();
        luna.print();
        zhou.print();
        padma.print();

        harry.compareHogwarts(draco);
        harry.compareGryffindor(ron);
        hermione.compareHogwarts(luna);
        cedric.compareHufflepuff(justin);
        luna.compareRavenclaw(zhou);
        draco.compareHogwarts(cedric);
    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}