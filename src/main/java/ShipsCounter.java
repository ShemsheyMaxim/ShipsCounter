public class ShipsCounter {
    private static final int[][] ships = {
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0,},
            {0, 1, 0, 0, 0, 0, 0, 1, 0, 0,},
            {0, 1, 0, 1, 1, 0, 0, 0, 0, 0,},
            {0, 1, 0, 1, 1, 0, 0, 1, 1, 1,},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {1, 1, 1, 1, 0, 1, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {1, 1, 0, 0, 0, 0, 0, 1, 0, 0,},
            {1, 1, 0, 0, 0, 0, 0, 0, 0, 1,}
    };

    public static void main(String[] args) {
        int countShips = getCountShips(ships);
        System.out.println("Number ships on battleField = " + countShips);
    }

    private static int getCountShips(int[][] battleField) {
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

    private static boolean isAddedShip(int coordinateY, int coordinateX) {
        boolean isAddedShip = false;
        if (coordinateX > 0 && ships[coordinateY][coordinateX - 1] == 1
                || coordinateY > 0 && ships[coordinateY - 1][coordinateX] == 1) {
            isAddedShip = true;
        }
        return isAddedShip;
    }
}
