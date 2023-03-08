/**
 * 
 * this is a test class for validate() method;
 */
public class HumanTest {
    public void check(Object obj) throws Exception{
        if(!(obj instanceof Human)) throw new Exception();
        Human human = (Human)obj;
        if(human.getAge()>120){
            throw new Exception("TOO OLD");
        }
        if(human.getHeight()>350){
            throw new Exception("TOO HIGH");
        }
    }
}
