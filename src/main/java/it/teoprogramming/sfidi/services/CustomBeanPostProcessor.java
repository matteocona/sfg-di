package it.teoprogramming.sfidi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// Il metodo di default e' annotato con nullable nell'interfaccia per cui puo' ritornare null.
		// -------------------------------------
		if(bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean) bean).beforeInit();
		}
		// -------------------------------------
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// Il metodo di default e' annotato con nullable nell'interfaccia per cui puo' ritornare null.
		// -------------------------------------
		if(bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean) bean).afterInit();
		}
		// -------------------------------------
		return bean;
	}
}
