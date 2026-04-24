package designpat.bakery;

public class SprinklesDecorator extends Cake{

    private final Cake cake;

    public SprinklesDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return 2+ cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }
}
