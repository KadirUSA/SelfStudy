package Youtube_Engin_Demirog_Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) { //related to AgricultureCreditManager, TeacherCreditManager, BaseCreditManager and InheritanceDemo Classes
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.Calculate();

        CreditUI creditUI= new CreditUI();
        creditUI.CreditCalculate(new TeacherCreditManager());
        creditUI.CreditCalculate(new AgricultureCreditManager());
        creditUI.CreditCalculate(new ArmyCreditManager());


    }
}
