/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Администратор
 */
public class RoverCommandParser {
    private RoverCommand rc;
    private Rover rover;

    public RoverCommandParser(Rover rov) {
       this.rover=rov;
    }

    RoverCommandParser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public RoverCommand readNextCommand(BufferedReader reader) throws IOException {
        String s;
        rc = null;
        boolean flagmove = false;
        boolean flagturn = false;
        s = reader.readLine();
        if (s==null) {
            return rc;
        }
        StringTokenizer str = new StringTokenizer(s);
        
        while(str.hasMoreTokens()) {
                try{
                    String ss = str.nextToken();
                    flagmove = ss.startsWith("move");
                    flagturn = ss.startsWith("turn");
                    ss = str.nextToken();
                    if (flagmove) {
                        int length = Integer.parseInt(ss);
                        ss = str.nextToken();
                        int width = Integer.parseInt(ss);
                        rc = new MoveCommand(length,width);
                        rc.execute(rover);
                        
                    }
                    if (flagturn) {
                        
                    rc = new TurnCommand(ss);   
                    rc.execute(rover);
                        
                    }
                   
                   
                
                }
                catch(NumberFormatException err) {
                 System.out.println("error"+err );
                }
                
            }
        
        return rc;
        
    }
    
    
}
