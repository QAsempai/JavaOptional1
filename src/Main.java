public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70; // Вес (кг)
        double height = 1.8; // Рост (м)
        double bmi = service.calculate(70, 1.8);
        System.out.println("Индекс массы тела равен " + bmi);
    }
}