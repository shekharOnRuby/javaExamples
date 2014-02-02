package ganit;

public class Sama {
	int samaInt;
	/**
	 * @return the samaInt
	 */
	public int getSamaInt() {
		return samaInt;
	}

	/**
	 * @param samaInt the samaInt to set
	 */
	public void setSamaInt(int samaInt) {
		this.samaInt = samaInt;
	}

	float samaFloat;
	/**
	 * @return the samaFloat
	 */
	public float getSamaFloat() {
		return samaFloat;
	}

	/**
	 * @param samaFloat the samaFloat to set
	 */
	public void setSamaFloat(float samaFloat) {
		this.samaFloat = samaFloat;
	}

	public  Sama(int firts, int two){
		samaInt= firts + two;
	}
	
	public  Sama(float firts, float two){
		samaFloat= firts + two;
	}
	
	
	
}
