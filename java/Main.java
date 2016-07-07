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
        r = new Rover(Direction.WEST, 10, 10);
        System.out.println(r.write());
        try {
        BufferedReader in = new BufferedReader(new
            InputStreamReader(System.in));
            String s = in.readLine();
            
            if (s.startsWith("MoveTo")) {
                StringTokenizer st = new StringTokenizer(s);
                String ss = st.nextToken();
                ss = st.nextToken();
                int _x = Integer.parseInt(ss);
                ss = st.nextToken();
                int _y = Integer.parseInt(ss);
                r.move(_x, _y);
            } else {
                if (s.startsWith("Turn")) {
                    StringTokenizer st = new StringTokenizer(s);
                    String ss = st.nextToken();
                    ss = st.nextToken();
                    Direction _d = Direction.valueOf(ss);
                    r.turnTo(_d);
                }
              }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(r.write());
    }    
}
