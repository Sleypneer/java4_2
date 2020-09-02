import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 60;                                           //вес в кг
        double height = 1.65;                                    //рост в м
        double index = service.calculate(mass, height);           //индекс возвращается в кг/м2
        out.printf("%.2f", index);
    }
}