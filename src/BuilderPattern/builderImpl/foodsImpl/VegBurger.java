package BuilderPattern.builderImpl.foodsImpl;

import BuilderPattern.builder.foodsBuilder.Burger;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 22.0f;
    }
}
