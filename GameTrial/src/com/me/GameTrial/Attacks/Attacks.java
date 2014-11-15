package com.me.GameTrial.Attacks;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Attacks {

	public abstract void textureLoad();
	public abstract ArrayList<String> Stats();
	public abstract void animationLeft(OrthographicCamera camera, SpriteBatch batch); 
	public abstract void animationRight(OrthographicCamera camera, SpriteBatch batch);
	public abstract void animationTop(OrthographicCamera camera, SpriteBatch batch);
	public abstract void animationBottom(OrthographicCamera camera, SpriteBatch batch);
}
