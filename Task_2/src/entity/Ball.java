package entity;
import util.BallValuesInput;

import java.util.Objects;

public class Ball {

    private Colors color;
    private double weight;
    BallValuesInput ballValuesInput = new BallValuesInput();

    public Ball(){
        this.weight = ballValuesInput.inputWeight();
        this.color = ballValuesInput.inputColor();
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return weight == ball.weight && color == ball.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{color=" + color +
                ", weight=" + weight +
                '}';
    }
}
