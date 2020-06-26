package com.company;

public class Robot {
    Robot(int x, int y, String dir) {
        this.x = x; this.y = y; this.direction = dir;
    }
    public String toString() {
        return "x:"+ x + " y:" + y + "dir:"+ direction;
    }
    private int x, y, pathLength = 0;
    private String direction; // направление взгляда

    public int getX() { return x; }
    public void setDirection(String d) {
        direction = d;
    }

    public String getDirection() {
        return direction;
    }

    public int getY() {
        return y;
    }

    public void stepForward() {
        // доработать метод, чтобы пройденный путь учитывался
        switch (direction) {
            case "UP": y++; break;
            case "DOWN": y--; break;
            case "LEFT": x--; break;
            case "RIGHT": x++; break;
        }
    }
    public void turnLeft() {
        switch (direction) {
            case "UP": direction = "LEFT"; break;
            case "DOWN": direction = "RIGHT"; break;
            case "LEFT": direction = "DOWN"; break;
            case "RIGHT": direction = "UP"; break;
        }
    }

}
