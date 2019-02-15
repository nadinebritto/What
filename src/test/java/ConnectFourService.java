public class ConnectFourService {

    public static void main(String[] args){
       /* ConnectFourService connectFourService = new ConnectFourService();
        String[][] mainTest = new String[6][7];
        for(int k = 0; k < 6; k++){
            for(int v = 0; v < 7; v++){
                mainTest[k][v] = "B";
            } }

        System.out.println(connectFourService.testHorizontal(mainTest)); */
    }

    private String[][] board = new String[6][7];
    public int row;

    public String addRedToken(int columnRed){
        return board[row][columnRed] = "R";
    }

    public String addBlackToken(int columnBlack){
        return board[row][columnBlack] = "B";
    }

    public Boolean Winner(String[][] winnerBoard){
        if(testHorizontal(winnerBoard) || testVertical(winnerBoard)){
            return true;
        }else{
            return false;
        }
    }

    public boolean testHorizontal(String[][] boardHorizontal){
        for(int j = 0; j < 4; j++){
                boardHorizontal[0][j] = "R";
            }


        boolean resultHorizontal = true;

        //checking vertical
        String checkingVerticalRed = "RRRRR";
        String checkingVerticalBlack = "BBBBB";

        for(int x = 0; x < 6; x++){
            String testing = String.join(boardHorizontal[x][0], boardHorizontal[x][1], boardHorizontal[x][2], boardHorizontal[x][3]);
            String testing1 = String.join(boardHorizontal[x][1], boardHorizontal[x][2], boardHorizontal[x][3], boardHorizontal[x][4]);
            String testing2 = String.join(boardHorizontal[x][2], boardHorizontal[x][3], boardHorizontal[x][4], boardHorizontal[x][5]);
            if(testing.equalsIgnoreCase(checkingVerticalRed) || testing1.equalsIgnoreCase(checkingVerticalRed) || testing2.equalsIgnoreCase(checkingVerticalRed)){
                //System.out.println("Red wins!");
                return resultHorizontal;
            }else if(testing.equalsIgnoreCase(checkingVerticalBlack) || testing1.equalsIgnoreCase(checkingVerticalBlack) || testing2.equalsIgnoreCase(checkingVerticalBlack)) {
                //System.out.println("Black winds!");
                return resultHorizontal;
            }else {
                resultHorizontal = false;
            }
        }

        return resultHorizontal;
    }

    public boolean testVertical(String[][] boardVertical){
        /*for(int k = 0; k < 6; k++){
            for(int v = 0; v < 7; v++){
                board[k][v] = "I";
            }
        }*/

        boolean resultVertical = true;

        //checking vertical
        String checkingVerticalRed = "RRRRR";
        String checkingVerticalBlack = "BBBBB";

        for(int x = 0; x < 6; x++){
            String testing = String.join(boardVertical[0][x], boardVertical[1][x], boardVertical[2][x], boardVertical[3][x]);
            //System.out.println(boardVertical[0][x] + boardVertical[1][x] + boardVertical[2][x] + boardVertical[3][x]);
            String testing1 = String.join(boardVertical[1][x], boardVertical[2][x], boardVertical[3][x], boardVertical[4][x]);
            String testing2 = String.join(boardVertical[2][x], boardVertical[3][x], boardVertical[4][x], boardVertical[5][x]);
            if(testing.equalsIgnoreCase(checkingVerticalRed) || testing1.equalsIgnoreCase(checkingVerticalRed) || testing2.equalsIgnoreCase(checkingVerticalRed)){
                //System.out.println("Red wins!");
                return resultVertical;
            }else if(testing.equalsIgnoreCase(checkingVerticalBlack) || testing1.equalsIgnoreCase(checkingVerticalBlack) || testing2.equalsIgnoreCase(checkingVerticalBlack)) {
                //System.out.println("Black winds!");
                return resultVertical;
            }else {
                resultVertical = false;
            }
        }

        return resultVertical;
    }


}







// to verify (sum the arrays text to form a string and compare to that string)