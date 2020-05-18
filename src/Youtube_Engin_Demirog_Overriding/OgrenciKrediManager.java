package Youtube_Engin_Demirog_Overriding;

public class OgrenciKrediManager  extends  BaseKrediManager{

    public double hesapla(double tutar) { // We did overriding on hesapla method for OgrenciKrediManager class.
        return tutar * 1.05;}

        // each methods in java are overridable if you don't say anything else
}
