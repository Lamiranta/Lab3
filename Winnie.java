package com.ifmo;

import static java.lang.Math.random;

/**
 * The class realized the Winnie character.
 */
public class Winnie extends Person implements WinnieAction
{
    private double weight;
    private boolean hasHoney;

    /**
     * Class constructor.
     *
     * @param name name of an object.
     * @param stat array of stats of an object.
     */
    Winnie(String name, Stat... stat)
    {
        super(name, stat);
        this.weight = 10 * (random() + 0.1);
        this.hasHoney = false;
    }

    public String toString() { return this.getName(); }

    /**
     * Returns a string with specification to some location.
     *
     * @param loc object of type Location
     * @return a string.
     */
    public String sayPhrase(Location loc)
    {
        return "I wander through " + loc.toString() + " and try to find honey.";
    }

    /**
     * Set Stat.STOPPED as an actual Winnie stat with specification to some location.
     * If Winnie's location doesn't equal to the specific location,
     * it changes with changePosition() function.
     *
     * @param loc object of type Location.
     */
    public void stay(Location loc) throws AnotherLocationException
    {
        try
        {
            if (!(this.getLocation().equals(loc.toString())))
                throw new AnotherLocationException("Winnie is in another location");
            setStat(Stat.STOPPED);
        }
        catch (AnotherLocationException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Check if the specific Winnie object equals to current.
     *
     * @param w another Winnie.
     * @return  true if there are equal objects.
     */
    public boolean equals(Winnie w)
    {
        if (this.getName().equals(w.getName()) && this.weight == w.weight)
        {
            System.out.println("WTF?! Another Winnie???");
            return true;
        }
        return false;
    }

    /**
     * Changes parameters of hasHoney and weight for Winnie.
     */
    public void foundHoney()
    {
        this.hasHoney = true;
        this.weight += 10 * (random() + 0.25);
        System.out.println("I found honey!.. Now I have a half of this barrel.");
    }
}
