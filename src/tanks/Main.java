package tanks;

public class Main {


    public static void main(String[] args) {
/*
Make numbers and common name to tanks
*/

        // At (0;0) fuel=100
        Tank justTank = new Tank();
        // At (10;20) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

/*
This fragment of code has to output

The Tank T34-1 is at 100, 0 now.
The Tank T34-2 is at 110, 10 now.
The Tank T34-3 is at 220, 30 now.

*/
    }

}
