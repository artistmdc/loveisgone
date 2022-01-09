package cn.mdc.springframework.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * TODO
 *
 * @author maodc
 * @version 1.0
 * @Description
 * @company
 * @date 2022/1/9 上午9:27
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
