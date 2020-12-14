package com.ifmo;

public class DeepForest extends Location
{
    DeepForest(String name, Stat... stat)
    {
        super(name, stat);
    }

    public boolean isWander(Winnie w)
    {
        return w.getLocation().equals(this.getName());
    }
}
