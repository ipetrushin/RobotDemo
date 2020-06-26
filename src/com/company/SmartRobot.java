package com.company;

public class SmartRobot extends Robot {

    SmartRobot() {
        super(0, 0, "UP");
    }
    public void moveToXY(int toX, int toY) {
        // использовать вызовы методов getX, getY, getDirection,
        // stepForward, turnLeft, turnRight
        // для перемещения робота из текущей позиции в нужную (toX, toY)
        // пускай робот сообщает, сколько ему пришлось проехать
    }
}
