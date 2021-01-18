package com.ifmo;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        // DumbFunction dumb;
        // dumb = (d) -> d;
        
        DumbFunction dumb = new DumbFunction() {
            @Override
            public int dumbMethod(int dumb) {
                return dumb;
            }
        };

        Winnie w = new Winnie("Winnie", Stat.HAPPY, Stat.EXCITED);
        Location l = new DeepForest("Some location", Stat.FULL);
        try {
            w.stay(l);
        }
        catch (AnotherLocationException ignored) {}
        System.out.println(Arrays.toString(w.getStat()));

        DeepForest df = new DeepForest("Deep Forest");
        System.out.println(df.hashcode());
        w.changePosition(df);
        System.out.println(w.sayPhrase(df));
        System.out.println(df.isWander(w));

        OwlHouse oh = new OwlHouse("Owl house", "", Stat.BROKEN, Stat.EMPTY);
        System.out.println(oh.hashcode());
        w.changePosition(oh);
        oh.enterGuests(w);
        System.out.println(oh.isHere(w));
        System.out.println(oh.getGuest(dumb.dumbMethod(0)));
        oh.transferHost("Owl");
    }
}

interface DumbFunction
{
    int dumbMethod(int dumb);
}