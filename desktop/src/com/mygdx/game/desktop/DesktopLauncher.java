package com.mygdx.game.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		Game myGame = new MyGdxGame();
		LwjglApplication launcher = new LwjglApplication( myGame, "Game", 800, 600 );
//		new LwjglApplication(new MyGdxGame(), config);
	}
}
