package com.ifmo;

/**
 * An abstract class, parent for every other classes.
 */
abstract class Storyline
{
    private Stat[] stat;
    private final String name;

    /**
     * Class constructor.
     * @param name name of an object.
     */
    Storyline(String name) { this.name = name; }

    /**
     * Returns an array of actual stats contained stat.
     * If there's no stats it returns a null-pointer.
     *
     * @return an array of stats.
     * @see Stat
    */
    public Stat[] getStat() { return this.stat; }

    /**
     * Returns a string assigned to the name.
     *
     * @return actual name of class.
     */
    public String getName() { return this.name; }

    /**
     * Set the correspond stats as actual by assigning it to the stat.
     *
     * @param stat an array of actual stats.
     */
    protected void setStat(Stat... stat) { this.stat = stat; }
}
