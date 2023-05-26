import java.util.ArrayList;

public class MyCasino {

    ArrayList<Card> deck;

    public static void main(String[] args) {
        MyCasino blackJack = new MyCasino();
    }

    public MyCasino(){
        createDeck();
        printDeck();

    }

    public void shuffle(){

    }

    public void deal(){

    }

    public void createDeck(){
        deck = new ArrayList<>();
        for (int x = 0; x < 4; x++) {
            for (int y = 2; y < 15; y++) {
                deck.add(new Card(x, y));
            }
        }
    }
    public void printDeck(){
        for (int x = 0; x < deck.size(); x++){
            deck.get(x).printCardInfo();
        }
    }

}
