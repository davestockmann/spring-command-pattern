package com.perficient.command.two;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.perficient.command.CommandTwo;

@Component("systemErrTwoCommand")
public class SystemErrCommandTwoImpl implements CommandTwo {

	private static final Logger LOG = LoggerFactory
			.getLogger(SystemErrCommandTwoImpl.class);

	public void process(String param) {
		LOG.debug(SystemErrCommandTwoImpl.class.getName() + " " + param);

	}

}
