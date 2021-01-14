package com.ifmo;

/**
 * Abstract class that realized a character.
 */
abstract class Person extends Storyline
{
    private String location;

    /**
     * Class constructor.
     *
     * @param name name of an object.
     * @param stat array of stats of an object.
     */
    Person(String name, Stat... stat)
    {
        super(name);
        setStat(stat);
        this.location = "Somewhere";
    }

    public String toString() { return this.getName(); }

    /**
     * Returns an actual location of Winnie.
     *
     * @return name of location.
     */
    public String getLocation() { return this.location; }

    /**
     * Changes parameter location to the new one.
     *
     * @param loc object of type Location.
     */
    public void changePosition(Location loc) { this.location = loc.toString(); }

    /**
     * Check if the specific Person object equals to current.
     *
     * @param p Person who's checked.
     * @return  true if there are equal objects.
     */
    public boolean equals(Person p)
    {
        if (this.getName().equals(p.getName()))
        {
            System.out.println("There's a clone.");
            return true;
        }
        return false;
    }
}
