package com.undologic.config;

import com.undologic.service.CalAmpUdpListener;
import com.undologic.service.CalAmpUdpListenerBuilder;
import com.undologic.service.UdpListener;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.undologic.controller")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		registry.addInterceptor(localeChangeInterceptor);

	}



	@Bean(name = "calAmpUdpListenerBuilder")
	public UdpListener udpLisiter(){
		CalAmpUdpListener listener =  CalAmpUdpListenerBuilder.initalize()
				.setMaxClients(1)
				.setPathfProcess("/")
				.setPort(1810)
				.build();
		listener.run();
		return listener;
	}



//	@Bean
//	public MessageSource messageSource() {
//
//		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//		messageSource.setBasenames("classpath:messages/messages",
//				"classpath:messages/validation");
//		// if true, the key of the message will be displayed if the key is not
//		// found, instead of throwing a NoSuchMessageException
//		messageSource.setUseCodeAsDefaultMessage(true);
//		messageSource.setDefaultEncoding("UTF-8");
//		// # -1 : never reload, 0 always reload
//		messageSource.setCacheSeconds(0);
//		return messageSource;
//	}
}
