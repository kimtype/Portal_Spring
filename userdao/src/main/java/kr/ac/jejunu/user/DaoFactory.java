package kr.ac.jejunu.user;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean /*스프링이 userDao를 new하는 오브젝트 instance*/
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }
    @Bean
    public ConnectionMaker connectionMaker(){
        return new JeJuConnectionMaker();
    }
}
