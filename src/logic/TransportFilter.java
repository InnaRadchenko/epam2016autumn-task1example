package logic;

import domain.Vaucher;

public class TransportFilter implements Filter {
	private String transport;

	public TransportFilter(String transport) {
		this.transport = transport;
	}

	@Override
	public boolean isSatisfy(Vaucher vaucher) {
		return transport.equalsIgnoreCase(vaucher.getTransport());
	}
}
