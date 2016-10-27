package logic;

import domain.Vaucher;

public interface Filter {
    boolean isSatisfy(Vaucher vaucher);
}
