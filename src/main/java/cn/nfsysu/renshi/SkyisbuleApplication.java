package cn.nfsysu.renshi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("cn.nfsysu.renshi")
public class SkyisbuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkyisbuleApplication.class, args);
	}
}
