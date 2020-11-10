import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.println(x >= 100 && x < 1000 && x % 5 == 0 ? true : false);
    }
}


