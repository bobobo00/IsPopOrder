package test;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Auther danni
 * @Date 2019/10/15 20:36]
 * @Version 1.0
 **/

public class Test {
    /* *
        * @Author danni
        * @Description 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
        * @Date 17:29 2019/10/16
        * @Param [pushA, popA]
        * @return boolean
     **/
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length!=popA.length){
            return false;
        }
        List push=new ArrayList();
        int j=0;
        for(int i=0;i<pushA.length;i++){
            if(pushA[i]!=popA[j]){
                push.add(pushA[i]);
            }else{
                j++;
            }
        }
        for(;j<popA.length;j++){
            if((int)push.remove(push.size()-1)!=popA[j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    

    }
}
