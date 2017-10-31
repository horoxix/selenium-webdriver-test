package seleniumpackage;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by hjohnson on 6/7/2017.
 */
public class JUnitTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Executed before class");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("Executed after class");
    }
    @Before
    public void setUp() throws Exception{
        System.out.println("Executed before");
    }
    @After
    public void tearDown() throws Exception{
        System.out.println("Executed after");
    }
    @Test
    public void testOne(){
        System.out.println("test 1");
    }
    @Test
    public void testTwo(){
        System.out.println("test 2");
    }
}

