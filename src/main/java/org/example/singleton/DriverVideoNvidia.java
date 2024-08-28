package org.example.singleton;

public class DriverVideoNvidia {
    private static DriverVideoNvidia instance;
    private static Color[][] monitorImage;
    private DriverVideoNvidia() {

    }

    public static DriverVideoNvidia getInstance() {
        if(instance == null) {
            instance = new DriverVideoNvidia();
        }
        // detecta monitor
        // 5x5
        monitorImage = new Color[5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; i < 5; i++) {
                monitorImage[i][j] = Color.emptyColor();
            }
        }
        return instance;
    }

    public void draw(Color[][] colors) {
        for(int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j] + ",");
                if(colors[i].length - 1 == j) {
                    System.out.println();
                }
            }
        }
    }

    public Color[][] getEmptyFrame() {
        Color[][] emptyImage = new Color[5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; i < 5; i++) {
                emptyImage[i][j] = Color.emptyColor();
            }
        }
        return emptyImage;
    }
}
