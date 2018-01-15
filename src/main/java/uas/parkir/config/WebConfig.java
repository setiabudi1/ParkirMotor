package uas.parkir.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry reg) {
        reg.addViewController("/")        
                .setViewName("daftar-parkir");
        reg.addViewController("/tambah-ui")
                .setViewName("tambah");
        reg.addViewController("/edit-ui")
                .setViewName("edit");
    }

}