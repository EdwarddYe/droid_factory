package ye.ARMS;

public abstract class Arm {
	private String IDNumber;
    private String AType;
    public Arm(String IDNumber, String AType) {
        this.IDNumber = IDNumber;
        this.AType = AType;
    }

    abstract public void displayInfo();
    public String getIDNumber() {
        return IDNumber;
    }
    
    public String get_Atype() {
    	return AType;
    }
}
