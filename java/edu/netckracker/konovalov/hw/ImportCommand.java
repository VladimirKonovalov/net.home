/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.netckracker.konovalov.hw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vlladimir
 */
public class ImportCommand implements RoverCommand {

    String fileName;

    public ImportCommand(String str) {
        fileName = str;
    }

    @Override
    public void execute(Rover rov) {
        //rov.executeProgramFile(fileName);
        RoverCommand rc = new ImportCommand(fileName);
        try {
            FileReader f = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(f);
            System.out.println("file " + fileName);
            while (rc != null) {
                String s;
                rc = null;
                boolean flagmove = false;
                boolean flagturn = false;
                boolean flagin = false;
                s = reader.readLine();
                if (s == null) {
                    return;
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
                            rc.execute(rov);
                        }
                        if (flagmove) {
                            int length = Integer.parseInt(ss);
                            ss = str.nextToken();
                            int width = Integer.parseInt(ss);
                            rc = new MoveCommand(length, width);
                            rc.execute(rov);

                        }
                        if (flagturn) {
                            rc = new TurnCommand(ss);
                            rc.execute(rov);

                        }

                    } catch (NumberFormatException err) {
                        System.out.println("error" + err);
                    }

                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException n) {
            Logger.getLogger(Rover.class.getName()).log(Level.SEVERE, null, n);
        }
    }

}
