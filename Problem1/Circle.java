
class Circle {
    final double pi = 3.1459;
    double Radius;
    double Area;

    Circle(int Radius) {
        this.Radius = Radius;

    }

    double CalculatedArea() {

        Area = pi * Radius * Radius;
        return Area;

    }

    void Details() {
        System.out.println("radius :" + Radius + " " + "Area of the circle :" + CalculatedArea());

    }

}
