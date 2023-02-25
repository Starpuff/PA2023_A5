
public class Main {
    public static void main(String args[]) {
        Main lab1 = new Main();
        //lab1.compulsory();
        lab1.homework(args);
    }
    void compulsory()
    {
        System.out.println("Compulsory: ");
        System.out.println("Hello world!");
        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        System.out.println("random n: " + n);
        n = n * 3;
        //System.out.println("n*3:" + n);
        n = n + 0b10101;
        n = n + 0xFF;
        n = n * 6;
        /*int m = 10;
        m = m + 0b001;
        System.out.println("m+1:" + m);*/
        /*int m = 10;
        m = m + 0xA;
        System.out.println(m);*/
        System.out.println("processed n: " + n);
        while (n>9)
        {
            int sum = 0;
            int cn = n;
            while (cn!=0)
            {
                sum = sum + cn % 10;
                cn = cn / 10;
            }
            n = sum;
        }
        System.out.println("after the sum n: " + n);
        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);
        System.out.println("\n\n");
    }
    void homework(String args[])
    {
        System.out.println("Homework: ");
        int n;
        try
        {
            n = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("argumentul nu este un numar intreg");
            return;
        }

        if(n<=0)
        {
            System.out.println("argumentul nu este un numar natural nenul");
            return;
        }

        System.out.println("n: " + n);
        int[][] latinSquare = new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++) {
                if( (i+j+1) % n == 0)
                    latinSquare[i][j] = n;
                else
                    latinSquare[i][j] = (i+j+1) % n;
            }
        System.out.println("Rows: ");
        for(int i=0; i<n; i++)
        {
            StringBuilder row = new StringBuilder("");
            for (int j=0; j<n; j++)
                row.append(latinSquare[i][j]);
            System.out.println("row" + i + ": " + row);
        }

        System.out.println("Columns: ");
        for (int j=0 ; j<n; j++)
        {
            StringBuilder column = new StringBuilder("");
            for (int i=0; i<n; i++)
                column.append(latinSquare[i][j]);
            System.out.println("column" + j + ": " + column);
        }
    }
    void bonus()
    {
        //Do stuff
    }
}