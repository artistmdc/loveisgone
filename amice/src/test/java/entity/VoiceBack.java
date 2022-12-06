package entity;

import lombok.Data;

@Data
public class VoiceBack {

    /**
     * 句子相对于本音频的起始时间，单位为ms
     */
    private String bg;

    /**
     * 句子相对于本音频的终止时间，单位为ms
     */
    private String ed;

    /**
     * 句子内容
     */
    private String onebest;

    /**
     * 说话人编号，从1开始，未开启说话人分离时speaker都为0
     */
    private String speaker;

}