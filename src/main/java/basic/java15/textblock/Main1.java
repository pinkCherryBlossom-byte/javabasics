package basic.java15.textblock;

public class Main1 {

    public static void main(String[] args) {
        String a = """
                Hello,  \s
                How are you?
                I am good!!
                """;

        String b = """
                Hello,\
                How are you? \
                I am good!!\
                """;

        String c = """
                Hello,\
                How are you? \
                I am good!!\
                """.toUpperCase();

        System.out.println(a);
        System.out.println();
        System.out.println(b);
        System.out.println(c);
    }
}
