package singleton;

/**
 * Created by LG on 2017/3/23.
 */
public class DoubleCheck {
    private static volatile DoubleCheck instance = null;

    private DoubleCheck(){
    }

    public static DoubleCheck getInstance() {
        if (null == instance) {
            synchronized (DoubleCheck.class) {
                if (null == instance) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
