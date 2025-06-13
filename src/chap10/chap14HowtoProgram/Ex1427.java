package chap10.chap14HowtoProgram;

public class Ex1427 {
    public static final String[] spamWords = {
            "Congratulations!",
            "Act now",
            "Click here",
            "Free gift",
            "Urgent",
            "Winner",
            "Risk-free",
            "Limited time offer",
            "100% satisfied",
            "No obligation",
            "Call now",
            "Exclusive deal",
            "This won’t last",
            "Lowest price",
            "Special promotion",
            "Guarantee",
            "Unsecured debt",
            "Get paid",
            "Lose weight fast",
            "Work from home",
            "Increase sales",
            "Double your income",
            "Eliminate debt",
            "Credit card required",
            "Pre-approved",
            "Get it now",
            "Hidden charges",
            "Order now",
            "Cheap meds",
            "Miracle cure"
    };

    public static void main(String[] args) {
        String s = "HEllo World, Act now, Congratulations!, you are the winner, join a risk-free experience. Get vegetable";

        System.out.println(containsSpamWord(s));
    }

    public static int containsSpamWord(String source) {
        int spamScore = 0;
        for (String spamWord : spamWords) {
            if (source.toLowerCase().contains(spamWord.toLowerCase())) {
                spamScore++;
            }
        }
        return spamScore;
    }
}
