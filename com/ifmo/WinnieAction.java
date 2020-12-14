package com.ifmo;

/**
 * The interface contained the actions executed for Winnie-type objects.
 */
public interface WinnieAction
{
    void changePosition(Location loc);
    String sayPhrase(Location loc);
    void stay(Location loc);
    void foundHoney();
}
