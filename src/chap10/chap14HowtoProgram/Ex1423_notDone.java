// Reason for not finishing this:
// Weak when it's come to OOP
// Haven't learn Exception Handling

package chap10.chap14HowtoProgram;

public class Ex1423_notDone {
    public static void main(String[] args) {
//        String[] lengthUnitInMetricSystem = {"mm", "cm", "m", "km"};
//        String[] lengthUnitInEnglishSystem = {"in", "ft", "yd", "mi"};
//        String[] weightUnitInMetricSystem = {"mg", "g", "kg", "ton"};
//        String[] weightUnitInEnglishSystem = {"ob", "lb", "st", "long ton"};
//        String[] volumeUnitInMetricSystem = {"mL", "cL", "L"};
//        String[] volumeUnitInEnglishSystem = {"fl oz", "cup", "pt", "qt", "gal"};
//
//        String[][][] s = new String[3][][];
//        s[0] = new String[][]{
//                {"mm", "cm", "m", "km"},
//                {"in", "ft", "yd", "mi"}
//        };
//        s[1] = new String[][]{
//                {"mg", "g", "kg", "ton"},
//                {"ob", "lb", "st", "long ton"},
//        };

        Length q1 = new Length(2, "L", "cm");
        System.out.println(q1.convertUnitsInMetricSystem());
    }
}


class Length {
    static final String[] unitsInMetricSystem = {"mm", "cm", "dm", "m", "km"};
    static final String[] unitsInEnglishSystem = {"in", "ft", "yd", "mi"};

    private double value;
    private String unit;
    private String wantedUnit;

    Length(double value, String unit, String wantedUnit) {
        this.value = value;
        this.unit = unit;
        this.wantedUnit = wantedUnit;
    }

    public double convertUnitsInMetricSystem() {
        boolean n1Found = false;
        boolean n2Found = false;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < unitsInMetricSystem.length; i++) {
            if (unitsInMetricSystem[i].equals(unit)) {
               n1 = i;
               n1Found = true;
            }
            if (unitsInMetricSystem[i].equals(wantedUnit)) {
                n2 = i;
                n2Found = true;
            }
            if (n1Found && n2Found) {
                break;
            }
        }

        if (!n1Found || !n2Found) {
            System.out.println("Invalid question.");
            throw new IllegalArgumentException("Invalid unit(s) for conversion.");
        }

        return value * Math.pow(10, n1 - n2);
    }
}
//
//class Weight {
//    static final String[] unitsInMetricSystem = {"mg", "g", "kg", "ton"};
//    static final String[] unitsInEnglishSystem = {"ob", "lb", "st", "long ton"};
//}
//
