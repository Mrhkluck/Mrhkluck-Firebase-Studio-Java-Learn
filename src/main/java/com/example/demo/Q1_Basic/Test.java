package com.example.demo.Q1_Basic;


public class Test {

    public static void main(String[] args) {
        Car c=new Car("BMW","pink",25);
        c.displayInfo();
        System.out.println();
        c.setColor("green");
        c.setSpeed(70);
        c.displayInfo();

        //c.brand="green"
        //Scanner sv= new Scanner(System.in);
        //String color = sv.nextLine();
        //int speed = sv.nextInt();

    }
}
