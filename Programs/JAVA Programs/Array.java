import java.util.Scanner;
public class Array 
{
    public static void main(String[] args) 
    {
        int k = 0;
        
        int twoD[][] = new int[4][5];    
        for(int i = 0; i < 4;i++)
        {
            for(int j = 0; j < 5; j++)
            {
                twoD[i][j] = k;
                k++;
            }
        }
        for(int i = 0; i < 4;i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.println(twoD[i][j]);
            }
        }
    }
}
