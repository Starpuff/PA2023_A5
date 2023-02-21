
public class Main {
    public static void main(String args[]) {
        Main lab1 = new Main();
        lab1.compulsory();
    }
    void compulsory()
    {
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
    }
    void homework()
    {
        //Do stuff
    }
    void bonus()
    {
        //Do stuff
    }
}