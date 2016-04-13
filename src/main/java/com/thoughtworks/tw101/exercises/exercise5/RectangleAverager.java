package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int sum = 0;
        for (Rectangle rectangle : rectangles) sum += rectangle.area();

        float averageArea = (float) sum / rectangles.length;
        return averageArea;
    }
}
