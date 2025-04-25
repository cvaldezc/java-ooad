import java.util.concurrent.TimeUnit;

public class DogDoorSimulator {
    
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Fido starts barking.");
        recognizer.recognizer("Woof");

        System.out.println("\nFido has gone outside...");

        System.out.println("\nFido's all done...");

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
        }
        System.out.println("... but he's stuck outside!");
        System.out.println("Fido's starts barking ...");
        
        recognizer.recognizer("Woof");

        System.out.println("Fido's back inside...");
    }
}
