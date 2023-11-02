package ye.FACTORY;

import ye.DROID.*;
import java.util.TreeMap;

public class Sentry_CFactory extends DroidFactory {
    private static int BuildCount = 0;
    public Sentry_CFactory(String IDNumber) {
        super(IDNumber, "Gamma Droids");
        BuildCount = 0;
    }
    public TreeMap<String, SentryDroid_C> buildDroids_C(int count) {
        TreeMap<String, SentryDroid_C> c = new TreeMap<>();
        for(int i=1; i<= count; i++) {
            c.put("C"+i, new SentryDroid_C("C"+i));
            BuildCount++;
        }
        return c;
    }

}