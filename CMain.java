
/*
 * @cond LICENSE
 * ######################################################################################
 * # Creative Commons BY SA                                                             #
 * #                                                                                    #
 * # Authored by Jörg Müller 2019                                                       #
 * ######################################################################################
 * @endcond
 */


/**
 * Test Mainmethode für hierarchische Typenvererbung
 * demonstriert Vewrwendung von instanceof und Casting bei Klassen mit Vererbung
 */

public class CMain
{
 

    public static void main( String[] p_args )
        {
        CAuto vw = new CSuv("silver", "golf", 5, 200, false);
        CAuto merc = new CAuto("schwarz", "VW", 6, 250);
        IFahrzeug mazda = merc;
        IFahrzeug google;
        google = vw;
        google.schalte(6);
        System.out.println(vw.getGang());
        mazda.schalte(4);
        System.out.println(merc.getGang());
        merc.beschleunige(3);
        System.out.println(merc.m_maxGeschwindigkeit);
        vw.beschleunige(4);
        System.out.println(vw.m_maxGeschwindigkeit);
        merc.bremse(5);
        System.out.println(merc.getBremse());
        

     // nutze diese Methode für die weiteren Teile der Aufgabe
    }
}