package com.company;

public class Robot {
    Robot(int x, int y, String dir) {
        this.x = x; this.y = y; this.direction = dir;
    }

    // строковое представление объекта
    public String toString() {
        return "x:"+ x + " y:" + y + "dir:"+ direction;
    }
    // текущее состояние робота: координаты, пройденный путь, ориентация
    private int x, y, pathLength = 0;
    private String direction; // направление взгляда

    // обращение к состоянию (полям) выполняем через методы
    public int getX() { return x; }

    // задать направление можно явно, но для реального робота это может вызвать ошибку
    public void setDirection(String d) {
        direction = d;
    }

    public String getDirection() {
        return direction;
    }

    public int getY() {
        return y;
    }

    // TODO: Добавить учёт пройденного пути в Robot поле pathLength
    public void stepForward() {
        // доработать метод, чтобы пройденный путь учитывался
        switch (direction) {
            case "UP": y++; break;
            case "DOWN": y--; break;
            case "LEFT": x--; break;
            case "RIGHT": x++; break;
        }
    }
    public void turnRight() {} // TODO: реализовать метод
    public void turnLeft() {
        switch (direction) {
            case "UP": direction = "LEFT"; break;
            case "DOWN": direction = "RIGHT"; break;
            case "LEFT": direction = "DOWN"; break;
            case "RIGHT": direction = "UP"; break;
        }
    }

}
