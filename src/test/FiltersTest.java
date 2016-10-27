package test;

import java.util.LinkedList;
import java.util.List;

import domain.Vaucher;
import domain.VaucherType;
import logic.AndFilter;
import logic.DaysFilter;
import logic.Filter;
import logic.Filtrator;
import logic.TypeFilter;
import storage.FakeVaucherStorage;
import storage.VaucherStorage;

public class FiltersTest {
	public static void output(List<Vaucher> vauchers) {
		for(Vaucher vaucher : vauchers) {
			System.out.println(vaucher);
		}
	}
	public static void main(String[] args) throws Exception {
		VaucherStorage storage = new FakeVaucherStorage();
		List<Vaucher> vauchers = storage.read();
		System.out.println("Исходный список");
		output(vauchers);
		Filter filter = new AndFilter(new TypeFilter(VaucherType.RECREATION), new DaysFilter(1, 10));
		List<Vaucher> filteredVauchers = new LinkedList<>();
		Filtrator.filter(vauchers, filter, filteredVauchers);
		System.out.println("Отфильтрованный список");
		output(filteredVauchers);
	}
}
