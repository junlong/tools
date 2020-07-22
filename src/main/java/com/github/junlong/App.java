package com.github.junlong;

import com.github.junlong.profiler.Profiler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    try {
      Profiler.start();
      Profiler.enter("init spring context");
      ApplicationContext context = new ClassPathXmlApplicationContext(
        "SpringBeans.xml");
      Profiler.release();

      Profiler.enter("get bean");
      Helloworld obj = (Helloworld) context.getBean("helloBean");
      Profiler.release();

      obj.printHello();

    } finally {
      Profiler.release();
      LOGGER.info(String.format("Profiler,%sms,%s", Profiler.getDuration(), Profiler.dump()));
      Profiler.reset();
    }
  }
}
