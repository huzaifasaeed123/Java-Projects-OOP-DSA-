/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deckofcardstest;

/**
 *
 * @author ENVY
 */
public class Card {
    
    private String face;
private String suit;

public Card( String cardFace, String cardSuit )
{
face = cardFace;
suit = cardSuit;
}

public String toString()
{
return face + " of " + suit;
}
}

//Fig 7.10 DeckOfCards.java