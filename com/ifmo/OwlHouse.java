package com.ifmo;

/**
 * The class realized the Owl's House location.
 */
public class OwlHouse extends Location
{
    private String[] guest;
    private String host;

    /**
     * Class constructor.
     *
     * @param name name of an object
     * @param host name of an actual host of Owl's House
     * @param stat array of stats of an object
     * @see Location
     */
    OwlHouse(String name, String host, Stat... stat)
    {
        super(name, stat);
        this.host = host;
    }

    /**
     * Returns a guest with a specific number.
     * If there's no such guest then returns a string with notification.
     *
     * @param num specific number of guest.
     * @return    name of a guest.
     */
    public String getGuest(int num)
    {
        if (num > -1 && num < guest.length) return this.guest[num];
        else return "There is no such guest";
    }

    /**
     * Adds a new guests to the Owl's House.
     *
     * @param g array of an objects-"guests"
     */
    public void enterGuests(Storyline... g)
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

    /**
     * Transfer host to the another object-"host".
     *
     * @param host name of new host.
     */
    public void transferHost(String host)
    {
        this.host = host;
        System.out.println("There's new host: " + this.host);
    }

    /**
     * Check if Winnie is in an Owl's House by searching him through guest.
     *
     * @param w Winnie.
     * @return  true if Winnie has a status of guest.
     */
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
