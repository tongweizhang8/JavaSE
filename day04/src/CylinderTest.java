public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);
        double Volume = cy.findVomule();
        System.out.println("Volume: " + Volume);

        double Area = cy.findArea();
        System.out.println("Area: " + Area);
    }
}
