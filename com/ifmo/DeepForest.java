package com.ifmo;

/**
 * The class realized the Deep Forest location.
 */
public class DeepForest extends Location
{
    /**
     * Class constructor.
     *
     * @param name name of an object.
     * @param stat array of an object's stats.
     * @see Location
     */
    DeepForest(String name, Stat... stat)
    {
        super(name, stat);
    }

    /**
     * Check if Winnie has same location as current.
     *
     * @param w Winnie.
     * @return  true if Winnie is in this location.
     */
    public boolean isWander(Winnie w)
    {
        return w.getLocation().equals(this.getName());
    }
}
