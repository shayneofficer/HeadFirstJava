public class BeersOnWall {

    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            // if(beerNum == 1) {
            // word = "bottle";
            // }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.\nPass it around.");
            beerNum--;

            // Move the word change here after the adjustment, otherwise the last iteration
            // is wrong.
            if (beerNum == 1) {
                word = "bottle";
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }

        }
    }
}