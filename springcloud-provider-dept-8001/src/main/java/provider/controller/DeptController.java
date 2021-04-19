package provider.controller;

import api.pojo.Dept;
import org.springframework.web.bind.annotation.*;
import provider.service.DeptService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DeptController
 * @Description 提供restful服务
 * @Author Oliver
 * @Date 2021/4/18 22:25
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Resource
    DeptService deptService;

    @PostMapping(value = "/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @GetMapping(value = "/get/{deptNo}")
    public Dept queryById(@PathVariable("deptNo") Long deptNo){
        return deptService.queryById(deptNo);
    }

    @GetMapping(value = "/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
}
