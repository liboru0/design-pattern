package com.liboru.design.pattern.factory.di;

public class Demo {

    /*
        <!-- 配置文件beans.xml -->
        <beans>
           <bean id="rateLimiter" class="com.xxx.RateLimiter">
              <constructor-arg ref="redisCounter"/>
           </bean>

           <bean id="redisCounter" class="com.xxx.redisCounter" scope="singleton" lazy-init="true">
             <constructor-arg type="String" value="127.0.0.1">
             <constructor-arg type="int" value=1234>
           </bean>
        </bean>
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beans.xml");
    }

}
