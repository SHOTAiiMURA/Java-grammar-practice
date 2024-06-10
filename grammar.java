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
// Switch
        int day = 5;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
        }
        String[] car =  {"Volvo","BMW","Ford","Toyota"};
        car[1] = "Honda";
        System.out.println(car.length);
        System.out.println(car[3]);

        int[][] myNumbers_array = {{1,2,3,4},{5,6,7}};
        System.out.println(myNumbers_array.length);
        for (i = 0; i < car.length; i++){
            System.out.println(car[i]);
        }

    }
}
