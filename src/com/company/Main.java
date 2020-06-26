package com.company;


public class Main {

    public static void main(String[] args) {
	    Robot r1 = new Robot(0,1, "UP");
	    Robot r2 = new Robot(2,4, "DOWN");
	    Robot r3 = new Robot(1,7, "LEFT");
	    SmartRobot sm = new SmartRobot();
	    //sm.moveToXY();

	    r1.stepForward();
	    //r1.x = 100;
        System.out.println(r1.getX() + " " + r1.getY());
        System.out.println(); // функция toString() вызывается неявно
        System.out.println(r2); // функция toString() вызывается неявно
        System.out.println(r3); // функция toString() вызывается неявно

    }
}
