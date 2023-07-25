package parallel;

import org.testng.annotations.Test;

public class RerunCase {

    @Test
    public void test1(){

        System.out.println("This is test 1");
    }

    @Test
    public void test2(){

        System.out.println("This is test 2");
        int i = 1/0;
    }

    @Test
    public void test3(){

        System.out.println("This is test 3");
    }
}
