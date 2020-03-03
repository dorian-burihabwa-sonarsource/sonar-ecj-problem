package example;

import net.openhft.affinity.AffinityLock;

public class Main {
    public int plus() {
        AffinityLock affinityLock = AffinityLock.acquireCore();
        String problematicString = "SomeString";
        System.out.println(problematicString);
        return 2;
    }
}
