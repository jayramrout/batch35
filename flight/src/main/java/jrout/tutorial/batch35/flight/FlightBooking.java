package jrout.tutorial.batch35.flight;

import jrout.tutorial.batch35.creditcard.CreditMyCard;

public class FlightBooking {
    public static void main(String[] args) {
        System.out.println("I am going to book a flight");
        // call a function and pass my account details..
        CreditMyCard cc = new CreditMyCard();
        cc.creditFromMyAccount("7898888");
    }
}
