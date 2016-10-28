package logic;

import java.util.List;

import domain.Vaucher;

public interface Filtrator {
    public List<Vaucher> filter(Filter filter);

    public void filter(Filter filter, List<Vaucher> destVauchers);
}
