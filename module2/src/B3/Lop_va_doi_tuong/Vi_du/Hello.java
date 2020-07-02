package B3.Lop_va_doi_tuong.Vi_du;

public class Hello {
    double radius;
    Hello(){
        this.radius = 1;
    }
    Hello (double newRadius){
        this.radius = newRadius;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
}

