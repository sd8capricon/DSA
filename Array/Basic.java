package Array;

class Basic {
    public static void main(String[] args) {
        // 1-D Array
        int idk[] = { 1, 2, 3, 4 };
        for (int i : idk)
            System.err.print(i + ", ");

        System.err.println();

        int idk2[][] = { { 1, 2, 3 },
                { 4, 5, 6, },
                { 7, 8, 9 } };
        for (int i = 0; i < idk2.length; i++) {
            for (int j = 0; j < idk2[i].length; j++)
                System.out.print(idk2[i][j] + ", ");
            System.err.println("");
        }
    }
}