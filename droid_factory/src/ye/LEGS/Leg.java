package ye.LEGS;

public abstract class Leg {
	private String IDNumber;
    private String LType;
    public Leg(String IDNumber, String LType) {
        this.IDNumber = IDNumber;
        this.LType = LType;
    }
    abstract public void displayInfo();
    public String getIDNumber() {
        return IDNumber;
    }
    public String getLType() {
        return LType;
    }
}
