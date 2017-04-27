package cl.ubb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
	
	Game game;
	int result;

	@Before
	public void setUp(){
		game = new Game();
	}

	@Test
	public void GetInAllFramesScoreZeroShouldBeZero() { //obtener en todos los frames una puntuación de cero 
		for (int i =0;i<20; i++) {   // Se utiliza un for para contar los 20 frames del bowling
			game.roll(0);
		}
		assertEquals(0,game.score());
	}

}
