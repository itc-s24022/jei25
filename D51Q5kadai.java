public class D51Q5kadai {
    public static void main(String[] args) {
        double usage = Double.parseDouble(args[0]);

        int baseFee = 900 + 100;
        int unitRate = 13 + 1;

        int total = baseFee + (int)(usage * unitRate);

        System.out.println("今月のガス代金は" + total + "円");
    }
}
