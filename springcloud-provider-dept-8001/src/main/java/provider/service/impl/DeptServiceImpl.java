package provider.service.impl;

import api.pojo.Dept;
import org.springframework.stereotype.Service;
import provider.dao.DeptDao;
import provider.service.DeptService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author Oliver
 * @Date 2021/4/18 22:23
 * @Version 1.0
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    DeptDao deptDao;
    @Override
    public boolean add(Dept dept) {
        return deptDao.add(dept);
    }

    @Override
    public Dept queryById(Long deptNo) {
        return deptDao.queryById(deptNo);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
