package Day1;

import org.testng.annotations.Test;

public class Day1CodingEx {

    @Test

    public void test001 () {
        System.out.println("Hello, World!");

    }

    @Test
    public void test002() {
        String helloText = "Hello, World!";

        System.out.println(helloText);
    }

    @Test
    public void test003() {
        String s1 = new String("Who let the dogs out?");
        String s2 = "Who who who who!";

        System.out.println(s1 + " plus " + s2);
    }

    @Test
    public void test004() {
        int num = 10;
        String s = "I have " + num + " cookies";

        System.out.println(s);
    }

    @Test
    public void test005() {
        boolean b;
        boolean toBe = false;
        b = toBe || !toBe;

        if (b) {
            System.out.println(toBe);
        }

    }

    @Test
    public void test006() {
        boolean isElementVisible = false;

        if(isElementVisible == true) {
            System.out.println("click on the element");
        } else {
            System.out.println("element is NOT visible");
        }
    }

    @Test
    public void test007() {
        int a = 5;
        boolean b = a == 4;

        if (b) {
            System.out.println("It's true!");
        }

    }

    @Test
    public void test008() {
        boolean elementAisVisible = true;
        boolean elementBisVisible = false;


        if(elementAisVisible && elementBisVisible) {
            System.out.println("click somewhere");
        } else {
            System.out.println("elementAisVisible:"  + elementAisVisible + " " + "elementBisVisible:" + elementBisVisible);

        }
    }

    @Test
    public void test009() {
        int a = 4;
        int result = a == 4 ? 1 : 8;

        // result will be 1
        // this is equivalent to
        //int result;

        if (a == 4) {
            result = 1;
        } else {
            result = 8;
        }

    }

    @Test
    public void test010() {
        int[] arr;
        arr = new int[10];

        arr[0] = 4;
        arr[1]= arr[0] + 5;
        if(arr[1] == 1) {
            System.out.println("equal to 1");
        } else {
            System.out.println("not equal to 1");
        }

    }

    @Test
    public void test011() {
        int[] arr = {1, 2, 3, 4, 5};


        if(arr[3] == 3) {
            System.out.println("equal to 3");
        } else {
            System.out.println("not equal to 3");
        }

        System.out.println(arr);
    }

    @Test
    public void test012() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test013() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for(int eachElement : arr){
            System.out.println(eachElement);
        }
    }

    @Test
    public void test014() {

        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527};

        for (int i = 0; i < numbers.length; i++) {
            int el = numbers [i];

            if (el == 237) {
                break;
            }


            if (el % 2 == 0) {
                System.out.println(el);

            }
        }


    }
}
