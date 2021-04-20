package provider.service;

import api.pojo.Dept;

import java.util.List;

/**
 * @ClassName DeptService
 * @Description TODO
 * @Author Oliver
 * @Date 2021/4/18 22:22
 * @Version 1.0
 **/
public interface DeptService {

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
