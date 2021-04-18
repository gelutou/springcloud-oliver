package provider.dao;

import api.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName DeptDao
 * @Description TODO
 * @Author Oliver
 * @Date 2021/4/18 22:10
 * @Version 1.0
 **/
@Mapper
@Repository
public interface DeptDao {

    /**
     * 增加部门，这里的dept通过pom导入的api module
     * @return boolean
     * @date: 2021-04-18 22:11
     * @author Oliver
     **/
    boolean add(Dept dept);

    Dept queryById(Long deptNo);

    List<Dept> queryAll();
}
