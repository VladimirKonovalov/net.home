package edu.netckracker.konovalov.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Vlladimir
 */
public class Main {

    public static void main(String[] args) {
        Rover r;
        GroundVisor visor = new GroundVisor(20,20);
        r = new Rover(Direction.WEST, 10, 10);
        System.out.println(r.write());
        if (!(visor.hasObstacles(15, 15))) {
            r.move(15, 15);
        }
        System.out.println(r.write());
    }
}
