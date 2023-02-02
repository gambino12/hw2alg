import java.util.Random;

public class RandomLap {
    private static final Random rd = new Random();
    private static final double[] priceArray = {100, 200, 300, 400, 500, 600, 700, 800};
    private static final int[] ramArray = {4, 8, 16, 20, 24, 28, 32};

    public static double randomPrice() {
        return priceArray[rd.nextInt(0, priceArray.length)];
    }

    public static int randomRam() {
        return ramArray[rd.nextInt(0, ramArray.length)];
    }

    public static Brand randomBrand() {
        return Brand.getValueByCode(rd.nextInt(1, Brand.values().length + 1));
    }
}
