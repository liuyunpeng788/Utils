/**
 * @author: liumch
 * @create: 2019/6/24 18:04
 **/

public class TestStructor {
    private int i;
//
//    public TestStructor(){
//        System.out.println("default");
//    }
    public TestStructor(int i){
        this.i = i;
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        TestStructor a = new TestStructor(1);
        System.out.println(a.i);
    }
}
