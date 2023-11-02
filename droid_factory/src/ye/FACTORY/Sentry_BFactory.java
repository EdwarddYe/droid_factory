package ye.FACTORY;

import ye.DROID.SentryDroid_A;
import ye.DROID.SentryDroid_B;

import java.util.TreeMap;

public class Sentry_BFactory extends DroidFactory {
    private static int BuildCount = 0;

    public Sentry_BFactory(String IDNumber) {
        super(IDNumber, "Beta Droids");
        BuildCount = 0;
    }

    public TreeMap<String, SentryDroid_B> buildDroids_B(int count) {
        TreeMap<String, SentryDroid_B> b = new TreeMap<>();
        for(int i=1; i<= count; i++) {
            b.put("B"+i, new SentryDroid_B("B"+i));
            BuildCount++;
        }
        return b;
    }

}