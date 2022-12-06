import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUtil;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.*;

/**
 * @author maodianchu
 * @ClassName Test1
 * @Description
 * @date 2021/12/30 15:54
 */
public class Test1 {

    static class T1 implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 1;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        A a = new A();
        a.setAge(15);
        aa(a);
        System.out.println(a.getAge());
    }


    private static void buildOnlineCount(Integer highestOnlineCount, Integer lowestOnlineCount) {
        highestOnlineCount = 5;
    }

    private static void aa(A a) {
        a.setAge(13);
    }

    public static String calculateWatchTime(Long watchTime) {
        String calculateResult = "0";
        if (watchTime > 0) {
            calculateResult = new BigDecimal(watchTime).divide(new BigDecimal(60), 0, BigDecimal.ROUND_DOWN).toString();
            calculateResult = calculateResult.equals("0") ? "1" : calculateResult;
        }
        return calculateResult;
    }
}
