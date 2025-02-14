import java.lang.Math;

class Punto {
    private double x;
    private double y;
    private double r;
    private double theta;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        this.r = Math.sqrt(this.x * this.x + this.y * this.y);
        this.theta = Math.atan2(this.y, this.x);
    }

    public double[] coord_cartesianas() {
        return new double[]{this.x, this.y};
    }

    public double[] coord_polares() {
        return new double[]{this.r, this.theta};
    }

    @Override
    public String toString() {
        return String.format("Punto Cartesianas: (%.2f, %.2f), Polares: (%.2f, %.2f)", 
                             this.x, this.y, this.r, this.theta);
    }

    public static void main(String[] args) {
        Punto r1 = new Punto(2, 3);
        double[] cartesianas = r1.coord_cartesianas();
        System.out.printf("Coordenadas Cartesianas = (%.2f, %.2f)%n", cartesianas[0], cartesianas[1]);
        double[] polares = r1.coord_polares();
        System.out.printf("Coordenadas Polares = (%.2f, %.2f)%n", polares[0], polares[1]);
        System.out.println(r1);
    }
}