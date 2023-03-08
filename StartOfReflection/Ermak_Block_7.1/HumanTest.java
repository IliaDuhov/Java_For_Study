/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinkoff;

/**
 *
 * @author Ilia_Dukhov
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
