public class Card {
    String name;
    String suit;
    int cardValue;

    public Card(int suitNum, int cardNum){
        if (suitNum == 0){
            suit = "spades";
        } else if (suitNum == 1){
            suit = "diamonds";
        }
        else if (suitNum == 2){
            suit = "clubs";
        }
        else{
            suit = "hearts";
        }

        if (cardNum == 11){
            name = "jack";
            cardValue = 10;
        }else if (cardNum == 12){
            name = "queen";
            cardValue = 10;
        }else if (cardNum == 13){
            name = "king";
            cardValue = 10;
        }else if (cardNum == 2){
            name = "two";
            cardValue = 2;
        }else if (cardNum == 3){
            name = "three";
            cardValue = 3;
        }else if (cardNum == 4){
            name = "four";
            cardValue = 4;
        }else if (cardNum == 5){
            name = "five";
            cardValue = 5;
        }else if (cardNum == 6){
            name = "six";
            cardValue = 6;
        }else if (cardNum == 7){
            name = "seven";
            cardValue = 7;
        }else if (cardNum == 8){
            name = "eight";
            cardValue = 8;
        }else if (cardNum == 9){
            name = "nine";
            cardValue = 9;
        }else if (cardNum == 10){
            name = "ten";
            cardValue = 10;
        }else if(cardNum == 14){
            name = "ace";
            cardValue = 11;
        }else if (cardNum == 15){
            name = "ace";
            cardValue = 1;
        }
    }

    public void printCardInfo(){
        System.out.println(name + " of " + suit);
    }





}
