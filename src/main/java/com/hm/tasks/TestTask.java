package com.hm.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 * @author 004
 *
 */
@Component
public class TestTask {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	// 定义每过3秒执行任务
    //@Scheduled(fixedRate = 3000)
	//在线表达式生成器 ：  http://cron.qqe2.com/
	//@Scheduled(cron = "4-40 * * * * ?")//每分钟中从    第4秒开始到40秒  期间每秒执行一次
	//@Scheduled(cron = "10/5 * * * * ? ")//每分钟中从     第10秒开始每5秒执行一次
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
