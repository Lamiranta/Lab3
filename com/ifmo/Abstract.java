package com.ifmo;

abstract class Abstract
{
    private Stat[] stat;
    private final String name;

    Abstract(String name) { this.name = name; }

    public Stat[] getStat() { return this.stat; }

    public String getName() { return this.name; }

    protected void setStat(Stat... stat) { this.stat = stat; }
}
