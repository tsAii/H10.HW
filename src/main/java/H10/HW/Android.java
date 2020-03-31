package H10.HW;

public class Android extends Human implements Chargeable {
    int powerlevel;

    public Android(String name) {
        super(name);
    }

    public int charge(int amount) {
        if (powerlevel > 9000) {
            //throw new RuntimeException("Powerlevel over 9000!");
        }
        return powerlevel += amount;
    }

    String greet() {
        return "I'm only half human, but human still...My powerlevel is over 2000.";
    }

}
