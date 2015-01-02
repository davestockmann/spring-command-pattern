package com.perficient.command.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.perficient.command.config.ApplicationConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
public class CommandServiceImplTest implements ApplicationContextAware {
	// by implementing ApplicationContextAware, this class will automatically
	// get the application context

	@Autowired
	private CommandServiceImpl commandService;

	@Before
	public void setup() {
		String[] beans = context.getBeanDefinitionNames();
		System.out.println(StringUtils.arrayToCommaDelimitedString(beans));
	}

	@Test
	public void process() {
		Assert.notNull(commandService);
		commandService.process();
	}

	private ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context = applicationContext;

	}
}
