import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGameTest {
    @Test
    void testInitialScore() {
        TennisGame game = new TennisGame("Alice", "Bob");
        assertEquals("Love-All", game.getScore());
    }

    @Test
    void testDeuce() {
        TennisGame game = new TennisGame("Alice", "Bob");
        game.wonPoint("Alice");
        game.wonPoint("Alice");
        game.wonPoint("Alice");

        game.wonPoint("Bob");
        game.wonPoint("Bob");
        game.wonPoint("Bob");

        assertEquals("Deuce", game.getScore());
    }

    @Test
    void testAdvantage() {
        TennisGame game = new TennisGame("Alice", "Bob");
        for (int i = 0; i < 4; i++) game.wonPoint("Alice");
        for (int i = 0; i < 3; i++) game.wonPoint("Bob");
        assertEquals("Advantage Alice", game.getScore());
    }

    @Test
    void testWin() {
        TennisGame game = new TennisGame("Alice", "Bob");
        for (int i = 0; i < 4; i++) game.wonPoint("Alice");
        for (int i = 0; i < 0; i++) game.wonPoint("Bob");
        assertEquals("Win for Alice", game.getScore());
    }
}
