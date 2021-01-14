package com.ifmo;

import static java.lang.Math.random;

/**
 * An abstract class realized the minimal functional of Location-type objects.
 */
abstract class Location extends Storyline implements LocationAction
{
    private final int key;
    private String terrain;

    /**
     * Class constructor.
     *
     * @param name name of an object.
     * @param stat array of stats of an object.
     * @see Storyline
     */
    Location(String name, Stat... stat)
    {
        super(name);
        setStat(stat);
        this.key = (int) (100 * random());
    }

    /**
     * Returns an actual name of an object assigned to the name.
     *
     * @return actual name of an object given class.
     */
    public String toString() { return this.getName(); }

    /**
     * Check if given location equals to the current.
     *
     * @param loc location that's needed to be checked.
     * @return    true if they're same location.
     */
    public boolean equals(Location loc)
    { return this.getName().equals(loc.getName()) && this.getStat() == loc.getStat(); }

    /**
     * Returns a key given to the current location in constructor.
     *
     * @return a key of the location.
     */
    public int hashcode() { return this.key; }

    /**
     * Check if Winnie location equals to the current location.
     *
     * @param w Winnie.
     * @return  true if Winnie is here.
     */
    public boolean isHere(Winnie w)
    { return w.getLocation().equals(this.getName()); }

    public void transferHost(String host) {}

    public boolean isWander(Winnie w) { return false; }

    public String getGuest(int num) { return ""; }

    public void enterGuests(Storyline... g) {}
}
