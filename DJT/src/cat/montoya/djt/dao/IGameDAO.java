package cat.montoya.djt.dao;

import java.util.List;

import cat.montoya.djt.entity.Game;

public interface IGameDAO {
	
	Game getGame(Long id);
	Game setGame(Game game);
	List<Game> getGameList();

}
