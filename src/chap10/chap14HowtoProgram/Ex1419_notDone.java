package chap10.chap14HowtoProgram;

public class Ex1419_notDone {
    public static void main(String[] args) {
        String s = "10/02/1995";
        String[] inputDate = s.split("/");

        StringBuilder dateFormat = new StringBuilder("");
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        dateFormat.append(months[Integer.parseInt(inputDate[0]) - 1])
                .append(" ")
                .append(inputDate[1])
                .append(", ")
                .append(inputDate[2]);

        System.out.println(dateFormat.toString());
    }
}

// Better do this later with Regex, Class Pattern and Class Matcher