package near.lux.dailylog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("near.lux.dailylog.dao.mapper")
public class DailyLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyLogApplication.class, args);
	}
}
