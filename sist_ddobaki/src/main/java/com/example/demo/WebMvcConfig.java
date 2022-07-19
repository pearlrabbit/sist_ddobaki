package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	//web root가 아닌 외부 경로에 있는 리소스를 url로 불러올 수 있도록 설정
    //현재 localhost:8090/summernoteImage/1234.jpg
    //로 접속하면 C:/summernote_image/1234.jpg 파일을 불러온다.
//    @Override
//    public void  (ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/summernoteImage/**")
//                .addResourceLocations("file:///C:/summernote_image/");
//    }

	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setDefaultEncoding("UTF-8"); // 파일 인코딩 설정
		multipartResolver.setMaxUploadSizePerFile(5 * 1024 * 1024); // 파일당 업로드 크기 제한 (5MB)
		return multipartResolver;
	}
	
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/main").setViewName("main");
	    registry.addViewController("/login").setViewName("login");
	    //registry.addViewController("/admin").setViewName("admin");
	    registry.addViewController("/signUp").setViewName("signUp");
	    registry.addViewController("/myPage").setViewName("myPage");
	  }

}