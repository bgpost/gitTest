public final class TestApp {

    protected int prot;

    private int priv;

    private TestApp() {        
    }
    
    public static void main(final String[] args) {

        for (Day day : Day.values()) {
            System.out.println(day.message() + " (" + day.language() +")");
        }
        
        System.out.println("Number of Days: " + Day.values().length);
        
    }

}

// This is the super important comment in the TestApp