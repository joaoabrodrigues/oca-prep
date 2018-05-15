package udemy.arrays;

public class MultidimensionalArrays {

    // java is row major
    // 1 - one dimensional array -> simple array
    // 2 - asymmetrical two-dimensional array -> rows and columns (sheets)
    // 3 - three-dimensional array -> it's like a rubik's cube
    public static void main(String[] args) {
        //1d array
        int[] myArray = {0, 1};

        //2d array
        int[][] array = new int[2][4]; // 2 rows, 4 columns -> rows first
        int anotherArray[][] = new int[2][4];
        int[] myIntArray[] = new int[2][4];

        String[][] my2dArray = new String[][]{ // asymmetrical
                {"One", "Two"},
                {"Three", "Four", "Five"},
                {"Six", "Seven", "Eight", "Nine"},
                {"Ten"},
                null
        };

        int[][] numberTable = new int[2][3]; // symmetrical
        numberTable[0][0] = 1;
        numberTable[0][1] = 1;
        numberTable[0][2] = 1;
        // numberTable[0][3] = 1; -> IndexOutOfBounds

        // 3d array
        // pages, rows, columns
        int[][][] threeArray = new int[3][3][3]; // 3 pages, 3 rows, 3 columns -> pages first
        int oneMoreThreeArray[][][] = new int[3][3][3];
        int[] anotherThreeArray[][];

        int[][][] threeDArray = {
                {{1,2,3}, {4,5,6}, {7,8,9}}, // 0 page
                {{11,12,13}, {14,15,16}, {17,18,19}}, // 1 page
                {{21,22,23}, {24,25,26}, {27,28,29}} // 2 page
                 // 0 line   // 1 line    // 2 line
        };

        System.out.println(threeDArray[2][1][1]); // 25

        //int[][] types = new int[][]; -> does not compile, multidimensional arrays size must be declared, at least the first
    }
}
