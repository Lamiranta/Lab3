package com.ifmo;

/**
 * The interface contained the actions executed for Location-type objects.
 */
public interface LocationAction
{
    void transferHost(String host);
    boolean isHere(Winnie w);
    String getGuest(int num) throws GuestNumberException;
    void enterGuests(Storyline... g);
    boolean isWander(Winnie w);
}
