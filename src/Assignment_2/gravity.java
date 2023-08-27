package Assignment_2;
public class gravity {
    public static void main(String[] args) {

        double Mass_of_Earth = 6 * (Math.pow(10,24));
        double Gravitational_field = 6.67* (Math.pow(10,-11));
        double Radius = 6.38 * (Math.pow(10,6)) ;
        double gravitational_field = (Gravitational_field*Mass_of_Earth)/(Radius*Radius);

        System.out.println("The Gravitational field of Earth is: " + gravitational_field);
    }
}
