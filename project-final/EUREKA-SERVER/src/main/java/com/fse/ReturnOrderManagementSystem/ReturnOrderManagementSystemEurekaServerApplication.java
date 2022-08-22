package com.fse.ReturnOrderManagementSystem;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.netflix.appinfo.AmazonInfo;

@SpringBootApplication
@EnableEurekaServer
public class ReturnOrderManagementSystemEurekaServerApplication {
	@Bean
@Profile("!default")
public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
  EurekaInstanceConfigBean bean = new EurekaInstanceConfigBean(inetUtils);
  AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
  bean.setDataCenterInfo(info);
  return bean;
}

	public static void main(String[] args) {
		SpringApplication.run(ReturnOrderManagementSystemEurekaServerApplication.class, args);
	}

}
