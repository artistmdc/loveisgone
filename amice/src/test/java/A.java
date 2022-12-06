import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author maodianchu
 * @ClassName A
 * @Description
 * @date 2022/3/1 15:38
 */
@Data
@Accessors(chain = true)
public class A extends B implements C{

    private Integer age;
    private String name;

}
