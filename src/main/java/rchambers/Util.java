package rchambers;

/**
 * Don't take this class too seriously. I added a regular JUnit test
 * because the pom is set up to run regular and integration tests differently.
 * @author rchambers
 */
public class Util {
	public boolean returnTrueIfNull(Object o) {
		return o == null;
	}
}