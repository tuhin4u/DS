package com.ds.dll;

/**
 * Created by U6042192 on 09-Jan-17.
 */

import java.util.ArrayList;
import java.util.List;
/**
 * Created by U6042192 on 24-Oct-16.
 */
enum RegulatoryDepthType {
    MEDICAL_DEVICES_AND_IVDS("MD", "Medical Devices and IVDs"),
    DRUGS_AND_BIOLOGICS("DB", "Drugs and Biologics");

    private String name;
    private String id;

    private RegulatoryDepthType(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getValue() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static RegulatoryDepthType getByName(String name) {
        for (RegulatoryDepthType type : values()) {
            if (type.getName().equalsIgnoreCase(name)) return type;
        }
        return null;
    }

    public static List<String> names() {
        List<String> names = new ArrayList<String>();
        for (RegulatoryDepthType e : values()) names.add(e.getName());
        return names;
    }
}



public class Test {
    public static void main(String[] args) {
        RegulatoryDepthType rdt=RegulatoryDepthType.getByName("md");
        if (rdt != null) {
            System.out.println(rdt.getName());
            System.out.println(rdt.getValue());
        }

    }
}

