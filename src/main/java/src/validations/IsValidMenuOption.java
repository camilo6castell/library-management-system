package src.validations;

public class IsValidMenuOption {
    public static boolean execute(Integer chosenOption, int limit) {
        if (chosenOption == null){
            return false;
        }
        return isInRange(chosenOption, limit);
    }
    private static boolean isInRange(int chosenOption, int limit){
        return chosenOption >= 0 && chosenOption <= limit;
    }
}
