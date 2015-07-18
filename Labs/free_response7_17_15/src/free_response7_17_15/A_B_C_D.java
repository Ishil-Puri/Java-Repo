package download_lab;

/*
 * @author Ishil Puri
 * 7/15/15
 */

import java.util.ArrayList;

public class SpotifyDownloads {

	// the list of downloaded information
	// guaranteed not to be null and not contain duplicate titles
	private ArrayList<DownloadInfo> downloadList;

	// creates the list of downloaded information 
	public SpotifyDownloads () {
		downloadList = new ArrayList<DownloadInfo>();
	}

	// returns a reference to the DownloadInfo object with the requested title
	// if it exists
	// @param: title - the requested title
	// @return: - a reference to the DownloadInfo object with the title that
	//            matches the parameter title if it exists in the list; null
	//            otherwise
	public DownloadInfo getDownloadInfo (String title) {
		// implement this in part (a)
		for(int i = 0; i<downloadList.size(); i++){
			if (title.equals(downloadList.get(i))){
				return downloadList.get(i);
			}
		}
		return null;
	}

	// updates downloadList with information from titles.
	// @param: titles - a list of song titles
	// postcondition:
	//    - there are no duplicate titles in downloadList
	//    - no entries were removed from downloadList
	//    - all songs in titles are represented in downloadList
	//    - for each existing entry in downloadList, the download count is
	//      is increased by the number of times its title appeared in titles
	//    - the order of the existing entries in downloadList is not changed
	//    - the first time an object with a title from titles is added to 
	//      downloadList, it is added to the end of the list
	//    - new entries in downloadList appear in the same order
	//    - for each new entry in downloadList, the download count is equal to 
	//      the number of times its title appeared in titles

	public void updateDownloads (ArrayList<String> titles) {
		// implement this in part (b)
		for (String title : titles){
	      DownloadInfo info = getDownloadInfo(title);
	      if (info == null){
	        downloadList.add(new DownloadInfo(title));
		}else{
	        info.incrementTimesDownloaded();
	    }
	  }
	}
}



package token_lab;

public class TokenPa {

	private int[] board;
	private int currentPlayer;
	
	// Creates a board array to be of size playerCount and fills it with
	// random integer values from 1 to 10, inclusive.  Initializes currentPlayer
	// to a random integer value in the range between 0 and (playerCount - 1).
	// inclusive.
	// @param: playerCount - the number of players
	public TokenPa (int playerCount) {
		// implemented in part (a)
		board = new int[playerCount];
	    for (int i = 0; i < playerCount; i++)
	      board[i] = (int)(10 * Math.random()) + 1;
	    currentPlayer = (int)(playerCount * Math.random());
	}
	
	// Distributes the tokens from the current player's position one at a time
	// to each player in the game.  Distribution begins with the next position
	// and continues until all the tokens have been distributed.  If there are
	// still tokens to distribute when the player at the highest position is 
	// reached, the next token will be distributed to the player at position
	// 0.
	// PRECONDITION: the current player has at least one token
	// POSTCONDITION: the current player has not changed
	public void distributeCurrentPlayerTokens() {
		// implemented in part (b)
		int numTokens = board[currentPlayer];
		board[currentPlayer] = 0;
	    int i = currentPlayer;
	    while (numTokens > 0)
	    {
	      i = (i+1) % board.length;
	      board[i]++;
	      numTokens--;
	    }
	}
	
}




package telescope_lab;

public class SkyClass {

	// a rectangular array that holds the data representing a rectangular area
	// of the sky
	private double[][] view;
	
	// constructs a SkyClass object from a 1-dimensional array of scan data
	// @param: numRows - the number of rows represented in the view
	//		   PRECONDITION: numRows > 0
	// @param: numCols - the number of columns represented in the view
	//         PRECONDITION: numCols > 0
	// @param: scanned - the scan data received from the telescope, stored in
	//         telescope order
	// POSTCONDITION: view has been created as a rectangular 2-dimensional
	//                array with numRows and numCols columns and the values
	//                in scanned have been copied to view and are ordered as 
	//                in the original rectangular area of sky.
	public SkyClass (int numRows, int numCols, double[] scanned) {
		// to be implemented in part (a)
		view = new double[numRows][numCols];
	    int row = 0, col = 0, step = 1;
	    for (double amtLight : scanned)
	    {
	      view[row][col] = amtLight;
	      int nextCol = col + step;
	      if (nextCol >= 0 && nextCol < numCols)
	        col = nextCol;
	      else
	      {
	        row++;
	        step = -step;
	      }
	    }
	}
	
	// returns the average of the values in a rectangular section of view
	// @param: startRow - the first row index of the section
	// @param: endRow - the last row index of the section
	// @param: startCol - the first column index of the section
	// @param: endCol - the last column index of the section
    // PRECONDITION: 0 <= startRow <= endRow < view.length
	// PRECONDITION: 0 <= startCol <= endCol < view[0].length
	// @return: the average of the values specified in the view
	public double getAverage (int startRow, int endRow, int startCol, int endCol) {
		// to be implemented in part (b)
		double sum = 0.0;
	    int count = 0;
	    for (int rows = startRow; rows <= endRow; rows++)
	    {
	      for (int cols = startCol; cols <= endCol; cols++)
	      {
	        sum += view[rows][cols];
	        count++;
	      }
	    }
	    return sum / count;
	}
	
}





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
