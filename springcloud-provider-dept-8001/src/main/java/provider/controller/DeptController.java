package provider.controller;

import api.pojo.Dept;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

    @Resource
    private DiscoveryClient client;

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
        System.out.println("im in 8001");
        List<Dept> depts = deptService.queryAll();
        return depts;
    }

    // 需要启动类配置@EnableDiscoveryClient
    @GetMapping(value = "/discovery")
    public Object discovery(){
        //获取微服务的列表
        List<String> services = client.getServices();
        System.out.println("services = " + services);

        //得到一个具体的微服务信息
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances){
            System.out.println("instance.getHost() = " + instance.getHost());
            System.out.println("instance.getPort() = " + instance.getPort());
            System.out.println("instance.getServiceId() = " + instance.getServiceId());
            System.out.println("instance.getUri() = " + instance.getUri());
        }
        return this.client;
    }
}
