package io.pivotal.pal.tracker.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.ComponentScan;

import java.util.TimeZone;

@EnableZipkinStreamServer
@SpringBootApplication
@ComponentScan("io.pivotal.pal.tracker.zipkinserver")
public class App {
	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		SpringApplication.run(App.class, args);
	}
}
