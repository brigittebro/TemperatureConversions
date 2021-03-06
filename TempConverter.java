
/**
 * TempConverter will convert Fahrenheit temperatures to Celsius and Kelvin temperatures.
 * 
 * @author Brigitte
 * @version 1.0
 */
public class TempConverter
{
//holds the Celsius temperature
private double tempC;
//holds the Fahrenheit temperature
private double tempF;
//holds the Kelvin temperature
private double tempK;


/**
 * Default constructor for TempConverter sets the default
 * value of the tempConverter object to 0.0 degrees
 * Fahrenheit with Celsius and Kelvin equivalents
 */
public TempConverter(){
    this(0.0);
}

/**
 * This constructor for TempConverter sets the Fahrenheit
 * value to the value from tempIn, then calculates
 * equivalent Celsius and Kelvin values using setTempF();
 */
public TempConverter (double tempIn){
    setTempF(tempIn);
}

/**
 * getTempC retrieves the Celsius temperature value
 * 
 * @return a double value containing the Celsius temperature
 */
public double getTempC(){
    return tempC;

}
/**
 * getTempK retrieves the Kelvin temperature value
 * 
 * @return a double value containing the Kelvin temperature
 */
public double getTempK(){
    return tempK;
}
/**
 * The setTempF method sets the Fahrenheit temperature
 * 
 * @param tempIn The Fahrenheit value to store
 */
public void setTempF (double tempIn){
    //set Fahrenheit value
    tempF = tempIn;
    //calculate Celsius temperature
    tempC = (tempF-32.0)*5.0/9.0;
    //calculate Kelvin temperature
    tempK = tempC + 273.15;
}
 
}