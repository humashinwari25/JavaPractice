package Constructor;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA", "Journey to SDET: " +
                "Cydeo Batch 23", "10/25/2021","Kuzzat Altay");

        movie1.addCast("Muthar Mahmut");
        String[] casts = {"Asiya", "Adam", "Muhtar", "Huma", "Chinara", "Aaron", "Kim"};
        movie1.addCasts(casts);

        System.out.println(movie1);
    }
}
