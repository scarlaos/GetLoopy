public class PartB
{
    public static void main(String[] args)
    {
        final int ROW = 5;
        final int COL = 5;

        for(int row= 0; row < ROW; row++) // task 7
        {
            for(int col = 0; col < COL; col++)
            {
                System.out.printf("* ");
            }
            System.out.println(" ");
        }

        System.out.println("\n\n\n\n\n");

        for(int row = 0; row < ROW; row++) // task 5
        {
            for(int col=0; col<= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("\n\n\n\n\n");

        for(int row = 0; row < ROW; row++) // task 6
        {
            for(int col = 5; row < col; col--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
