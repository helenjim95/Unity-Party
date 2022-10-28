package de.tum.in.ase;

public class Ticket {

	private boolean valid;

	public Ticket(boolean valid) {
		this.valid = valid;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return (valid ? "valid" : "invalid") + " ticket";
	}
}
