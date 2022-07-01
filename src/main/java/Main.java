public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int min1 = 10;
        int max2 = 99;

        System.out.println(service.calcSQR(min1, max2));

        System.out.println();
        System.out.println(service.calcSQR(700, 1500));

        System.out.println();
        System.out.println(service.calcSQR(800, 1700));
    }
}