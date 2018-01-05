package com.movie.finder.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MovieFinderController.class)
public class MovieFinderControllerTest {
	@Autowired
	private MovieFinderController controller;

	@Test
	public void testHome() {
		String response = controller.home();

		Assert.assertEquals("Movie finder app!", response);
	}
}
