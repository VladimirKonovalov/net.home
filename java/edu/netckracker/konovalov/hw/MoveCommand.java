package edu.netckracker.konovalov.hw;

/**
 * @author vlladimir
 */
public class MoveCommand implements RoverCommand {

    private Moveable mov;
    private int length;
    private int wigth;

    public MoveCommand(int l, int w) {
        this.length = l;
        this.wigth = w;

    }

    @Override
    public void execute(Rover rov) {
        mov = rov;
        mov.move(length, wigth);

    }

}
