public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 77;
        double height = 1.78;
        double myIndex = service.calculate(weight, height);
        System.out.println(myIndex);

    }
}