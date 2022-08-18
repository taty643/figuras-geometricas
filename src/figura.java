public abstract class figura {

     private String color;

    public figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public abstract double calcularArea();


}
