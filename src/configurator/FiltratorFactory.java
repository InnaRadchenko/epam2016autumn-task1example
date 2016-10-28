package configurator;

import logic.Filtrator;
import logic.FiltratorImpl;
import storage.VaucherStorage;

public class FiltratorFactory {
    public static Filtrator create() {
        VaucherStorage storage = VaucherSrotageFactory.create();
        return new FiltratorImpl(storage);
    }
}
