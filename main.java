
class ticTacToe{

    char [][] board;

    ticTacToe(){
        board = new char[3][3];
        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < board[i].length; j++){
                board[i][j]= ' ';
            }
        }
        
    }


    void displayBoard(){
        System.out.println("-------------");

        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("-------------");

        }


    }


    void enterMove(int row, int col, char move){

        if( (row <=2 && row >=0) && (col <=2 && col >=0) && (move == 'X' || move == 'O') ){
            board[row][col] = move;

        }
        else{
            System.out.println("invalid input");
        }

    }


    boolean isColoumnWin(){

        for(int i = 0; i <=2 ; i++){
            if((board[0][i] !=' ' && board[0][i]==board[1][i]) && (board[1][i] == board[2][i]) ){
                return true;
            }
        }

        return false;
        
    }

    boolean isRowWin(){

        for(int i = 0; i <=2 ; i++){
            if((board[i][0] !=' ' && board[i][0]==board[i][1]) && (board[i][1] == board[i][2]) ){
                return true;
            }
        }

        return false;
        
    }

    boolean isDiagonalWin(){

        if( (board[0][0] !=' ' && board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) || (board[0][2] != ' ' && board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) ){
            return true;
        }
        return false;

    }

}







public class main{
    public static void main(String[] args) {

        ticTacToe t = new ticTacToe();

       
        // t.enterMove(0, 0, 'X'); 
        // t.enterMove(1, 0, 'X'); 
        // t.enterMove(2, 0, 'X'); 
        // t.enterMove(0, 2, 'O'); 
        // t.enterMove(0, 2, 'O'); 
        t.displayBoard();


        System.out.println(t.isColoumnWin());
        System.out.println(t.isRowWin());
        System.out.println(t.isDiagonalWin());

    }
}