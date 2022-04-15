package kraakmo.learningjava;

public class ArraysTwo {
    public static void main(String[] args) {

        String [][] cityTeamNames = {
                {"Cleveland", "Browns", "Cavs", "Indians"},
                {"Columbus", "Bluejackets", "Buckeyes"},
                {"Pittsburgh", "Steelers", "Pirates", "Penguins"}
        };

        for(int i = 0; i < cityTeamNames.length; i++) {
            for(int j = 0; j < cityTeamNames[i].length; j++) {
                System.out.print(cityTeamNames[i][j] + " ");
            }
            System.out.println();
        }
    }
}