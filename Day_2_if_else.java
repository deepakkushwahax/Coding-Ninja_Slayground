public class Day_2_if_else {
    public static String main(int a, int b) {
        String res = "";
        if (a>b)
            res = "greater";
        else if (a<b)
            res = "smaller";
        else
            res = "equal";

        return res;

    }
}
