package AutowieredTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectTest {
    private String str;
    private int num;
    @Autowired
    A a;

    public InjectTest() {
    }
    @Autowired(required = false)//так как Bean num закоментирован, то Spring не находит эту зависимость
    public InjectTest(int num) {
        this.num = num;
    }
    @Autowired(required = false)
    public InjectTest(int num, String str){
        this.num = num;
        this.str = str;
    }
    @Autowired
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString(){
        return "str = " + str
                + "; num = " + num
                + " "+a;
    }
}
