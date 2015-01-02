package com.perficient.command.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("systemOutCommand")
public class SystemOutCommandOneImpl implements CommandOne {

	private static final Logger LOG = LoggerFactory
			.getLogger(SystemOutCommandOneImpl.class);

	public void process(String param) {
		LOG.debug(SystemOutCommandOneImpl.class.getName() + " " + param);
	}

}
