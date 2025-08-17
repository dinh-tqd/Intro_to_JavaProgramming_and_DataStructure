package chap08.ex0819;

public class Ex0819 {
    public static void main(String[] args) {
//        Test case 1: row test.
//        int[][] values = {
//                {0, 1, 0, 3, 1, 6, 1},
//                {0, 1, 6, 8, 6, 0, 1},
//                {5, 6, 2, 1, 8, 2, 9},
//                {6, 5, 6, 1, 1, 9, 1},
//                {1, 3, 6, 1, 4, 0, 7},
//                {3, 3, 3, 3, 4, 0, 7},
//        };

//        Test case2: column test.
//        int[][] values = {
//                {0,1,0,3,1,6,1},
//                {0,1,6,8,6,0,1},
//                {5,5,2,1,8,2,9},
//                {6,5,6,1,1,9,1},
//                {1,5,6,1,4,0,7},
//                {3,5,3,3,4,0,7}
//        };
//        Test case 3: diagonal D1
//        int[][] values = {
//                {0,1,0,3,1,6,1},
//                {0,1,6,8,6,0,1},
//                {5,6,2,1,6,2,9},
//                {6,5,6,6,1,9,1},
//                {1,3,6,1,4,0,7},
//                {3,6,3,3,4,0,7},
//        };

//        Test case 4: diagonal D2
        int[][] values = {
                {0,1,0,3,1,6,1},
                {0,1,6,8,6,0,1},
                {9,6,2,1,8,2,9},
                {6,9,6,1,1,9,1},
                {1,3,9,1,4,0,7},
                {3,3,3,9,4,0,7},
        };


        System.out.println(rowCheck(values));
        System.out.println(colCheck(values));
        System.out.println(diagonalD1Check(values));
        System.out.println(diagonalD2Check(values));
        System.out.println(isConsecutiveFour(values)? true : false );
    }

    public static boolean isConsecutiveFour(int[][] values) {
        boolean condition = rowCheck(values) || colCheck(values) || diagonalD1Check(values) || diagonalD2Check(values);
        return condition;
    }

    public static boolean rowCheck(int[][] values) {
        for (int r = 0; r < values.length; r++) {
            for (int c = 0; c + 3 < values[0].length; c++) {
                boolean match = true;
                for (int x = 1; x <= 3; x++) {
                    if (values[r][c + x] != values[r][c]) {
                        match = false;
                        break;
                    }
                }
                if (match) return true;
            }
        }
        return false;
    }

    public static boolean colCheck(int[][] values) {
        for (int c = 0; c < values[0].length; c++) {
            for (int r = 0; r + 3 < values.length; r++) {
                boolean match = true;
                for (int x = 1; x <= 3; x++) {
                    if (values[r + x][c] != values[r][c]) {
                        match = false;
                        break;
                    }
                }
                if (match) return true;
            }
        }
        return false;
    }

    public static boolean diagonalD1Check(int[][] values) {
        for (int r = values.length - 1; r >= 3; r-- ) {
            for (int c = 0; c + 3 < values[0].length; c++) {
                boolean match = true;
                for (int x = 1; x <= 3; x++) {
                    if (values[r - x][c + x] != values[r][c]) {
                        match = false;
                        break;
                    }
                }
                if (match) return true;
            }
        }
        return false;
    }

    public static boolean diagonalD2Check(int[][] values) {
        for (int r = 0; r + 3 < values.length; r++) {
            for (int c = 0; c + 3 < values[0].length; c++) {
                boolean match = true;
                for (int x = 1; x <= 3; x++) {
                    if (values[r + x][c + x] != values[r][c]) {
                        match = false;
                        break;
                    }
                }
                if (match) return true;
            }
        }
        return false;
    }
}