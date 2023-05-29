package HW25;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class Card {

    private double interestRate;
    private String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getCardType() {
        return cardType;
    }

    void printInfo(){
        System.out.println(getCardType()+" "+getInterestRate());
    }


    public static void main(String[] args) {


        Card card1 = new Card(19.5, "Mastercard");
        Card card2 = new Card(21.3, "Visa");
        Card card3 = new Card(23.1, "Amex");

        List<Card> cards = new LinkedList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        System.out.println(cards);

        for (Card c : cards) {
            System.out.println(c.getCardType() + " " + c.getInterestRate());
        }

        System.out.println("*********************");

        Iterator<Card> it=cards.iterator();
        while (it.hasNext()){
            Card c=it.next();
            c.printInfo();
            System.out.println(c.getCardType());
            System.out.println(c.getInterestRate());
        }

    }

}
