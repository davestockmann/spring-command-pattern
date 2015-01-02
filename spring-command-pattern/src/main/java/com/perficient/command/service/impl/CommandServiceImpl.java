package com.perficient.command.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.perficient.command.CommandTwo;
import com.perficient.command.one.CommandOne;

@Component
public class CommandServiceImpl {

	@Resource(name = "commandOneList")
	private List<CommandOne> commandOneList;

	@Resource(name = "commandTwoList")
	private List<CommandTwo> commandTwoList;

	public void process() {
		Assert.notNull(commandOneList);
		Assert.notNull(commandTwoList);

		Assert.notEmpty(commandOneList);
		Assert.notEmpty(commandTwoList);

		for (CommandOne commandOne : commandOneList) {
			Assert.notNull(commandOne);
			commandOne.process("commandOne");
		}

		for (CommandTwo commandTwo : commandTwoList) {
			Assert.notNull(commandTwo);
			commandTwo.process("commandTwo");
		}

	}
}
