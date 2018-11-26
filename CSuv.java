
/*
 * @cond LICENSE
 * ######################################################################################
 * # Creative Commons BY SA                                                             #
 * #                                                                                    #
 * # Authored by J�rg M�ller 2019                                                       #
 * ######################################################################################
 * @endcond
 */

 
 /**
  * Einfache Klasse f�r Auto
  */
public class CSuv extends CAuto {
  // --- definiere Eigenschaft ---

  private boolean m_offroadFahrbar; 

 

  /**
   * Konstruktor
   * @param p_farbe Farbe des Autos
   * @param p_marke Automarke
   * @param p_anzahlGaenge  Anzahl der G�nge
   * @param p_maxGeschwindigkeit H�chstgeschwindigkeit 
   * @param p_offroadFahrbar Allradantrieb? (boolean)
   */
  public CSuv( final String p_farbe, final String p_marke, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_offroadFahrbar )
  {
    // Aufruf des Konstruktur von CAuto
    super( p_farbe, p_marke, p_anzahlGaenge, p_maxGeschwindigkeit );
    m_offroadFahrbar = p_offroadFahrbar;

  }

    /**
     * Getter Methode f�r offroad fahrbar
     * @return der bool Wert der ID
     */
    public boolean isOffroadFahrbar(){
        return m_offroadFahrbar;
    }

    /**
     * Settermethode f�r offroad fahrbar
     * @param 
     */

    public void setOffroadFahrbar(boolean p_offroadFahrbar){
        m_offroadFahrbar = p_offroadFahrbar;
    }   

    @Override
    public String toString(){
        return "CSuv: " + m_marke + " " + m_autoId + " " + m_offroadFahrbar; //das erfordert die Deklaration der Variablen als protected in CAuto!
    }
}