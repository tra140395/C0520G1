package B3.Lop_va_doi_tuong.Vi_du;

public class tinh_chu_vi_dien_tich {
    public static void main(String[] ars) {
    Hello circle1 = new Hello();
    System.out.println("The area of circle is "+ circle1.radius + " is " + circle1.getArea());
    Hello circle2 = new Hello(25);
    System.out.println("The area of circle is " + circle2.radius + " is " + circle2.getArea());
    Hello circle3 = new Hello(125);
    System.out.println("The area of circle is " + circle3.radius + " is " + circle3.getArea());
    circle2.radius = 100;
    System.out.println("The area of circle is " + circle2.radius + " is " + circle2.getArea());
}
}