package com.perficient.command.two;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.perficient.command.CommandTwo;

@Component("systemOutTwoCommand")
public class SystemOutCommandTwoImpl implements CommandTwo {

	private static final Logger LOG = LoggerFactory
			.getLogger(SystemOutCommandTwoImpl.class);

	public void process(String param) {
		LOG.debug(SystemOutCommandTwoImpl.class.getName() + " " + param);
	}

}
