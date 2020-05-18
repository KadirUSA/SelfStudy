package Youtube_Engin_Demirog_Overriding;

public class BaseKrediManager {

    public double hesapla(double tutar) { // Eger bu method'un OgrenciKreditManager'da oldugu gibi overriding olmasini istemiyorsaniz
        // ve butun classlarin ayni ve sabit bir method almasini istiyorsaniz publicten sonra ***final getirmlisiniz.
        // Neden private degil de final? Cevap: Cunku private derseniz hic bir sinif kullanamaz. Final derseniz degistirilemez ama herkes kullanabirlir.
        // Tipki main mathod gibi

    return tutar * 1.18;
    }
}
