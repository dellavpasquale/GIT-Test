package gittests.gittest;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String HELLO_WORLD = "Ciao Mondo!";

	public static void main( String[] args )
    {
        System.out.println( getMsg() );
    }

	private static String getMsg() {
		return HELLO_WORLD;
	}
}
