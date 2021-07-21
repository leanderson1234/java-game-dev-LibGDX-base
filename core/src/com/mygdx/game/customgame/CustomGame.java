package com.mygdx.game.customgame;

import com.mygdx.game.framework.game.BaseGame;
import com.mygdx.game.customgame.screen.LevelScreen;

public class CustomGame extends BaseGame {
	public void create(){
		super.create();
		setActiveScreen(new LevelScreen());
	}

}
