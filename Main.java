public class Main {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {

            int num;

            if (i % 2 == 1)
                num = 1;
            else
                num = 0;

            for (int j = 1; j <= i; j++) {
                System.out.print(num);

                if (num == 1)
                    num = 0;
                else
                    num = 1;
            }

            System.out.println();
        }
    }
}