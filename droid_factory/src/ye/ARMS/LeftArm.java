package ye.ARMS;

public class LeftArm extends Arm{
	private boolean Operational;
    public LeftArm(String IDNumber) {
        super(IDNumber, "Left Arm");
        Operational = true;
    }
    @Override
    public void displayInfo() {
        System.out.println("Arm ID: " + super.getIDNumber() + " Arm Type: " + super.get_Atype());
    }
    public boolean isOperational() {
        return Operational;
    }
    public void setOperational(boolean operational) {
        Operational = operational;
    }
}
