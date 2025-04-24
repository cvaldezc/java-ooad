public class DogDoorSimulator {
    
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outsise...");
        remote.pressButton();

        System.out.println("Fido has gone outside...");

        System.out.println("Fido's all done...");

        System.out.println("Fido's back inside...");
    }
}
