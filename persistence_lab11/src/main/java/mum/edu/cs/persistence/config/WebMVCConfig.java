package mum.edu.cs.persistence.config;

import mum.edu.cs.persistence.formatter.RoleFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    @Autowired
    RoleFormatter roleFormatter;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(roleFormatter);
    }
}

