package CommandPattern;
import static org.junit.Assert.*;

import org.junit.Test;

public class SpacePlaceTest {

	@Test
	public void testSpacePlace() {
		SpacePlace sp = new SpacePlace(3,3);
		assertEquals(4, 4,sp.getTheta());
	}

}
