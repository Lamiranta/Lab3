package com.ifmo;

import static java.lang.Math.random;

/**
 * The class realized Piglet character.
 */
public class Piglet extends Person
{
    private int height;

    Piglet(String name, Stat... stat)
    {
        super(name, stat);
        this.height = (int) (5 * random() + 15);
    }

    public String toString() { return this.getName(); }

    /**
     * Change the location of Piglet whenever Winnie is there.
     *
     * @param loc object of type Location
     * @param w   Winnie object
     */
    public void changePosition(Location loc, Winnie w)
    {
        if (w.getLocation().equals(loc.toString()))
            changePosition(loc);
        else
            System.out.println("But Winnie isn't there...");
    }

    /**
     * Piglet becomes afraid and tries to hide whenever Winnie isn't here.
     *
     * @param loc current Location of Piglet
     * @param w   Winnie object
     */
    public void tryToHide(Location loc, Winnie w)
    {
        if (!(w.getLocation().equals(loc.toString())))
        {
            this.setStat(Stat.SAD);
            double p = random();
            while(p > 0.3 && p < 0.8)
            {
                System.out.println("Piglet is trying to hide... again");
                p = random();
            }
            if (p < 0.3) System.out.println("Piglet is tired");
            else
            {
                setStat(Stat.EXCITED, Stat.STOPPED);
                System.out.println("Piglet is hidden... For now");
            }
        }
        else System.out.println("Why must I hide from Winnie?");
    }
}
