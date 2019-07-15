public class Hangar {
    public static void main(String[] args) {
        
        Car clio = new Car("Clio", 0);
        Boat titanic = new Boat("Titanic", 0);
        System.out.println("Je suis " + clio.getBrand() + " et je fais "+ clio.doStuff());
        System.out.println("Je suis " + titanic.getBrand() + " et je fais "+ titanic.doStuff());
    }
}