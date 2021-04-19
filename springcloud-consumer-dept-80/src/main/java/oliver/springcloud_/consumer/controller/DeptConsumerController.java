package oliver.springcloud_.consumer.controller;

import api.pojo.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述
 *
 * @author Oliver
 * @version 1.0
 * @date 2021/04/19 09:50:08
 */
@RestController
@RequestMapping(value = "/consumer/dept")
public class DeptConsumerController {

    //消费者没有service层
    //每个请求都对应一个RestTemplate 有很多方法供我们直接调用，需要注册到spring

    //没有service调用远程服务
    //(url,实体map,Class<T> responseType)
    @Resource
    private RestTemplate restTemplate;//提供多种便捷访问远程http服务的方法，是一个简单的restful服务模板

    private static final String REST_URL_PREFIX = "http://localhost:8001/";

    @RequestMapping(value = "/get/{deptNo}")
    public Dept get(@PathVariable("deptNo") Long deptNo){
        return restTemplate.getForObject(REST_URL_PREFIX+"dept/get/"+deptNo,Dept.class);
    }

    @RequestMapping(value = "/add")
    public Boolean add(@RequestBody Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"list",List.class);
    }
}
