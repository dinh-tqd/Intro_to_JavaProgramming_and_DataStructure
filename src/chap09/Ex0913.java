package chap09;

public class Ex0913 {
    public static void main(String[] args) {
        double[][] array = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6},
        };

        Location l = locateLargest(array);
        System.out.println(l.getMaxValue());
        System.out.println(l.getRow());
        System.out.println(l.getColumn());
    }

    public static Location locateLargest(double[][] a) {
        Location l1 = new Location();
        l1.setMaxValue(a[0][0]);
        l1.setRow(0);
        l1.setColumn(0);
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if (a[r][c] > l1.getMaxValue()) {
                    l1.setMaxValue(a[r][c]);
                    l1.setRow(r);
                    l1.setColumn(c);
                }
            }
        }
        return l1;
    }
}

class Location {
    int row;
    int column;
    double maxValue;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }
}
