
import java.util.ArrayList;
import java.util.Random;

public class CardShuffler {

    public static void main(String[] args) {
        ArrayList<Integer> cards = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            cards.add(i);
        }

        for (int i : cards) {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        cards = Shuffler(cards);

        for (int i : cards) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> Shuffler(ArrayList<Integer> Cards) {
        Random rand = new Random();

        ArrayList<Integer> out = new ArrayList<>();

        for (; !Cards.isEmpty();) {
            int i = rand.nextInt(0, Cards.size());
            out.add(Cards.get(i));
            Cards.remove(i);
        }

        return out;
    }

}
