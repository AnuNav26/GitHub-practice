package interviewquestions;

public class AnotherTestExceptionClass
{
    public static void main(String[] args) throws CustomExceptionTest
    {
        try {
            getSomeMessage();
        }
        catch (CustomExceptionTest e){
            System.out.println("caught the exception "+e);
        }
    }
    
    public static void getSomeMessage() throws CustomExceptionTest {
        throw new CustomExceptionTest("Exception occurred");
    }
    
}
