package behavioral_pattern.strategy_pattern;

public class SocialMediaContext {

    ISocialMediaStrategy strategy;

    SocialMediaContext(ISocialMediaStrategy strategy){
        this.strategy= strategy;
    }

    public void connect(String name){
        strategy.connectTo(name);
    }

}
