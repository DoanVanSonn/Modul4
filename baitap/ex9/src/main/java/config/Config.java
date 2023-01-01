package config;

import format.Format;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new Format());
    }
}
