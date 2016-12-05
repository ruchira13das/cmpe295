package com.sjsu.masterproject.recommendation.refresh;

import java.io.File;

import org.springframework.core.env.Environment;

import com.sjsu.masterproject.util.Constants;

public class ToysAndGamesRecommender extends Recommender {

	private Environment env;

	private static final String LOG_FILE_NAME_CONFIG = "app.config.recommendation.log.baby";

	public ToysAndGamesRecommender(Environment env) {
		super();
		this.env = env;
	}

	@Override
	protected File getInputFile() {
		return new File(env.getProperty(LOG_FILE_BASE_PATH_CONFIG) + env.getProperty(LOG_FILE_NAME_CONFIG));
	}

	@Override
	protected String getCategory() {
		return env.getProperty(Constants.CATEGORY__CONFIG_TOYSANDGAMES);
	}

}
