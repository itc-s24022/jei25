public class D51Q26Kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";
        switch (n) {
            case 1:
                s += "one";
                break; // ← break を入れないと次の case に「落ちる」（fall-through）
            case 2:
                s += "two";
                break;
            default:
                s += "?";
        }
        System.out.println(s); // → "one"
    }
}
