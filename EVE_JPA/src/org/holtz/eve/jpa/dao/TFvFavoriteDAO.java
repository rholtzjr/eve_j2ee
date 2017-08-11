package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TFvFavorite;

public interface TFvFavoriteDAO {
	public TFvFavorite getFavoriteById(int id);
	public TFvFavorite getFavoriteByName(String name);
	public List<TFvFavorite> getFavoriteList();
	public void save(TFvFavorite favorite);
	public void delete(TFvFavorite favorite);
}
