import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"pretty", "beautiful", "gorgeous", "lovely", "nice", "mean", "rude", "big", "bad", "bitter"};
        Random random = new Random();
        int index = random.nextInt(adjectives.length);
        System.out.print(adjectives[index]);



        String[] nouns = {"table", "chair", "pen", "window", "chair", "team", "coffee", "cups", "desk", "building"};
        System.out.print("-" + nouns[index]);


    }

}
