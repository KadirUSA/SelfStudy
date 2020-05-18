package Youtube_Engin_Demirog_Overriding;

public class Main {
    public static void main(String[] args) {
   BaseKrediManager[]  krediManagers = new BaseKrediManager[] // We crated an Array and each KrediManager class is now element for BaseKrediManager Array.
           {new OgretmenKrediManager(), new TarimKrediManager(), new  OgrenciKrediManager()};

   for (BaseKrediManager krediManager: krediManagers) {
       System.out.println(krediManager.hesapla(2000));

   }


   //System.out.println(krediManagers.hesapla(1000));

    /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
    TarimKrediManager tarimKrediManager = new TarimKrediManager();
    ogretmenKrediManager.hesapla(1000);
    System.out.println(ogretmenKrediManager.hesapla(1000));*/






    }
}
