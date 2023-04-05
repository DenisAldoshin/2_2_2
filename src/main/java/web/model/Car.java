package web.model;

public class Car {

    private String model;
    private int series;

    private int cost;

    public Car (){}

    public Car( String model, int series, int cost) {
        this.model = model;
        this.series = series;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return model + " " + series + " " + cost;
    }
}
