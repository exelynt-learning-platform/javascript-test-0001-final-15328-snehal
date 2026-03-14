public class HollowDiamond
 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i < 2 * n; i++) {
            int r = (i <= n) ? i : 2 * n - i;

            for (int s = 0; s < n - r; s++)
                System.out.print(" ");

            for (int j = 0; j < 2 * r - 1; j++)
                System.out.print((j == 0 || j == 2 * r - 2) ? "*" : " ");

            System.out.println();
        }
    }
}