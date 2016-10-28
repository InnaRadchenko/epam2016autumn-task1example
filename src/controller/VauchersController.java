package controller;

import java.util.LinkedList;
import java.util.List;

import configurator.FiltratorFactory;
import domain.Vaucher;
import domain.VaucherType;
import logic.AndFilter;
import logic.DaysFilter;
import logic.Filter;
import logic.Filtrator;
import logic.TypeFilter;

public class VauchersController {
    public static void output(List<Vaucher> vauchers) {
        for (Vaucher vaucher : vauchers) {
            System.out.println(vaucher);
        }
    }

    private Filtrator filtrator;

    public VauchersController(Filtrator filtrator) {
        this.filtrator = filtrator;
    }

    public void run() throws Exception {
        Filter filter = new AndFilter(new TypeFilter(VaucherType.RECREATION), new DaysFilter(1, 10));
        List<Vaucher> filteredVauchers = new LinkedList<>();
        filtrator.filter(filter, filteredVauchers);
        System.out.println("Отфильтрованный список");
        output(filteredVauchers);
    }

    public static void main(String[] args) throws Exception {
        Filtrator filtrator = FiltratorFactory.create();
        VauchersController controller = new VauchersController(filtrator);
        controller.run();
    }
}
