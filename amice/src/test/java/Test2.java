import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.iflytek.msp.lfasr.LfasrClient;
import com.iflytek.msp.lfasr.model.Message;
import com.sun.deploy.util.StringUtils;
import entity.TaskProgress;
import entity.VoiceBack;

import java.util.*;

/**
 * @author maodianchu
 * @ClassName Test2
 * @Description
 * @date 2022/4/2 14:38
 */
public class Test2 {

    private static final String[] MODAL = new String[]{"嗯", "啊", "呃", "呢"};

    public static void main(String[] args) {

        t1();

//        t2();

    }

    private static void t1() {
        LfasrClient lfasrClient = LfasrClient.getInstance("9f34d4e5", "c4794fd7808d745985a64999ad5a5e14", 5, 10, 50, 10000, 30000, null);
        Map<String, String> param = new HashMap<>(16);
        param.put("has_seperate","true");
        param.put("speaker_number","0");

        Message result = lfasrClient.upload("https://testserver.comein.cn/comein/meeting/record/66909a3177e011eb87bf00163e0f1908/teleconference/3011/R10173frk8w4AC7Cz_20200616151656.mp3", param);
        System.out.println(result.getFailed());
        System.out.println(result.getData());
    }

    private static void t2(String taskId) {
        LfasrClient lfasrClient = LfasrClient.getInstance("9f34d4e5", "c4794fd7808d745985a64999ad5a5e14", 5, 10, 50, 10000, 30000, null);
        Message message = lfasrClient.getProgress(taskId);
        Message response = lfasrClient.getResult(taskId);
//        TaskProgress taskStatus = JSON.parseObject(message.getData(), TaskProgress.class);
//        Message response = iflytekExcute(e.getTranId());
        StringBuffer reslutBuffer = new StringBuffer();
        List<VoiceBack> voiceBackList = JSON.parseObject(response.getData(), new TypeReference<List<VoiceBack>>() {
        });
        String speaker = "";
        for (VoiceBack item : voiceBackList) {
            String currentSpeaker = item.getSpeaker();
            String onbest = item.getOnebest();
            //语气词去除
            for (String model : Arrays.asList(MODAL)) {
                onbest = onbest.replace(model, "");
            }
            if (!Objects.equals(currentSpeaker, speaker) && isNotBlank(speaker) && isNotBlank(onbest)) {
                reslutBuffer.append("<br/><br/>");
            }

            if (isNotBlank(onbest)) {
                String best = onbest.replace("。", "。<br/><br/>").replace("？", "？<br/><br/>");
                reslutBuffer.append(best);
                speaker = currentSpeaker;
            }
        }
        String content = reslutBuffer.toString().replace("<br/><br/><br/><br/>", "<br/><br/><br/>");
        System.out.println(content);
    }




    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

    public static boolean isNotBlank(CharSequence cs) {
        return !isBlank(cs);
    }
}
