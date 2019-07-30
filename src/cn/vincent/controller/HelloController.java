package cn.vincent.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * 实现Controller接口，默认处理方法是handleRequest
 *
 */
public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello world 被执行");
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "第一个springmvc应用程序");
		mv.setViewName("hello");
		
		return mv;
	}

}
