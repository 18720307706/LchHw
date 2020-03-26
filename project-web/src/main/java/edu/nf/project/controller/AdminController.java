package edu.nf.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Crazy
 * @date 2020/3/25
 */
@RestController
public class AdminController {
    @GetMapping("/admin")
    public  String say(){
        return "您好第一次项目测试 请多多关照 这是我修改之后的代码";
    }
}