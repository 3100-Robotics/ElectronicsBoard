package frc.team3100.robot.autonomous;

import frc.team3100.robot.Robot;

import java.io.*;
import java.util.ArrayList;

public class path {
    public ArrayList<dataPoint> generate(String filePath) {
        String line;
        String[] entries;
        ArrayList<dataPoint> talonPath = null;
        int a = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            talonPath = new ArrayList<>();
            while((line = br.readLine()) != null) {
                a += 1;
                entries = line.split(",");
                if(!entries[0].equals("dt")) {
                    dataPoint route = new dataPoint(entries[0], entries[1], entries[2], entries[3]);
                    talonPath.add(route);
                }
            }
        } catch (FileNotFoundException ex1){
            System.out.println(ex1);
        } catch (IOException ex2) {
            System.out.println(ex2);
        }

        return talonPath;

    }
}

class dataPoint {
    static double talonPos;
    static double talonVel;
    static double talonAcc;

    public dataPoint(String dt, String position, String velocity, String acceleration) {
        double pi = 3.141593;
        double countsPerRot = 4096 * 4.67;
        double diameter = .5;
        talonPos = (Double.parseDouble(position) * countsPerRot) / (pi * diameter);
        talonVel = (Double.parseDouble(velocity) * countsPerRot) / (pi * diameter * 100);

    }

    public double getTalonPosition() {
        return talonPos;
    }

    public double getTalonVelocity() {
        return talonVel;
    }

    public double getTalonAcceleration() {
        return talonAcc;
    }
}