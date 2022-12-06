package cn.mdc.mice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author maodianchu
 * @ClassName Student
 * @Description
 * @date 2022/1/6 10:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student {

    private Integer type;

    private String name;

    private String company;

    private String phone;

    private Long firstWatchTime;

    private Long lastWatchTime;
}
