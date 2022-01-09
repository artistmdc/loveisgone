package cn.mdc.springframework.core.io;

/**
 * TODO
 *
 * @author maodc
 * @version 1.0
 * @Description
 * @company
 * @date 2022/1/9 上午10:02
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PERFIX = "classpath:";

    Resource getResource(String location);

}
