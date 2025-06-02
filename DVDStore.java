public class DVDStore {
    public static void main(String[] args) {
        int N1 = 2, N2 = 2, N3 = 2; // Number of DVDs rented
        int M1 = 5, M2 = 5, M3 = 5; // Number of delayed days

        ActionDVD action = new ActionDVD(1, "Action Movie", "Excellent");
        ComedyDVD comedy = new ComedyDVD(2, "Comedy Movie", "Good");
        HorrorDVD horror = new HorrorDVD(3, "Horror Movie", "Fair");

        double fineAction = action.computeFine(N1, M1);
        double fineComedy = comedy.computeFine(N2, M2);
        double fineHorror = horror.computeFine(N3, M3);

        double totalFine = fineAction + fineComedy + fineHorror;
        int totalMovies = N1 + N2 + N3;

        if (totalMovies >= 3) {
            totalFine -= totalFine * 0.25;
        }

        System.out.println("Total fine: $" + totalFine);
    }
}
