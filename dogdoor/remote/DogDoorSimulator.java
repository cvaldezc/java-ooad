import java.util.concurrent.TimeUnit;

public class DogDoorSimulator {
    
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outsise...");
        remote.pressButton();

        System.out.println("Fido has gone outside...");

        System.out.println("Fido's all done...");

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("... but he's stuck outside!");
        System.out.println("Fido's starts barking ...");
        System.out.println("... Gina grabs the remote control.");
        remote.pressButton();

        System.out.println("Fido's back inside...");
    }
}
