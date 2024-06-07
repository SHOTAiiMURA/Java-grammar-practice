public class grammar {
    public static void main(String[] args) {
        int myNum = 15;
        myNum = 20;
        float myFloat = 5.99f;
        char myletter = 'D';
        boolean myBoolean = true;
        String myText = "Hello World";
        String name = "John";
        System.out.println(myNum);
        System.out.println(name);
        int i;
        for (i = 0; i < 6; i++) ;
        System.out.println(i);
        for (i = 0; i<6; i = i+2)
            System.out.println(i);
        for (i = 0; i<5; i++)
            System.out.println(i);
        for(i=0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        String[] cars = {"Volvo","BMW","BENTS","Toyoya","Honda"};
        System.out.println(cars.length);
        for(String j: cars){
            System.out.println(j);
        }
        int[][] myNumbers = {{1,2,3},{4,5,6},{7,8,9}};


    }
}
