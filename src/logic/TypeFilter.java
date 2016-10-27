package logic;

import domain.Vaucher;
import domain.VaucherType;

public class TypeFilter implements Filter {
	private VaucherType vaucherType;

	public TypeFilter(VaucherType vaucherType) {
		this.vaucherType = vaucherType;
	}

	@Override
	public boolean isSatisfy(Vaucher vaucher) {
		return vaucher.getType() == vaucherType;
	}
}
