import static org.junit.Assert.*;

import org.junit.Test;

public class PictureFrameTest {

	@Test
	public void testPictureFrame() {
		PictureFrame pf = new PictureFrame();
		assertEquals(7,8,pf.getPreferredSize());
	}

	private void assertEquals(int i, int j, Object preferredSize) {
		// TODO Auto-generated method stub
		
	}
}
