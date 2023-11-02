package ye.FACTORY;

import ye.DROID.*;

import java.util.TreeMap;

public class Sentry_AFactory extends DroidFactory {
	private static int BuildCount = 0;
	
    public Sentry_AFactory(String IDNumber) {
        super(IDNumber, "Alpha Droids");
        BuildCount = 0;
    }

    public TreeMap<String, SentryDroid_A> buildDroids_A(int count) {
        TreeMap<String, SentryDroid_A> a = new TreeMap<>();
        for(int i=1; i<= count; i++) {
            a.put("A"+i, new SentryDroid_A("A"+i));
            BuildCount++;
        }
        return a;
    }

}