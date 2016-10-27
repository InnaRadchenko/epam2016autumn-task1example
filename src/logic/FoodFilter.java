package logic;

import domain.Vaucher;

public class FoodFilter implements Filter {
    private String food;

    public FoodFilter(String food) {
        this.food = food;
    }

    @Override
    public boolean isSatisfy(Vaucher vaucher) {
        return food.equals(vaucher.getFood());
    }
}
