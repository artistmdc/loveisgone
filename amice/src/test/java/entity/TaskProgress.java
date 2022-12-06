package entity;

import lombok.Data;

@Data
public class TaskProgress {

    public final static int STATUS = 9;

    /**
     * 0	任务创建成功
     * 1	音频上传完成
     * 2	音频合并完成
     * 3	音频转写中
     * 4	转写结果处理中
     * 5	转写完成
     * 9	转写结果上传完成
     */
    private int status;

    private String desc;
}
