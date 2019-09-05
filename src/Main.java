import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m0;
        m0 = (int) (1500 * 0.97);
        int m = 3500;
        if(n > m) {
            n = n - m;
            if (n <= m0) {
                n = (int) (n / 0.97);
            } else {
                int m1 = (int) (3000 * 0.9 + m0);
                if (n <= m1) {
                    n = (int) ((n - m0) / 0.9 + 1500);
                } else {
                    int m2 = (int) (4500 * 0.8 + m1);
                    if (n <= m2) {
                        n = (int) ((n - m1) / 0.8 + 4500);
                    } else {
                        int m3 = (int) (26000 * 0.75 + m2);
                        if (n <= m3) {
                            n = (int) ((n - m2) / 0.75 + 9000);
                        } else {
                            int m4 = (int) (20000 * 0.7 + m3);
                            if (n <= m4) {
                                n = (int) ((n - m3) / 0.7 + 35000);
                            } else {
                                int m5 = (int) (25000 * 0.65 + m4);
                                if (n <= m5) {
                                    n = (int) ((n - m4) / 0.65 + 55000);
                                } else {
                                    n = (int) ((n - m5) / 0.55 + 80000);
                                }
                            }
                        }
                    }
                }
            }
            n += m;
        }


        System.out.print(n);
    }
}
