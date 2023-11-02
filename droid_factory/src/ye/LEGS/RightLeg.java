package ye.LEGS;

public class RightLeg extends Leg{
	private boolean Operational;
    public RightLeg(String IDNumber) {
        super(IDNumber, "Right Leg");
        Operational = true;
    }
    @Override
    public void displayInfo() {
        System.out.println("Leg ID: "+ super.getIDNumber() + " Leg Type: " + super.getLType());
    }
    public boolean isOperational() {
        return Operational;
    }
    public void setOperational(boolean operational) {
        Operational = operational;
    }
}
