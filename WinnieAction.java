package com.ifmo;

/**
 * The interface contained the actions executed for Winnie-type objects.
 */
public interface WinnieAction
{
    String sayPhrase(Location loc);
    void stay(Location loc) throws AnotherLocationException;
    void foundHoney();
}
