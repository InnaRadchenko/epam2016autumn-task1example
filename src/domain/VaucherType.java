package domain;

abstract public class VaucherType {
	private String name;

	protected VaucherType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return getConstantName();
	}

	abstract protected String getConstantName();

	public static final VaucherType RECREATION = new RecreationVaucherType("отдых");
	public static final VaucherType EXCURSION = new ExcursionVaucherType("экскурсия");

	private static VaucherType[] types = {
		RECREATION,
		EXCURSION
	};

	public static VaucherType[] values() {
		return types; // TODO: return copy of array
	}

	private static class RecreationVaucherType extends VaucherType {
		protected RecreationVaucherType(String name) {
			super(name);
		}

		@Override
		protected String getConstantName() {
			return "RECREATION";
		}
	}

	private static class ExcursionVaucherType extends VaucherType {
		protected ExcursionVaucherType(String name) {
			super(name);
		}

		@Override
		protected String getConstantName() {
			return "EXCURSION";
		}
	}
}
