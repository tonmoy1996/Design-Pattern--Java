package behavioral_pattern.strategy_pattern;

public class SocialMediaMainFunction {

    public static void main(String[] args) {
        SocialMediaContext context= new SocialMediaContext(new TwitterStrategy());

        context.connect("Tonmoy");
    }
}
