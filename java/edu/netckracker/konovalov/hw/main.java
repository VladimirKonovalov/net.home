package edu.netckracker.konovalov.hw;

/**
 * @author vlladimir
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rover r = new Rover();

        r.getVisor().setGround(new Ground(20, 20));

        r.executeProgramFile("command.txt");

    }

}
