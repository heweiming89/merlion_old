package org.together.merlion.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.Test;

public class CodeMock {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(CodeMock.class);

	@Test
	public void test() {
		try {
			int i = 5 / 0;
		} catch (Exception e) {
			logger.debug(e.getMessage(), e);
			logger.info(e.getMessage(), e);
			logger.warn(e.getMessage(), e);
			logger.error(e.getMessage(), e);
		}
	}

}
