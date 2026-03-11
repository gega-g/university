package infrastructure;

public class UniversityInfo {
    public static String universityName;
    public static int establishedYear;
    public static int graduates;

    static {
        universityName = "Business and Technology University";
        establishedYear = 2016;
        graduates = 2816;
        System.out.println("University System Initialized...");
    }

    public static void displayStats() {
        System.out.println("Welcome to " + universityName + ", University with " + graduates +
                " graduates." + " Established in " + establishedYear);
    }
}