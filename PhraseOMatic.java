/**
 * PhraseOMatic
 */
public class PhraseOMatic {
    public static void main(String[] args) {

        // Sets of buzzwords to choose from
        String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
                "pervasive", "smart", "six-sigma", "critical-path", "dynamic" };

        String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated" };

        String[] wordListThree = { "process", "tippingpoint", "solution", "architecture", "core-competency", "strategy",
                "mindshare", "portal", "space", "vision", "paradigm", "mission" };

        // Get the length of each set
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Get three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Build the phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Print the phrase
        System.out.println("What we need is a " + phrase);
    }

}