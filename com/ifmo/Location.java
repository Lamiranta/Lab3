package com.ifmo;

import static java.lang.Math.random;

abstract class Location extends Abstract implements LocationAction
{
    private final int key;
    private String terrain;

    Location(String name, Stat... stat)
    {
        super(name);
        setStat(stat);
        this.key = (int) (100 * random());
    }

    public String toString() { return this.getName(); }

    public boolean equals(Location loc)
    { return this.getName().equals(loc.getName()) && this.getStat() == loc.getStat(); }

    public int hashcode() { return this.key; }

    public boolean isHere(Winnie w)
    { return w.getLocation().equals(this.getName()); }

    public void transferHost(String host) {}

    public boolean isWander(Winnie w) { return false; }

    public String getGuest(int num) { return ""; }

    public void enterGuests(Abstract... g) {}
}
