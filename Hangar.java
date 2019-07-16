public class Hangar {
    public static void main(String[] args) {
        
        Car clio = new Car("Clio", 0);

        System.out.println("je suis " + clio.getBrand() + " " + "et je fais" + " " + clio.doStuff());

        Boat titanic = new Boat("Titanic", 0);

        System.out.println("je suis " + titanic.getBrand() + " " + "et je fais" + " " + titanic.doStuff());
    }
} 