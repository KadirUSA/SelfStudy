package Youtube_Engin_Demirog_Inheritance;

public class InheritanceDemo1 {
    public static void main(String[] args) {
        AgricultureCreditManager1 agricultureCreditManager1 = new AgricultureCreditManager1();
        TeacherCreditManager1 teacherCreditManager1 = new TeacherCreditManager1();
        ArmyCreditManager1 armyCreditManager1 = new ArmyCreditManager1();

        CreditUI1 creditUI1 = new CreditUI1();

        creditUI1.calculateCredit(teacherCreditManager1); // creditUI1.calculateCredit(teacherCreditManager1); ile creditUI1.calculateCredit(new TeacherCreditManager1); ayni sey
        creditUI1.calculateCredit(agricultureCreditManager1);
        creditUI1.calculateCredit(armyCreditManager1);




        /*teacherCreditManager1.calculate();
        agricultureCreditManager1.calculate();
        agricultureCreditManager1.accepted();*/

















    }

}
