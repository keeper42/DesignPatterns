package org.example.factory;

import lombok.Data;
import org.example.aop.MethodLog;
import org.example.materials.Cheese;
import org.example.materials.Clams;
import org.example.materials.Dough;
import org.example.materials.Pepperoni;
import org.example.materials.Sauce;
import org.example.materials.Veggies;

@Data
public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;

	public abstract void prepare();

	@MethodLog()
	public void bake() {}

	@MethodLog
	public void cut() {}

	@MethodLog
	public void box() {}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
