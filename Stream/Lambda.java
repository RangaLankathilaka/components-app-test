interface Vehicle{

    void park(int parkId,String parkName);

        }

public class Lambda {

    public static void main(String[] args) {

        Vehicle car;
        car=(parkId,parkName)-> System.out.println("car park "+parkId);
        car.park(78,"test");

        Vehicle van;
        van=(parkId,parkName)-> System.out.println("van park "+parkId);
        van.park(98,"parkName");


        Vehicle bus;
        bus=(parkId,parkName)-> System.out.println("bus park "+parkId+" "+parkName);
        bus.park(45,"parkName");
    }
}
