package cn.mdc.springframework.io;

import cn.hutool.core.lang.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 不会让外部调用知道过多的细节，只需要关心具体调用结果即可
 *
 * @author maodc
 * @date 2022/1/9 上午10:05
 */
public class DefaultResourceLoader implements ResourceLoader {

    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "Location must not be null");
        if (location.startsWith(CLASSPATH_URL_PERFIX)) {
            return new ClassPathResource(location.substring(CLASSPATH_URL_PERFIX.length()));
        } else {
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e) {
                return new FileSystemResource(location);
            }
        }
    }
}
