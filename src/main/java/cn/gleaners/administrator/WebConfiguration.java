package cn.gleaners.administrator;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author WangDeSheng
 * @date 2020/6/13 11:07
 * description：
 */
@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(MediaType.APPLICATION_JSON);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new AdminInterceptor());

        registration.excludePathPatterns("/login");

        registration.excludePathPatterns("/error");
        //拦截全部
        registration.addPathPatterns("/**");
    }
}
