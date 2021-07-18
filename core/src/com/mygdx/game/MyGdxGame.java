package com.mygdx.game;

import com.mygdx.game.screen.LevelScreen;

public class MyGdxGame extends BaseGame {
	public void create(){
		super.create();
		setActiveScreen(new LevelScreen());
	}

}
