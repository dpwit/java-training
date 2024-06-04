public class DirectionFun {
    private enum Direction {
        North,
        South,
        East,
        West

    } // end DayOfWeek enum

    public static void main(String[] args) {
        Direction theDirection = Direction.East;

        switch(theDirection) {
            case North:
            System.out.println("You're travelling North");
            break;
            case South:
                System.out.println("You're travelling South");
                break;
            case East:
                System.out.println("You're travelling East");
                break;
            case West:
                System.out.println("You're travelling West");
                break;
        }


    } // end main method

} // end Direction class
