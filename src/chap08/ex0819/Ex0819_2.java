package chap08.ex0819;

public class Ex0819_2 {
    public static void main(String[] args) {
//        Test case 1: row test.
//        int[][] values = {
//                {0, 1, 0, 3, 1, 6, 1},
//                {0, 1, 6, 8, 6, 0, 1},
//                {6, 6, 6, 6, 2, 2, 9},
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
//                {3,5,3,1,4,0,7}
//        };

//        Test case 3: left diagonal
//        int[][] values = {
//                {0,1,0,3,1,6,1},
//                {0,1,6,8,6,0,1},
//                {9,6,2,1,8,2,9},
//                {6,9,6,1,1,9,1},
//                {1,3,9,1,4,0,7},
//                {3,3,3,9,4,0,7},
//        };

//        Test case 4: right diagonal
        int[][] values = {
                {0,1,0,3,1,6,1},
                {0,1,6,8,6,0,1},
                {5,6,2,1,6,2,9},
                {6,5,6,6,1,9,1},
                {1,3,6,1,4,0,7},
                {3,6,3,3,4,0,7},
        };

//        hasFourConsecutiveInRow(values);
//        hasFourConsecutiveInColumn(values);
//        hasFourConsecutiveInLeftDiagonal(values);
//        hasFourConsecutiveInRightDiagonal(values);
        hasFourConsecutive(values);


    }

    public static boolean hasFourConsecutiveInRow(int[][] m) {
        if (m == null || m.length == 0) {
            return false;
        }

        boolean result = false;

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length - 3; c++) {
                int count = 1;
                for (int x = 1; x <= 3; x++ ) {
                    if (m[r][c + x] == m[r][c]) {
                        count++;
                    } else {
                        count = 1;
                        break;
                    }
                }
                if (count == 4) {
                    System.out.print("Four consecutive equal numbers FOUND!. Start at m[" + r + "][" + c + "]\n");
                    result = true;
                    count = 1;
                    break;
                }
            }
        }

        return result;
    }

    public static boolean hasFourConsecutiveInColumn(int[][] m) {
        if (m == null || m.length == 0) {
            return false;
        }

        boolean result = false;
        for (int c = 0; c < m[0].length; c++) {
            for (int r = 0; r < m.length - 3; r++) {
                int count = 1;
                for (int x = 1; x <= 3; x++) {
                    if (m[r + x][c] == m[r][c]) {
                        count++;
                    } else {
                        count = 1;
                        break;
                    }
                }
                if (count == 4) {
                    System.out.print("Four consecutive equal numbers in column FOUND!. Start at m[" + r + "][" + c + "]\n");
                    result = true;
                    count = 1;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean hasFourConsecutiveInLeftDiagonal(int[][] m) {
        if (m == null || m.length == 0) {
            return false;
        }

        boolean result = false;
        for (int r = 0; r < m.length - 3; r++) {
            for (int c = 0; c < m[0].length - 3; c++) {
                int count = 1;
                for (int x = 1; x <= 3; x++) {
                    if (m[r + x][c + x] == m[r][c]) {
                        count++;
                    } else {
                        count = 1;
                        break;
                    }
                }
                if (count == 4) {
                    System.out.print("Four consecutive equal numbers in left diagonal FOUND!. Start at m[" + r + "][" + c + "]\n");
                    result = true;
                    count = 1;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean hasFourConsecutiveInRightDiagonal(int[][] m) {
        if (m == null || m.length == 0) {
            return false;
        }

        boolean result = false;
        for (int r = 0; r < m.length - 3; r++) {
            for (int c = m[0].length - 1; c >= 3; c--) {
                int count = 1;
                for (int x = 1; x <= 3; x++) {
                    if (m[r + x][c - x] == m[r][c]) {
                        count++;
                    } else {
                        count = 1;
                        break;
                    }
                }
                if (count == 4) {
                    System.out.print("Four consecutive equal numbers in right diagonal FOUND!. Start at m[" + r + "][" + c + "]\n");
                    result = true;
                    count = 1;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean hasFourConsecutive(int[][] m) {
        return hasFourConsecutiveInRow(m) || hasFourConsecutiveInColumn(m) || hasFourConsecutiveInLeftDiagonal(m) || hasFourConsecutiveInRightDiagonal(m);
    }
}
