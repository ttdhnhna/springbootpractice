package com.example.springpractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

//Chạy thất bại hết nhưng có code để tìm hiểu sau.
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    @Scheduled(fixedRate = 2000)//Gửi thông báo sau mỗi 2000ms = 2s
    public void scheduleTaskWithFixedRate() {
        logger.info("Send email to me");
    }
    @Scheduled(fixedDelay = 1000)//Khi tác vụ hoàn thành thì 1h sau sẽ thực hiện gửi lại thông báo
    public void scheduleTaskWithFixedDelay() {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        logger.info("Send email to producers to inform quantity sold items");
    }
    @Scheduled(fixedRate = 2000,initialDelay = 10000)//Gửi thông báo sau 2s thì sẽ bị delay 10s sau đó thì lặp lại.
    public void scheduleTaskWithInitialDelay() {
        logger.info("Send email to producers to inform quantity sold items");
    }
    @Scheduled(cron = "15 * * * *")//Hẹn giờ thông báo ra màn hình 15s mỗi phút
    // giây phút giờ ngày tháng
    public void scheduleTaskWithCronExpression() {
        logger.info("Send email to producers to inform quantity sold items");
    }
}
