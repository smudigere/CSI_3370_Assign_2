public class BeerSong {

    private static int a = 99;

    public static void main(String args[])  {

        Ninety_Nine_Bottles_of_Beer();

    }

    private static void Ninety_Nine_Bottles_of_Beer()  {

        System.out.println(a + " bottles of beer on the wall, " + a + " bottles of beer");
        System.out.println("take one down, pass it around, " + a + " bottles of beer on the wall.");

        --a;

        if (a == 0)
            return;

        Ninety_Nine_Bottles_of_Beer();
    }

}
