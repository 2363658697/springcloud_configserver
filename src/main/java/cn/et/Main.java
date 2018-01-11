package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;



/**
 *所有 spring配置中心的配置文件，都由以下几种格式组成：
 *          1.配置文件是属于哪个应用的（application）
 *          2.配置文件属于哪个阶段（profile） ：开发，测试，上线
 *          3.在git仓库哪个分支下（label）
 *          
 *  访问：http://localhost:8089/jdbc/test
 *          
 * @author Administrator
 *
 */
@EnableConfigServer   //启用分布式控制中心，从远程git仓库读取配置
@SpringBootApplication  //启动注解        
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
