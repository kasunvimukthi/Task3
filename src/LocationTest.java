import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	@Test
	public void testLocationIntInt() {
		Location test = new Location(3,4);
		assertEquals(3,4,test.toString());
	}

	private void assertEquals(int i, int j, String string) {
		// TODO Auto-generated method stub
		
	}

}
