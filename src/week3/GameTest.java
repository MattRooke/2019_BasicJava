package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameTest {
    @Test
    void checkSecret() {
        Game game = new Game(1, 10);
        boolean validSecret = game.secret > 0 && game.secret < 11;
        assertTrue(validSecret);
    }

    @Test
    void checkPlayCount() {
        Game game = new Game(1, 10);
        assertEquals(0, game.count);
        assertEquals(0, game.wins);

        game.makeGuess(game.secret); // Check for a win
        assertEquals(1, game.count);
        assertEquals(1, game.wins);

        game.makeGuess(-1); // Check for a loss
        assertEquals(2, game.count);
        assertEquals(1, game.wins);
    }
}
