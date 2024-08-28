package org.example;

import org.example.singleton.Color;
import org.example.singleton.DriverVideoNvidia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DriverVideoNvidia nvidia = DriverVideoNvidia.getInstance();
        Color[][] nextFrame = nvidia.getEmptyFrame();

        // pintar o frame
        for(int i = 0; i < nextFrame.length; i++) {
            for(int j = 0; j < nextFrame[i].length; j++) {
                nextFrame[i][j] =  Color.ramdomColor();
            }
        }

        nvidia.draw(nextFrame);
    }
}