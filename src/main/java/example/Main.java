package example;

import com.google.common.io.Files;
import net.openhft.affinity.AffinityLock;

import java.io.File;
import java.io.IOException;

public class Main {

    public int plus() throws IOException {
        AffinityLock affinityLock = AffinityLock.acquireCore();
        Files.createParentDirs(new File("SomeFile"));
        String problematicString = "SomeString";
        System.out.println(problematicString);
        return 2;
    }
}
