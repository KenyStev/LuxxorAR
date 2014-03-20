package edu.dhbw.andar.nav;

import javax.microedition.khronos.opengles.GL10;

import edu.dhbw.andar.pub.Global;
import edu.dhbw.andobjviewer.graphics.MiCharacter;
import edu.dhbw.andobjviewer.graphics.Model3D;
import edu.dhbw.andobjviewer.models.Model;

public class Flotador extends Model3D {
	
	public boolean active=false;

	static String model_str = "flotador1.obj";
	static String pattern_str = "Wing.patt";
	
	public Flotador() {
		super(Global.getModel(model_str), pattern_str);
		super.model.scale=15;
	}
	
	@Override
	public void draw(GL10 gl){
		super.draw(gl);
		if(active){
			this.model.zpos+=2;
			if(this.model.zpos>10){
				this.active=false;
			}
		}else{
			this.model.zpos-=0.5;
			if(this.model.zpos>5){
				this.model.setScale(1.5f);
			}
			
			if(this.model.zpos<0){
				this.model.zpos=0;
				this.model.scale=15;
			}
		}
		if(this.model.zpos<5){
			this.model.setScale(-1.5f);
		}
		
	}
	
}
