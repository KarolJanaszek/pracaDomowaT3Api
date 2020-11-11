package pl.bykowski.pdt3api.model;

import org.springframework.hateoas.ResourceSupport;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car extends ResourceSupport {
    private long id;

    @NotNull
    @Size(min = 3)
    private String mark;

    @NotNull
    @Size(min = 3)
    private String model;

    @NotNull
    private Color color;

    private static long counter = 1;

    public Car() {
        this.id = counter++;
    }

    public Car(String mark, String model, Color color) {
        this.id = counter++;
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getCarId() {
        return id;
    }
}
