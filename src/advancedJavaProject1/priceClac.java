package advancedJavaProject1;

public interface priceClac {
    public static int calcPrice(int carOutTimePrice) {
        if (carOutTimePrice == 5) {
            return 5;
        }
        else if (carOutTimePrice == 15) {
            return 15;
        }

        else {
            carOutTimePrice = carOutTimePrice + 5;
            return carOutTimePrice;
        }

    }
}
