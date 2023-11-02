package ye.BODIES;

public class Cranial extends Body{
	private boolean Operational;

    public Cranial(String IDNumber) {
        super(IDNumber, "Cranial");
        Operational = true;
    }

    @Override
    public void displayInfo() {
        System.out.println("Body ID: " + super.getIDNumber() + " Body Type: " + super.getBType());
    }

    public boolean isOperational() {
        return Operational;
    }

    public void setOperational(boolean operational) {
        Operational = operational;
    }
}
