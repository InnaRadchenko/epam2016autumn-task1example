package storage;

import java.util.ArrayList;
import java.util.List;

import domain.Vaucher;
import domain.VaucherType;

public class FakeVaucherStorage implements VaucherStorage {
	// TODO: create BaseFakeVaucherStorage for CSV format
	@Override
	public List<Vaucher> read() {
		List<Vaucher> vauchers = new ArrayList<>();
		Vaucher vaucher = null;
		vaucher = new Vaucher();
		vaucher.setType(VaucherType.EXCURSION);
		vaucher.setDestinationPoint("Москва");
		vaucher.setTransport("автобус");
		vaucher.setFood("подножный корм");
		vaucher.setDays(2);
		vauchers.add(vaucher);
		vaucher = new Vaucher();
		vaucher.setType(VaucherType.RECREATION);
		vaucher.setDestinationPoint("Сочи");
		vaucher.setTransport("поезд");
		vaucher.setFood("роллтоны");
		vaucher.setDays(7);
		vauchers.add(vaucher);
		return vauchers;
	}
}
