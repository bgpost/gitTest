public final class TestApp {

    protected int prot;

    private int priv;

    private TestApp() {        
    }
    
    public static void main(final String[] args) {

        for (Day d : Day.values()) {
            System.out.println(d.message());
        }
    }


}
