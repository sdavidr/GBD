package cat.montoya.djt.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.graphics.Color;

import cat.montoya.djt.entity.Chip;
import cat.montoya.djt.entity.Chip.ChipType;
import cat.montoya.djt.entity.Dice;
import cat.montoya.djt.entity.Dice.DiceType;
import cat.montoya.djt.entity.Game;

public class GameDAO implements IGameDAO {

	private File rootFolder;

	public GameDAO(File rootFolder) {
		super();
		this.rootFolder = rootFolder;
	}

	@Override
	public Game getGame(Long id) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.setBoardThumbnailURL("");
		game.setBoardURL("");
		List<Chip> chips = new ArrayList<Chip>();
		Chip chip = new Chip();
		chip.setColor(Color.BLUE);
		chip.setSize(10);
		chip.setType(ChipType.CIRCLE);
		chips.add(chip);
		game.setChips(chips);
		List<Dice> dices = new ArrayList<Dice>();
		Dice dice = new Dice();
		dice.setType(DiceType.NUMERIC);
		dices.add(dice);
		game.setDices(dices);
		game.setHelp(new String[] { "Manual del Joc Dummy" });
		game.setId(1l);
		game.setName("Dummy Game");
		return game;
	}

	@Override
	public Game setGame(Game game) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> getGameList() {
		// TODO Auto-generated method stub
		return null;
	}

}
