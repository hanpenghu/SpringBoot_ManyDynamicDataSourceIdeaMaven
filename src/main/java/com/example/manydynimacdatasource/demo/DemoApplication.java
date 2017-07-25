package com.example.manydynimacdatasource.demo;

import com.example.manydynimacdatasource.demo.component.DataSourceConfig.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
//下面一个注解是扫描接口完成dao层注入
@MapperScan("com.example.manydynimacdatasource.demo.dao")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
