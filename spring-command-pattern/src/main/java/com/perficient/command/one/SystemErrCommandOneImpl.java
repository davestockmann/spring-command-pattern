package com.perficient.command.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("systemErrCommand")
public class SystemErrCommandOneImpl implements CommandOne {

	private static final Logger LOG = LoggerFactory
			.getLogger(SystemErrCommandOneImpl.class);

	public void process(String param) {
		LOG.debug(SystemErrCommandOneImpl.class.getName() + " " + param);
	}

}
