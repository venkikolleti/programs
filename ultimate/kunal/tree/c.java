import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String compound = sc.nextLine();
        int equivalentPoint = sc.nextInt();
        sc.close();

        // Compute the valency of each element in the compound
        int valency1 = (compound.charAt(0) - 'A' + 1) % 9;
        int valency2 = (compound.charAt(1) - 'A' + 1) % 9;

        // Generate all possible combinations of the compounds
        List<String> combinations = new ArrayList<>();
        for (int i = 1; i <= equivalentPoint / valency1; i++) {
            int j = (equivalentPoint - (i * valency1)) / valency2;
            if (i * valency1 + j * valency2 == equivalentPoint) {
                combinations.add("A" + i + " " + compound.charAt(1) + j);
            }
        }

        // Print the combinations in descending order of the multiple of valency of the first element
        if (combinations.isEmpty()) {
            System.out.println("Not Possible");
        } else {
            combinations.sort((a, b) -> {
                int multiple1 = Integer.parseInt(a.substring(1, a.indexOf(' ')));
                int multiple2 = Integer.parseInt(b.substring(1, b.indexOf(' ')));
                return Integer.compare(multiple2 * valency2, multiple1 * valency1);
            });
            for (String combination : combinations) {
                System.out.println(combination);
            }
        }
    }
}