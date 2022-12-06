import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.mdc.mice.bean.Student;
import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author maodianchu
 * @ClassName Test3
 * @Description
 * @date 2022/4/6 10:35
 */
public class Test3 {
    public static void main(String[] args) {
        Map<String, Integer> countMap = MapUtil.newHashMap(200);
        Student s1 = new Student().setFirstWatchTime(1648056615000L).setLastWatchTime(1648056795000L);
        Student s2 = new Student().setFirstWatchTime(1648057275000L).setLastWatchTime(1648057515000L);
        Student s3 = new Student().setFirstWatchTime(1648057395000L).setLastWatchTime(1648057455000L);
        List<Student> list = Arrays.asList(s1, s3, s2);
        List<Student> mergeList = mergeJoinTimeList(list);
        mergeList.forEach(e -> statisticsRealTimeData(e, countMap));
        MapUtil.sort(countMap).forEach((k, v) -> System.out.println(k + ": " + v));
    }

    private static List<Student> mergeJoinTimeList(List<Student> meetingDetails) {
        for (Student e : meetingDetails) {
            if (ObjectUtil.isNull(e.getFirstWatchTime()) || ObjectUtil.isNull(e.getLastWatchTime()) || e.getFirstWatchTime() > e.getLastWatchTime()) {
                meetingDetails.remove(e);
            }
        }
        if (ObjectUtil.isNull(meetingDetails)) {
            return Lists.newArrayList();
        }
        Collections.sort(meetingDetails, Comparator.comparing(Student::getFirstWatchTime));
        List<Student> result = Lists.newArrayList();
        Student entity = CollUtil.getFirst(meetingDetails);
        for (int i = 1;; i++) {
            if (i >= meetingDetails.size()) {
                result.add(entity);
                break;
            }
            Student e = meetingDetails.get(i);
            if (entity.getLastWatchTime() < e.getFirstWatchTime()) {
                result.add(entity);
                entity = e;
            } else if (entity.getLastWatchTime() < e.getLastWatchTime()) {
                entity.setLastWatchTime(e.getLastWatchTime());
            }
        }
        return result;
    }

    private static void statisticsRealTimeData(Student liveJoinerDetail, Map<String, Integer> countMap) {
        Long stime = liveJoinerDetail.getFirstWatchTime();
        Long etime = liveJoinerDetail.getLastWatchTime();
        if (ObjectUtil.isNull(stime) || ObjectUtil.isNull(etime) || stime > etime) {
            return;
        }
        String stimeStr = DateUtil.format(new Date(stime), "HH:mm");
        String etimeStr = DateUtil.format(new Date(etime), "HH:mm");
        int sHour = Integer.parseInt(stimeStr.split(":")[0]);
        int sMin = Integer.parseInt(stimeStr.split(":")[1]);
        int eHour = Integer.parseInt(etimeStr.split(":")[0]);
        int eMin = Integer.parseInt(etimeStr.split(":")[1]);
        for (int i = sHour; i <= eHour; i++) {
            for (int j = 0; j <= 60; j++) {
                if (i == sHour && j == 0) {
                    j = sMin;
                }
                if (i == eHour && j > eMin) {
                    break;
                }
                String timeStr = (i < 10 ? "0" + i : "" + i) + ":" + (j < 10 ? "0" + j : "" + j);
                countMap.put(timeStr, countMap.getOrDefault(timeStr, 0) + 1);
            }
        }
    }
}
