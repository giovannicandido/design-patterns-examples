package org.example.singleton;

import java.util.Random;

public class Color {
    private final int red;
    private final int green;
    private final int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public static Color emptyColor() {
        return new Color(0, 0, 0);
    }

    public static Color ramdomColor() {
        Random random = new Random();
        int red = Double.valueOf(random.nextDouble() * 255).intValue();
        int green = Double.valueOf(random.nextDouble() * 255).intValue();
        int blue = Double.valueOf(random.nextDouble() * 255).intValue();
        return new Color(red, green, blue);
    }

    public int getRed() {
        return red;
    }


    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return "%s,%s,%s".formatted(red, green, blue);
    }
}
