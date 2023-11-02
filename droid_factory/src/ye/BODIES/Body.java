package ye.BODIES;

public abstract class Body {
	private String IDNumber;
    private String BType;
    public Body(String IDNumber, String BType) {
        this.IDNumber = IDNumber;
        this.BType = BType;
    }
    abstract public void displayInfo();
    public String getIDNumber() {
        return IDNumber;
    }
    public String getBType() {
        return BType;
    }
}
