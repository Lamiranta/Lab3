package com.ifmo;

public interface LocationAction
{
    void transferHost(String host);
    boolean isHere(Winnie w);
    String getGuest(int num);
    void enterGuests(Abstract... g);
    boolean isWander(Winnie w);
}
