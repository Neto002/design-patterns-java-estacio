public class Singleton {
    private static Singleton instance = new Singleton();
    int x;
    String msg;

    private Singleton() {
        this.x = (int) (10 * Math.random());
        this.msg = "Valor: " + String.valueOf(this.x);
        System.out.println(this.msg);
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
