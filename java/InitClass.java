import java.util.Map;
import java.util.HashMap;

public class InitClass {
    public static int k = 0;
    public static InitClass t1 = new InitClass("t1");
    public static InitClass t2 = new InitClass("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");
    static {
        print("静态块");
    }
    public InitClass(String string){
        System.out.println((++k) + ":" + string + " i=" + i + " n=" + n);
        ++i;
        ++n;
    }
    {
        print("构造块");
    }
    public static int print(String string){
        System.out.println((++k) + ":" + string + " i=" + i + " n=" + n);
        ++n;
        return ++i;
    }

    public static void main(String[] args) {
        //InitClass test = new InitClass("init");
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(1, 3);
        System.out.println(map);
    }
}
