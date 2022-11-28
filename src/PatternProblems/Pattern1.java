package PatternProblems;

public class Pattern1 {
    public static void main(String[] args) {
        patter1(4);

    }

    static void patter1(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");

            }
            //When one row is printed we need to print new line
            System.out.println();


        }

    }
}