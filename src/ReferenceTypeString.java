import java.util.*;


public class ReferenceTypeString {
    /**
     * The aim of this program is used to represent a template of a game and see
     * who is the winner. This program is also dedicated for showing all winning cases.
     */
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.printf("---------\n"+
                           "| %s %s %s |\n"+
                          "| %s %s %s |\n"+
                          "| %s %s %s |\n"+
                          "---------"
                          ,str.charAt(0),str.charAt(1),str.charAt(2),str.charAt(3),str.charAt(4),str.charAt(5),str.charAt(6),str.charAt(7),str.charAt(8)
                         );
        char [] array = str.toCharArray();

        char [][]multiArray = new char [3][3];
            int index = 0 ;
        for(int i = 0 ;i<3; i++){
            for (int j = 0; j <3 ;j++) {
                multiArray[i][j]=array[index];
                index++;
            }

        }
        System.out.println(CheckThewinner(multiArray));
        

    }
    public static String CheckThewinner(char [][] array){

        /*
         * This method will check the winner.
         * We have to check the equality of rows.
         * We have to check the equality of coloumns.
         * And the same case with the diagonals
         */
        int numX = 0;
        int numO =  0;
        boolean xWins = false;
        boolean Owins = false;
        boolean Empty = false;
        // check rows
        for(int i = 0 ; i<3 ; i++){
            if(array[i][0]==array[i][1]&&array[i][1]==array[i][2]){
                if(array[i][0]=='X')
                xWins = true;
                else if(array[i][0]=='O')
                Owins = true;

            }

        }
        // check coloumns 
        for(int i = 0 ; i<3 ; i++){
            if(array[0][i]==array[1][i]&&array[1][i]==array[2][i]){
                if(array[0][i]=='X')
                xWins=true;
                else if(array[0][i]=='O')
                Owins=true;

            }
            // Check diagonals
            if(array[0][0]==array[1][1]&&array[1][1]==array[2][2]){
                if(array[0][0]=='X')
                xWins = true;
                else if(array[0][0]=='O')
                Owins = true;
            }
        }
        if(array[0][2]==array[1][1]&&array[1][1]==array[2][0]){
            if(array[0][2]=='X')
            xWins = true;
            else if(array[0][2]=='O')
            Owins = true;
        }

            for(int i = 0 ;i<3 ; i++){
                for(int j = 0 ; j<3 ; j++){
                    if(array[i][j]=='X')
                    numX++;
                    else if(array[i][j]=='O')
                    numO++;
                    else
                    Empty = true;
                }

            }
            if(xWins && Owins)
            return "Impossible";
            else if(Math.abs(numO-numX)>1)
            return "Impossible";
            else if(Empty)
            return "Game not finished";
            else if(xWins)
            return "X wins";
            else if(Owins)
            return "O wins";
            else 
            return "Draw";

            

    
}
    }

