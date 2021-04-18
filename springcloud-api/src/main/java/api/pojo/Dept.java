package api.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Description 分布式实体类务必实现序列化
 * @Author Oliver
 * @Date 2021/4/18 21:42
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {
    private Long deptNo;
    private String deptName;
    //记录数据库来源，分布式一个可以使用多个数据库
    private String dbSource;

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
