import org.junit.Assert;
import org.junit.Test;

public class ShipsCounterTest {

    @Test
    public void countShipWhenAllFieldWithoutShips_Ok() {
        ShipsCounter shipsCounter = new ShipsCounter(new int[][]{
                {0, 0},
                {0, 0}
        });
        int[][] battleField = shipsCounter.getBattleField();
        int expected = shipsCounter.getCountShips(battleField);
        int actual = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countShipWhenHaveShipOnAllField_Ok() {
        ShipsCounter shipsCounter = new ShipsCounter(new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        });
        int[][] battleField = shipsCounter.getBattleField();
        int expected = shipsCounter.getCountShips(battleField);
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countShipOnForBesideShips_Ok() {
        ShipsCounter shipsCounter = new ShipsCounter(new int[][]{
                {1, 1, 1},
                {1, 0, 0},
                {1, 0, 1}
        });
        int[][] battleField = shipsCounter.getBattleField();
        int expected = shipsCounter.getCountShips(battleField);
        int actual = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countShipOnField_Ok() {
        ShipsCounter shipsCounter = new ShipsCounter(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0,},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0,},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 0,},
                {0, 1, 0, 1, 1, 0, 0, 1, 1, 1,},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {1, 1, 1, 1, 0, 1, 1, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0, 0, 1, 0, 0,},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1,}
        });
        int[][] battleField = shipsCounter.getBattleField();
        int expected = shipsCounter.getCountShips(battleField);
        int actual = 9;
        Assert.assertEquals(expected, actual);
    }
}
