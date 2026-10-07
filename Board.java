

//The board object will hold the position

public class Board{

   //Member variables    
   int[][] boardState; 
   
   boolean whiteToMove;
   boolean h8Moved;
   boolean h1Moved;
   boolean a1Moved;
   boolean a8Moved;
   boolean e1Moved;
   boolean e8Moved;

   
   //representation of colors/pieces
   static final int WHITE = 1, BLACK = -1;
   static final int PAWN = 1, KNIGHT = 2, BISHOP = 3, ROOK = 4, QUEEN = 5, KING = 6;
   

   //This function allows us to reset the position for a new analysis or game.
   
   void setup(){
      
      whiteToMove = true;
      h8Moved = false;
      h1Moved = false;
      a1Moved = false;
      a8Moved = false;
      e1Moved = false;
      e8Moved = false;
      
      boardState = new int[8][8];    
      
      int[] backRank = {ROOK, KNIGHT, BISHOP, QUEEN, KING, BISHOP, KNIGHT, ROOK};
      int[] pawnRank = {PAWN, PAWN, PAWN, PAWN, PAWN, PAWN, PAWN, PAWN};
      
      
      //We iterate through the board from a1 to h8
      //This will make it easier to incorporate positions from FEN
      
      for(int i = 0; i < 8; i++){
         boardState[i][0] = backRank[i] * WHITE;
         boardState[i][7] = backRank[i] * BLACK;
      }
      
      for(int i = 0; i < 8; i++){
         boardState[i][1] = pawnRank[i] * WHITE;
         boardState[i][6] = pawnRank[i] * BLACK;
      }
      
      
   }
   
   void print(){
   
   for(int i = 7; i >= 0; i--){
      
      System.out.println("");
      for(int k = 0; k < 8; k++){
         System.out.print(boardState[k][i]);
      
      }}
   
   }
   
}


