package logic;

import java.util.ArrayList;
import java.util.List;

import domain.Vaucher;
import storage.VaucherStorage;

public class FiltratorImpl implements Filtrator {
    private VaucherStorage storage;

    public FiltratorImpl(VaucherStorage storage) {
        this.storage = storage;
    }

    public void setStorage(VaucherStorage storage) {
        this.storage = storage;
    }

    public List<Vaucher> filter(Filter filter) {
        List<Vaucher> vauchers = storage.read();
        List<Vaucher> result = new ArrayList<>();
        for (Vaucher vaucher : vauchers) {
            if (filter.isSatisfy(vaucher)) {
                result.add(vaucher);
            }
        }
        return result;
    }

    public void filter(Filter filter, List<Vaucher> destVauchers) {
        List<Vaucher> srcVauchers = storage.read();
        for (Vaucher vaucher : srcVauchers) {
            if (filter.isSatisfy(vaucher)) {
                destVauchers.add(vaucher);
            }
        }
    }

    // public static List<Vaucher> filter(List<Vaucher> srcVauchers, Filter
    // filter, List<Vaucher> destVauchers) {
    // if(destVauchers == null) {
    // destVauchers = new ArrayList<>();
    // }
    // for(Vaucher vaucher : srcVauchers) {
    // if(filter.isSatisfy(vaucher)) {
    // destVauchers.add(vaucher);
    // }
    // }
    // return destVauchers;
    // }
}
