package com.ifmo;

public class OwlHouse extends Location
{
    private String[] guest;
    private String host;

    OwlHouse(String name, String host, Stat... stat)
    {
        super(name, stat);
        this.host = host;
    }

    public String toString() { return this.getName(); }

    public String getGuest(int num)
    {
        if (num > -1 && num < guest.length) return this.guest[num];
        else return "There is no such guest";
    }

    public void enterGuests(Abstract... g)
    {
        String[] prev, temp;
        if (this.guest != null)
        {
            prev = this.guest;
            temp = new String[g.length + prev.length];
            System.arraycopy(prev, 0, temp, g.length, prev.length);
        }
        else temp = new String[g.length];
        for (int i = 0; i < g.length; ++i)
            temp[i] = g[i].getName();
        this.guest = temp;
    }

    public void transferHost(String host)
    {
        this.host = host;
        System.out.println("There's new host: " + this.host);
    }

    public boolean isHere(Winnie w)
    {
        if(w.getLocation().equals(this.toString()) && this.guest != null)
        {
            for (String g : this.guest)
                if (w.toString().equals(g.toString()))
                    return true;
            System.out.println("Where is Winnie?!");
        }
        return false;
    }
}
