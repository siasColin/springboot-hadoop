package cn.net.colin.conf;

import org.apache.hadoop.conf.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Package: com.colin.conf
 * @Author: sxf
 * @Date: 2020-8-23
 * @Description:
 */
@Component
@ConfigurationProperties("hadoop.hdfs")
public class HadoopConfig {
    private String defaultFS;
    private String userName;
    private String replication;

    @Bean
    public Configuration getConfiguration() {
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", defaultFS);
        configuration.set("dfs.replication", replication);
        return configuration;
    }

    public String getDefaultFS() {
        return defaultFS;
    }

    public void setDefaultFS(String defaultFS) {
        this.defaultFS = defaultFS;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReplication() {
        return replication;
    }

    public void setReplication(String replication) {
        this.replication = replication;
    }
}
