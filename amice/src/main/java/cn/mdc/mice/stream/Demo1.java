package cn.mdc.mice.stream;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.mdc.mice.bean.Student;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author maodianchu
 * @ClassName Demo1
 * @Description
 * @date 2022/1/6 10:48
 */
public class Demo1 {

    public static void main(String[] args) {
//        Student s1 = new Student("张三", "公司1", "111");
//        Student s2 = new Student("李四", "公司2", "222");
//        Student s3 = new Student("李四", "公司3", "333");
//        List<Student> l1 = Arrays.asList(s1, s2, s3);
//

        File file = new File("C:\\Users\\Administrator\\Downloads\\承诺书.pdf");
        System.out.println(file.getPath());

        Map<String ,Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("1", 9);
        for (int i = 0; i < 10; i++) {
            System.out.println(map.get("1"));
        }

    }

    private static String replaceFileName(String path, String newName) {
        File file = new File("C:\\Users\\Administrator\\Downloads\\承诺书.pdf");
        file.getPath();
        return "result";
    }

}
