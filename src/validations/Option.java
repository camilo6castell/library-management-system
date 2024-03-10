package validations;

public class Option {
    public static boolean isValid(String option, int limit) {
        try {
            return isInRange(Integer.parseInt(option), limit);
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isInRange(int option, int limit){
        return option >= 0 && option <= limit;
    }
}
