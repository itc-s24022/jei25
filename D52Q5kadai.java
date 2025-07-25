public class D52Q5kadai {
    public static void main(String[] args) {
        System.out.println(" +----+-----+-----+");

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                int stars = (int) Math.ceil(num / 50.0);

                System.out.print(String.format("%4d : ", num));
                for (int i = 0; i < stars; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println(arg + " は数値ではありません");
            }
        }
    }
}
