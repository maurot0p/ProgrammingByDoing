public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;      //int es el variable type, todos son numeros enteros(integers) cars,drivers,passengers... son variables que se usan para poder usar nombres y no code
        double space_in_a_car, carpool_capacity, average_passengers_per_car; //lo mimo pero de type double(decimales)

        cars = 100;   //Asignandole un valor a la variable, asi cuando haga las mats puedo decir cars + tal vaina
        space_in_a_car = 4.0;  
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}