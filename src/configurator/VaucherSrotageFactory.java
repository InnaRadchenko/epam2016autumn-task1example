package configurator;

import storage.FakeVaucherStorage;
import storage.VaucherStorage;

public class VaucherSrotageFactory {
    public static VaucherStorage create() {
        return new FakeVaucherStorage();
    }
}
