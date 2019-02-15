import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectFourServiceTest {

    @Test
    void addRedToken() {
        /*  public String addRedToken(int columnRed){
        return board[row][columnRed] = "R"; */

        String R = "R";
        ConnectFourService connectFourService = new ConnectFourService();
        assertEquals(R, connectFourService.addRedToken(6));

    }

    @Test
    void addBlackToken() {
        /* public String addBlackToken(int columnBlack){
        return board[row][columnBlack] = "B"; } */

        String B = "B";
        ConnectFourService connectFourService = new ConnectFourService();
        assertEquals(B, connectFourService.addBlackToken(6));

    }

    @Test
    void winner() {
        ConnectFourService connectFourService = new ConnectFourService();
        String[][] Board = new String[6][7];
        for (int q = 0; q < 6; q++) {
            for (int s = 0; s < 7; s++) {
                Board[q][s] = "I";
            }
        }
        Board[3][0] = "B";
        Board[3][1] = "B";
        Board[3][2] = "B";
        Board[3][3] = "B";

        assertEquals(true, connectFourService.Winner(Board));
    }

    @Test
    void testHorizontal() {
        ConnectFourService connectFourService = new ConnectFourService();

        String[][] horizontalTest = new String[6][7];
        for(int q = 0; q < 6; q++){
            for(int s = 0; s < 7; s++){
                horizontalTest[q][s] = "I";
            }
        }
    //by joining the Strings the output is coming as 5 instead of 4
        horizontalTest[3][0] = "R";
        horizontalTest[3][1] = "R";
        horizontalTest[3][2] = "R";
        horizontalTest[3][3] = "R";

        assertEquals(true, connectFourService.testHorizontal(horizontalTest));
    }

    @Test
    void testVertical() {
        ConnectFourService connectFourService = new ConnectFourService();

        String[][] verticalTest = new String[6][7];
        for(int q = 0; q < 6; q++){
            for(int s = 0; s < 7; s++){
                verticalTest[q][s] = "I";
            }
        }
        //by joining the Strings the output is coming as 5 instead of 4
        verticalTest[1][1] = "R";
        verticalTest[2][1] = "R";
        verticalTest[3][1] = "R";
        verticalTest[4][1] = "R";

        assertEquals(true, connectFourService.testHorizontal(verticalTest));
    }
}