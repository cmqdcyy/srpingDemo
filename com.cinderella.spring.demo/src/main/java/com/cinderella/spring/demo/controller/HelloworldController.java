package com.cinderella.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 这是请求的入口
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/welcome")
public class HelloworldController {

	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("output0", "[INFO]controller is start...");
		model.addAttribute("output", "这是一个spring项目搭建的测试例子!");
		model.addAttribute("output1", "[INFO]controller is end.");
		return "hello";
	}
}
