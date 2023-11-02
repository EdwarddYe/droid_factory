package ye.BODIES;

public class Torso extends Body{
	private boolean Operational;

    public Torso(String IDNumber) {
        super(IDNumber, "Torso");
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
