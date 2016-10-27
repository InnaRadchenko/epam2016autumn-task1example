package logic;

import domain.Vaucher;

public class AndFilter implements Filter {
    private Filter a;
    private Filter b;

    public AndFilter(Filter a, Filter b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean isSatisfy(Vaucher vaucher) {
        return a.isSatisfy(vaucher) && b.isSatisfy(vaucher);
    }
}
