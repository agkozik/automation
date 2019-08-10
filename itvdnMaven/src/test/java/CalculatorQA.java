import org.junit.*;

public class CalculatorQA {
    private static Arifmetics arifmetics;

    @BeforeClass
    public static void init(){
       arifmetics=new Arifmetics();
        System.out.println("---Test Arifmetics.class started---");
    }
    @AfterClass
    public static void myTestMessage(){
        System.out.println("---Test Arifmetics.class finished---");
    }

    @Test
    public void checkAdd(){
        //Arifmetics arifmetics=new Arifmetics();
        int result = arifmetics.add(1,2);
//        if (result!=3) {
//            Assert.fail("Сложение работает НЕВЕРНО");}
        Assert.assertEquals("Сложение работает НЕВЕРНО",3 ,result);
        //Assert.assertTrue("Result",result==3);
        //Assert.assertNull("Object Not found",arifmetics);
        //Assert.assertNotNull("Object Not found",arifmetics);
        }


    @Test
    public void checkSub(){
        //Arifmetics arifmetics=new Arifmetics();
        int result=arifmetics.sub(2,1);
        //Assert.assertEquals(2,result);
        Assert.assertEquals("Substraction metod error", 1,result );
    }

    @Test
    public void checkMult(){
        int result=arifmetics.multi(5,0);
        Assert.assertEquals("Multiplay method Error", 0,result);
    }

    @Test
    public void checkDivision(){
        double result=arifmetics.devide(10,2);
        Assert.assertEquals("Error",5,result,0.0);
    }

@Test(expected = ArithmeticException.class)//если вернется значение а из метода деления, т.е делили на ноль и вместо ошибки закинули а
    public void testDivisionException(){
        int x=10,y=0;
        if(!(arifmetics.devide(x,y)==x&&y==0)) throw new ArithmeticException();
}

@Ignore
@Test(timeout =100 )
    public void testNElements(){
        for (int i=0;i<1000;i++){
            System.out.println(i);
        }
}


}
