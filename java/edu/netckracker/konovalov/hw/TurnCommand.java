package edu.netckracker.konovalov.hw;

/**
 * @author vlladimir
 */
public class TurnCommand implements RoverCommand {

    private Turnable turn;
    private Direction dir;

    public TurnCommand(String line) {
        switch (line) {
            case "NORTH":
                dir = Direction.NORTH;
                break;
            case "EAST":
                dir = Direction.EAST;
                break;
            case "SOUTH":
                dir = Direction.SOUTH;
                break;
            case "WEST":
                dir = Direction.WEST;
                break;
            default:
                System.out.println("error director");

        }

    }

    @Override
    public void execute(Rover rov) {
        turn = rov;
        turn.turnTo(dir);

    }

}
