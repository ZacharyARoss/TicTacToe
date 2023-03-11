package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    public static Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public boolean diagonalWin(char input){
    return  ((input == matrix[0][0] && input == matrix[1][1] && input == matrix[2][2])
            || (input == matrix[2][0] && input == matrix[1][1] && input == matrix[0][2]));
    }

    public boolean horizontalWin(char input){
        return  ((input == matrix[0][0] && input == matrix[0][1] && input == matrix[0][2])
                || (input == matrix[1][0] && input == matrix[1][1] && input == matrix[1][2])
                || (input == matrix[2][0] && input == matrix[2][1] && input == matrix[2][2]));
    }

    public boolean verticalWin(char input){
        return  ((input == matrix[0][0] && input == matrix[1][0] && input == matrix[2][0])
                || (input == matrix[0][1] && input == matrix[1][1] && input == matrix[2][1])
                || (input == matrix[0][2] && input == matrix[1][2] && input == matrix[2][2]));
    }
}
