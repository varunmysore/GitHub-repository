package practice;

public class m1 implements I1,I2,I3{
public void test1(){
	System.out.println("from test1");
}

//public void test2() {
//	System.out.println("from test2");
//	
//}
//
//public void test3() {
//	System.out.println("from test3");
//	
//}
public static void main(String[] args) {
   m1 ob = new m1();
   ob.test1();
}
}
