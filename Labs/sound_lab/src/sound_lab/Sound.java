package sound_lab;

public class Sound {

	// the array of values in this sound; guaranteed not to be null
	private int [] samples;

	// changes those values in this sound that have an amplitude greater than
	// limit.
	// values greater than limit are changed to limit.
	// values less than -limit are changed to -limit
	// @param: limit - the amplitude limit
	//		PRECONDITION: limit >= 0
	// @return: the number of values in this sound that this method changed
	public int limitAmplitude (int limit) {
		// to be implemented in part (a)
		int count = 0;

		for (int i = 0; i < samples.length; i++)
		{
			if (samples[i] > limit)
			{
				samples[i] = limit;
				count++;
			}
			else if (samples[i] < -limit)
			{
				samples[i] = -limit;
				count++;
			}
		}
		return count;
	}

	// removes all silence from the beginning of this sound
	// silence is represented by a value of 0
	// PRECONDITION: samples contains at least one nonzero value
	// POSTCONDITION: the length of samples reflects the removal of starting
	//                silence
	public void trimSilenceFromBeginning() {
		// to be implemented in part (b)
		int n = 0;
		while (samples[n] == 0)
			n++;

		int[] newSamples = new int[samples.length - n];

		for (int i = 0; i < newSamples.length; i++){
			newSamples[i] = samples[i+n];
		}
		samples = newSamples;

	}

}
