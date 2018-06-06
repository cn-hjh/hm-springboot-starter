package com.hm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.hm.pojo.IMoocJSONResult;

/**
 * 统一异常捕获
 * 助手类，抛出异常会被此类捕获
 * @author Administrator
 *
 */
@ControllerAdvice//助手类
public class IMoocExceptionHandler {

	public static final String IMOOC_ERROR_VIEW = "error";

	//捕获web异常
//	@ExceptionHandler(value = Exception.class)
//    public Object errorHandler(HttpServletRequest reqest, 
//    		HttpServletResponse response, Exception e) throws Exception {
//    	
//    	e.printStackTrace();
//    	
//		ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", reqest.getRequestURL());
//        mav.setViewName(IMOOC_ERROR_VIEW);
//        return mav;
//    }
	
	@ExceptionHandler(value = Exception.class)//捕获所有的异常
    public Object errorHandler(HttpServletRequest reqest, 
    		HttpServletResponse response, Exception e) throws Exception {//e : 捕获到的异常
    	
    	e.printStackTrace();
    	
    	if (isAjax(reqest)) {
    		System.out.println("ajax异常");
    		return IMoocJSONResult.errorException(e.getMessage());
    	} else {
    		System.out.println("web异常");
    		ModelAndView mav = new ModelAndView();
            mav.addObject("exception", e);
            mav.addObject("url", reqest.getRequestURL());
            mav.setViewName(IMOOC_ERROR_VIEW);
            return mav;
    	}
    }
	
	/**
	 * 
	 * @Title: IMoocExceptionHandler.java
	 * @Package com.imooc.exception
	 * @Description: 判断是否是ajax请求
	 * Copyright: Copyright (c) 2017
	 * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
	 * 
	 * @author leechenxiang
	 * @date 2017年12月3日 下午1:40:39
	 * @version V1.0
	 */
	public static boolean isAjax(HttpServletRequest httpRequest){
		System.out.println("是不是ajax异常");
		return  (httpRequest.getHeader("X-Requested-With") != null  &&
					 "XMLHttpRequest".equals( httpRequest.getHeader("X-Requested-With").toString()) );
	}
}
