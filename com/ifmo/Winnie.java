package com.ifmo;

import static java.lang.Math.random;

public class Winnie extends Abstract implements WinnieAction
{
    private String location;
    private double weight;
    private boolean hasHoney;
    
    Winnie(String name, Stat... stat)
    {
        super(name);
        setStat(stat);
        this.location = "Somewhere";
        this.weight = 10 * (random() + 0.1);
        this.hasHoney = false;
    }

    public String toString() { return this.getName(); }

    public String getLocation() { return this.location; }

    public String sayPhrase(Location loc)
    {
        return "I wander through " + loc.toString() + " and try to find honey.";
    }

    public void changePosition(Location loc) { this.location = loc.toString(); }

    public void stay(Location loc)
    {
        if (!(this.getLocation().equals(loc.toString())))
            changePosition(loc);
        setStat(Stat.STOPPED);
    }

    public boolean equals(Winnie w)
    {
        if (this.getName().equals(w.getName()) && this.weight == w.weight)
        {
            System.out.println("WTF?! Another Winnie???");
            return true;
        }
        return false;
    }

    public void foundHoney()
    {
        this.hasHoney = true;
        this.weight += 10 * (random() + 0.25);
        System.out.println("I found honey!.. Now I have a half of this barrel.");
    }
}
