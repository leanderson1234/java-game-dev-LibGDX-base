package com.mygdx.game.framework.scena;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.mygdx.game.framework.actor.DialogBox;

public class SetTextAction extends Action
{
    protected String textToDisplay;
    public SetTextAction(String t)
    {
        textToDisplay = t;
    }
    public boolean act(float dt)
    {
        DialogBox db = (DialogBox)target;
        db.setText( textToDisplay );
        return true;
    }
}
