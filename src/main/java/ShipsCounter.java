public class ShipsCounter {
    private int[][] battleField;

    public ShipsCounter(int[][] battleField) {
        this.battleField = battleField;
    }

    public int[][] getBattleField() {
        return battleField;
    }

    public int getCountShips(int[][] battleField) {
        int countShips = 0;
        for (int coordinateY = 0; coordinateY < battleField.length; coordinateY++) {
            for (int coordinateX = 0; coordinateX < battleField[coordinateY].length;
                     coordinateX++) {
                int element = battleField[coordinateY][coordinateX];
                if (element == 1) {
                    boolean addedShip = isAddedShip(coordinateY, coordinateX);
                    if (!addedShip) {
                        countShips++;
                    }
                }
            }
        }
        return countShips;
    }

    public boolean isAddedShip(int coordinateY, int coordinateX) {
        boolean isAddedShip = false;
        if (coordinateX > 0 && battleField[coordinateY][coordinateX - 1] == 1
                || coordinateY > 0 && battleField[coordinateY - 1][coordinateX] == 1) {
            isAddedShip = true;
        }
        return isAddedShip;
    }
}
