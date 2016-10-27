package storage;

import java.util.List;

import domain.Vaucher;

public interface VaucherStorage {
	List<Vaucher> read();
}
