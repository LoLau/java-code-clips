package singleton;

/**
 * Created by LG on 2017/3/23.
 */
public class InnerStaticClass {
    private static class Singleton {
        private static final InnerStaticClass instance = new InnerStaticClass();
    }

    private InnerStaticClass() {
    }

    public static InnerStaticClass getInstance() {
        return Singleton.instance;
    }
}
