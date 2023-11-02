package ye.DROID;

import ye.ARMS.*;
import ye.BODIES.*;
import ye.INTERFACES.*;
import ye.LEGS.*;

import java.util.TreeMap;

public abstract class ImperialDroid implements DroidActions, DroidOperations {
    private String DroidId;
    private String DroidType;
    private Cranial Head;
    private Torso UpperTorso;
    private TreeMap<String, Arm> Arms;
    private TreeMap<String, Leg> Legs;

    public ImperialDroid(String droidId, String droidType) {
        DroidId = droidId;
        DroidType = droidType;
        Head = new Cranial("x");
        UpperTorso = new Torso("x");
        Arms = new TreeMap<>();
        Arms.put("Left Arm", new LeftArm("x"));
        Arms.put("Right Arm", new RightArm("x"));
        Legs = new TreeMap<>();
        Legs.put("Left Leg", new LeftLeg("x"));
        Legs.put("Right Leg", new RightLeg("x"));
    }

    public void displayInfo() {
        System.out.println("Droid ID: " + getDroidId());
        System.out.println("Droid Type: " + getDroidType());
    }

    public void runDiagnostic() {
        this.displayInfo();
        String normal = "Droid Operating Within Normal Parameters";
        String malfunctioning = "Droid has Malfunctioning Component(s)";
        String stars = "******";
        String comStatus = "Component Status";
        boolean status = false;
        if(Head.isOperational() && UpperTorso.isOperational()
                && ((LeftArm)Arms.get("Left Arm")).isOperational() && ((RightArm)Arms.get("Right Arm")).isOperational()
                && ((LeftLeg) Legs.get("Left Leg")).isOperational() && ((RightLeg) Legs.get("Right Leg")).isOperational()) {
            status = true;
        }
        System.out.println(stars);
        if(status) {
            System.out.println(normal);
        } else {
            System.out.println(malfunctioning);
        }
        System.out.println(comStatus);
        String x = Head.isOperational() ? "Normal" : "ERROR!!";
        System.out.println("HEAD Check:Head " +x );
        x = UpperTorso.isOperational() ? "Normal" : "ERROR!!";
        System.out.println("UPPER TORSO Check:Upper Torso " + x );
        x = ((LeftArm)Arms.get("Left Arm")).isOperational() ? "Normal" : "ERROR!!";
        System.out.print("ARMS Check:Left Arm " + x);
        x = ((RightArm) Arms.get("Right Arm")).isOperational() ? "Normal" : "ERROR!!";
        System.out.print(" Right Arm " + x+"\n");
        x = ((LeftLeg) Legs.get("Left Leg")).isOperational() ? "Normal" : "ERROR!!";
        System.out.print("LEGS Check:Left Leg "+ x );
        x = ((RightLeg) Legs.get("Right Leg")).isOperational() ? "Normal" : "ERROR!!";
        System.out.print(" Right Leg " + x);
    }
    public String getDroidId() {
        return DroidId;
    }
    public String getDroidType() {
        return DroidType;
    }
    public Cranial getHead() {
        return Head;
    }
    public Torso getUpperTorso() {
        return UpperTorso;
    }
    public TreeMap<String, Arm> getArms() {
        return Arms;
    }
    public TreeMap<String, Leg> getLegs() {
        return Legs;
    }
}