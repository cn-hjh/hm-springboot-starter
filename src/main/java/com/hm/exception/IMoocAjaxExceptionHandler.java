package com.hm.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hm.pojo.IMoocJSONResult;

/**
 * 捕获ajax异常
 * @author Administrator
 *
 */
//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {

	//@ExceptionHandler(value = Exception.class)
	public IMoocJSONResult defaultErrorHandler(HttpServletRequest req, 
			Exception e) throws Exception {

		e.printStackTrace();
		return IMoocJSONResult.errorException(e.getMessage());
	}
}
