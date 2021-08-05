package com.afs.tdd;

public class Application {

    private RoverStatus roverStatus;

    public Application(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if (command.equals("M")) {
            move();
        } else
            return;
    }

    private void move() {
        final String direction = roverStatus.getDirection();
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        if (direction.equals("N")) {
            roverStatus = new RoverStatus(locationX, locationY + 1, direction);
        } else if (direction.equals("S")) {
            roverStatus = new RoverStatus(locationX, locationY - 1, direction);
        } else if (direction.equals("E")) {
            roverStatus = new RoverStatus(locationX + 1, locationY, direction);
        } else
            return;

    }


    public RoverStatus getRoverStatus() {
        return roverStatus;
    }


}
