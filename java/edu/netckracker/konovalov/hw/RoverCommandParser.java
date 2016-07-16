package edu.netckracker.konovalov.hw;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author vlladimir
 */
public class RoverCommandParser {

    private RoverCommand rc;
    private Rover rover;

    public RoverCommandParser(Rover rov) {
        this.rover = rov;
    }

    RoverCommandParser() {

    }

    public RoverCommand readNextCommand(BufferedReader reader) throws IOException {
        String s;
        rc = null;
        boolean flagmove = false;
        boolean flagturn = false;
        boolean flagin = false;
        s = reader.readLine();
        if (s == null) {
            return rc;
        }
        StringTokenizer str = new StringTokenizer(s);

        while (str.hasMoreTokens()) {
            try {
                String ss = str.nextToken();
                flagmove = ss.startsWith("move");
                flagturn = ss.startsWith("turn");
                flagin = ss.startsWith("input");
                ss = str.nextToken();
                if (flagin) {
                    rc = new ImportCommand(ss);
                    rc.execute(rover);
                }
                if (flagmove) {
                    int length = Integer.parseInt(ss);
                    ss = str.nextToken();
                    int width = Integer.parseInt(ss);
                    rc = new MoveCommand(length, width);
                    rc.execute(rover);

                }
                if (flagturn) {
                    rc = new TurnCommand(ss);
                    rc.execute(rover);

                }

            } catch (NumberFormatException err) {
                System.out.println("error" + err);
            }

        }
           
        return rc;

    }

}
