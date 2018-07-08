import java.util.*;

public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,Set<String>> playerCards = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String playerName = input.split(":")[0];
            String allCards = input.split(":")[1];
            String playerDeck[] = allCards.split("[ ,]+");

            Set<String> cards = new HashSet<>();


            for (int i = 1; i < playerDeck.length; i++) {
                cards.add(playerDeck[i]);
            }
            if (!playerCards.containsKey(playerName)) {
                playerCards.put(playerName, cards);
            } else {
               Set<String> mergedCards = new HashSet<>();
                mergedCards.addAll(playerCards.get(playerName));
                mergedCards.addAll(cards);

                playerCards.put(playerName, mergedCards);
            }


            input = scanner.nextLine();
        }
        for (Map.Entry<String, Set<String>> entry : playerCards.entrySet()) {
            int score = calculateScore(entry.getValue());
            System.out.printf("%s: %d%n",entry.getKey(),score);
        }


    }
    private static int calculateScore(Set<String>cards){
        int score=0;
        for (String card : cards) {
            char power = card.charAt(0);
            char type =card.charAt(1);
            int powerScore = 0;
            int typeScore=0;
            if(card.length()==3){
                powerScore=10;
                type=card.charAt(2);
            }
            else{
            switch(power){
                case 'J':
                    powerScore=11;
                    break;
                case 'Q':
                    powerScore=12;
                    break;
                case 'K':
                    powerScore=13;
                    break;
                case 'A':
                    powerScore=14;
                    break;
                    default:
                        powerScore=Integer.parseInt(power+"");
                        break;

            }

            }
            switch(type){
                case 'S':
                    typeScore=4;
                    break;
                case 'H':
                    typeScore=3;
                    break;
                case 'D':
                    typeScore=2;
                    break;
                case 'C':
                    typeScore=1;
                    break;
                default:

                    break;

            }
            score+=typeScore*powerScore;
        }
        return score;


    }

}
