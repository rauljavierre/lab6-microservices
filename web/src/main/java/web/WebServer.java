package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Accounts web-server. Works as a microservice client, fetching data from the
 * Account-Service. Uses the Discovery Server (Eureka) to find the microservice.
 *
 * @author Paul Chapman
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class WebServer {

  /**
   * Run the application using Spring Boot and an embedded servlet engine.
   *
   * @param args Program arguments - ignored.
   */
  public static void main(String[] args) {
    SpringApplication.run(WebServer.class, args);
  }


}
