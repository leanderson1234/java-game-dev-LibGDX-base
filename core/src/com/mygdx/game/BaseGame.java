package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;

/**
 *  Created when program is launched;
 *  manages the screens that appear during the game.
 */
public abstract class BaseGame extends Game
{
    /**
     *  Stores reference to game; used when calling setActiveScreen method.
     */
    private static BaseGame game;

    public void create (){
        // prepare-se para várias classes / stages para receber entrada discreta
        InputMultiplexer im = new InputMultiplexer();
        Gdx.input.setInputProcessor (im);
    }
    /**
     *  Called when game is initialized; stores global reference to game object.
     */
    public BaseGame()
    {
        game = this;
    }

    /**
     *  Used to switch screens while game is running.
     *  Method is static to simplify usage.
     */
    public static void setActiveScreen(BaseScreen s)
    {
        game.setScreen(s);
    }
}