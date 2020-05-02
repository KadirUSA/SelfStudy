package Youtube_Engin_Demirog1;


public class Classes_11 {
    public static void main(String[] args) { // ***note*** CostumerManager.Add();
        // reference type
        CostumerManager_11_2 costumerManager = new CostumerManager_11_2();
        CostumerManager_11_2 costumerManager1 = new CostumerManager_11_2();
        costumerManager = costumerManager1;

        costumerManager.Add();
        costumerManager.Remove();
        System.out.println(costumerManager.Update());

        costumerManager1.Update();
        costumerManager1.Remove();
        costumerManager1.Add();

        // value type
        int num1 = 10;
        int num2 = 20;
        num2 = num1;
        num1 = 30;
        System.out.println(num2);

        int[] numbers1 = new  int[]{1,2,3};
        int[] numbers2 = new int[]{4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);

    }
    }
    class Same{
        public static void main(String[] args) {
            same();
        }
    public static void same(){
        String str1 = "Hello";
        String str2 = "Hello";
        if (str1 == str2)
        {
            System.out.println("Same");
        }
    }
}
