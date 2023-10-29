package it.teoprogramming.sfidi.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
		BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		System.out.println("## Constructor: I'm in the LifeCycleBean Constructor");
	}

	@Override public void destroy() throws Exception {
		System.out.println("## DisposableBean.destroy(): The Lifecycle bean has been terminated");
	}

	@Override public void afterPropertiesSet() throws Exception {
		System.out.println("## InitializingBean.afterPropertiesSet(): The LifeCycleBean has its properties set!");
	}

	@Override public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## BeanFactoryAware.setBeanFactory(): Bean Factory has been set");
	}

	@Override public void setBeanName(String name) {
		System.out.println("## BeanNameAware.setBeanName(): My Bean Name is: " + name);
	}
	@Override public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## ApplicationContextAware.setApplicationContext(): Application context has been set");
	}

	@PostConstruct
	public void postConstruct(){
		System.out.println("## PostConstruct Annotation: The Post Construct annotated method has been called");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("## PreDestroy Annotation: The PreDestroy annotated method has been called");
	}

	public void beforeInit(){
		System.out.println("## --- BeanPostProcessor.postProcessBeforeInitialization() - Before Init - Called by Bean Post Processor");
	}

	public void afterInit(){
		System.out.println("## --- BeanPostProcessor.postProcessAfterInitialization() - After init called by Bean Post Processor");
	}
}
