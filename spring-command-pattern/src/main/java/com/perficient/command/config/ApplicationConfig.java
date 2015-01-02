package com.perficient.command.config;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.perficient.Application;
import com.perficient.command.CommandTwo;
import com.perficient.command.one.CommandOne;

@Configuration
@ComponentScan(basePackageClasses = Application.class)
public class ApplicationConfig {

	@Resource(name = "systemErrCommand")
	private CommandOne systemErrCommand;

	@Resource(name = "systemOutCommand")
	private CommandOne systemOutCommand;

	@Resource(name = "systemErrTwoCommand")
	private CommandTwo systemErrTwoCommand;

	@Resource(name = "systemOutTwoCommand")
	private CommandTwo systemOutTwoCommand;

	@Bean(name = "commandOneList")
	public List<CommandOne> commandOneList() {
		List<CommandOne> commands = new ArrayList<CommandOne>();
		commands.add(systemErrCommand);
		commands.add(systemOutCommand);

		return commands;
	}

	@Bean(name = "commandTwoList")
	public List<CommandTwo> commandTwoList() {
		ArrayList<CommandTwo> commands = new ArrayList<CommandTwo>();
		commands.add(systemErrTwoCommand);
		commands.add(systemOutTwoCommand);

		return commands;
	}

}