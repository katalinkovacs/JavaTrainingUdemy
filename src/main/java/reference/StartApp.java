package reference;

/**
 * Created by Zoli on 19/02/2017.
 */
public class StartApp {

    public static void main(String[] args) {

        int a = 10;

        Test t = new Test();

        a = t.changeValue(a);

        System.out.print(a);


    }

}
