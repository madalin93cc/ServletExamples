package JSPHelpers;

/**
 * Created by Colezea on 19/07/2014.
 */
public class Counter {
    private static int count;
    public static synchronized int getCount(){
        return ++count;
    }
}
