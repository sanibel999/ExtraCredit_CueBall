// Denise Derderian
// Extra Credit - Cue Ball


public class CueBall1
{
   public static void main (String [] args)
   {
      String [][] CueBall;
      int row1 = -1;
      int row2 = 6;
      int column1;
      int column2;

      CueBall = new String [6][6];
      


      for (int i=0; i<6; i++)
         {   
            for (int j=0; j<6; j++)
            {
            CueBall [i][j]= "  ";
            }
      }
      
      
      for (int x=1; x<=3; x++)
         {
         row1++;
         row2--;
         
         switch (x)
         {
         
         case 1:
            {
            column1=0;
            column2=5;
            CueBall [row1][column1] = "O ";
            CueBall [row1][column2] = "O ";
            CueBall [row2][column1] = "O ";
            CueBall [row2][column2] = "O ";         
            break;
            }
         
         case 2:
            {
            column1=2;
            column2=3;           
            CueBall [row1][column1] = "O ";
            CueBall [row1][column2] = "O ";
            CueBall [row2][column1] = "O ";
            CueBall [row2][column2] = "O "; 
              
            break;
            }
         
        case 3:
            {
            column1=1;
            column2=4;
            CueBall [row1][column1] = "O ";
            CueBall [row1][column2] = "O ";
            CueBall [row2][column1] = "O ";
            CueBall [row2][column2] = "O ";   
            
            break;
            }
         }
         }

           
      for (int a= 0; a<=5; a++)
         {
            for (int b=0; b<=5;b++)
            {
            System.out.print (CueBall[a][b]);
            }
         System.out.println(""); 
        }  

     

   }
}