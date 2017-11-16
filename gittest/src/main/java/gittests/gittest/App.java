package gittests.gittest;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final List<String> MSG = new ArrayList<String>();
    {
    	MSG.add("Ciao!");
    	MSG.add("Ciao Mondo!");
    }

	public static void main( String[] args )
    {
        System.out.println( getMsg() );
    }

	private static String getMsg() {
		return String.valueOf(Math.round(Math.random() * MSG.size()));
	}
}
