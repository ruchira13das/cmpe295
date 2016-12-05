package com.sjsu.masterproject.transform.recommendation;

import java.io.File;

public class BooksRecommendations extends MerchandizeRecommendations {

	@Override
	protected File getInputFile() {
		return new File("data/recommendations/processed/ratings_Books_ready.csv");
	}

	@Override
	protected String getCategory() {
		return "Books";
	}

}
