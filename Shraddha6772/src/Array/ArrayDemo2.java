package Array;

public class ArrayDemo2
{

    public static void main(String[] args)
    {
        int[][] table = new int[3][3];

        int count = 0;
        for (int row = 0; row < table.length; row++)
        {
            for (int col = 0; col < table[0].length; col++)
            {
                table[row][col] = count;
                count++;
                System.out.print(table[row][col] + " ");
            }
        }
    }
}