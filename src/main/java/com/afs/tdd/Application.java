package com.afs.tdd;

public class Application {

    private RoverStatus roverStatus;

    public Application(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if (command.equals("M")) {
            move();
        } else if (command.equals("L")) {
            turnLeft();
        } else if (command.equals("R")) {
            turnRight();
        }
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
        } else if (direction.equals("W")) {
            roverStatus = new RoverStatus(locationX - 1, locationY, direction);
        }

    }

    private void turnLeft() {
        final String direction = roverStatus.getDirection();
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        String newDirection = direction;
        if (direction.equals("N")) {
            newDirection = "W";
        } else if (direction.equals("S")) {
            newDirection = "E";
        } else if (direction.equals("E")) {
            newDirection = "N";
        } else if (direction.equals("W")) {
            newDirection = "S";
        }

        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private void turnRight() {
        final String direction = roverStatus.getDirection();
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        String newDirection = direction;
        if (direction.equals("N")) {
            newDirection = "E";
        } else if (direction.equals("S")) {
            newDirection = "W";
        } else if (direction.equals("E")) {
            newDirection = "S";
        } else if (direction.equals("W")) {
            newDirection = "N";
        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }


}
