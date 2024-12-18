
/**
 * idk rounds.
 *
 * @author Gavin Hewitt
 * @version 03/26/2021
 */
public class Round
{
    public static double round(double x)
    {
        double rounded;
        rounded = (int)(x * 100 + 0.5) / 100.0;
        return rounded;
    }
}
