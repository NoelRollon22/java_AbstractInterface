package Abstact_Interface;

public class Vehicles implements Transportation {
    @Override
    public void vehicle(int money) {
        if(money == 500){
            System.out.println("Driving a Car");
        } else if (money == 300) {
            System.out.println("Riding a bus");
        }
        else if (money == 400){
            System.out.println("Riding a train");
        } else if (money == 1000) {
            System.out.println("Riding a plane");
        }
        else{
            System.out.println("Choose 300, 400, 500, and 1000");
        }
    }
}
