public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String Name, Eyes, Teeth, Hair;
        Double Age, Height, Weight, Weight_Kilos, Height_cm;

        Name = "Mauricio Guzmán";
        Age = 19.0;     // not a lie
        Height = 67.0;  // inches
        Weight = 135.0; // lbs
        Height_cm= Height*2.54; 
        Weight_Kilos=Weight/2.2046;
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height + " inches tall." );
        System.out.println( "He's " + Weight + " pounds heavy." );
        System.out.println( "I am " + Math.round(Weight_Kilos) + " kilograms heavy." );
        System.out.println( "I am " + Height_cm + " cm tall." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
            + " I get " + (Age + Height + Weight) + "." );
    }
}