package edu.dhbw.andar.nav;

import javax.microedition.khronos.opengles.GL10;

import edu.dhbw.andar.pub.Global;
import edu.dhbw.andobjviewer.graphics.MiCharacter;
import edu.dhbw.andobjviewer.graphics.Model3D;
import edu.dhbw.andobjviewer.models.Model;

public class Flotador2 extends Model3D {
	
	public boolean active=false;

	static String model_str = "flotador2.obj";
	static String pattern_str = "Wing.patt";
	
	public Flotador2() {
		super(Global.getModel(model_str), pattern_str);
		super.model.scale=15;
	}
	
	@Override
	public void draw(GL10 gl){
		super.draw(gl);
		
		
	}
	
}
