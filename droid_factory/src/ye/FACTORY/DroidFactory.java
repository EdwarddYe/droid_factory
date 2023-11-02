package ye.FACTORY;

public class DroidFactory {
    private String IDNumber;
    private String BuildType;

    public DroidFactory(String IDNumber, String buildType) {
        this.IDNumber = IDNumber;
        this.BuildType = buildType;
    }

    public void displayInfo() {
        System.out.println("Droid Factory ID: " + IDNumber);
        System.out.println("Droid Type: " + BuildType);
    }
}