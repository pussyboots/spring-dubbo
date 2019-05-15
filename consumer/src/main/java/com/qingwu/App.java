package com.qingwu;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");

        context.start();
        
        while (true){
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            // 获取接口
            ServiceApi serviceApi = (ServiceApi) context.getBean("consumerService");


            // 测试异步调用
            long beginTime = System.currentTimeMillis();

            serviceApi.sendMessage(message);

            long sendEndTime = System.currentTimeMillis();

            String send02 = serviceApi.sendMessage(message);

            long sendEndTime02 = System.currentTimeMillis();

            System.out.println(send02 +
                    "，send执行时间="+(sendEndTime-beginTime)+" , send2执行时间="+(sendEndTime02-beginTime));

        }
    }
}
