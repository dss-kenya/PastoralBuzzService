package com.adonnai.webapp.pastoralbuzz.dao;

import java.util.List;

import com.adonnai.webapp.pastoralbuzz.models.PastoralBuzzModel;
import com.adonnai.webapp.pastoralbuzz.models.UserModel;

public interface PastoralBuzzDao {
	List<PastoralBuzzModel> getPastoralBuzzes(int startValue, int limit);
	void insertPastoralBuzz(PastoralBuzzModel pastoralBuzz);
	void updatePastoralBuzz(PastoralBuzzModel pastoralBuzz);
	void markAsFavorite(PastoralBuzzModel pastoralBuzz, UserModel user);
	void deletePastoralBuzz(PastoralBuzzModel pastoralBuzz);
}
