package ye.ARMS;

public class RightArm extends Arm {
    private boolean Operational;
    public RightArm(String IDNumber) {
        super(IDNumber, "Right Arm");
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
