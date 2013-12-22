package com.nexes.manager;

public interface fileman {


	/**
	 * This will return a string of the current directory path
	 * @return the current directory
	 */
	public String getCurrentDir(); 
	
	/**
	 * This will return a string of the current home path.
	 * @return	the home directory
	 */
	public String setHomeDir(String name);
	
	/**
	 * This will determine if hidden files and folders will be visible to the
	 * user.
	 * @param choice	true if user is veiwing hidden files, false otherwise
	 */
	public void setShowHiddenFiles(boolean choice);
	
	/**
	 * 
	 * @param type
	 */
	public void setSortType(int type);
	/**
	 * This will return a string that represents the path of the previous path
	 * @return	returns the previous path
	 */
	public String getPreviousDir();
	
	/**
	 * 
	 * @param path
	 * @param isFullPath
	 * @return
	 */
	public String getNextDir(String path, boolean isFullPath);

	/**
	 * 
	 * @param old		the file to be copied
	 * @param newDir	the directory to move the file to
	 * @return
	 */
	public int copyToDirectory(String old, String newDir);
	
	/**
	 * 
	 * @param zipName
	 * @param toDir
	 * @param fromDir
	 */
	public void extractZipFilesFromDir(String zipName, String toDir, String fromDir);
	
	
	/**
	 * 
	 * @param zip_file
	 * @param directory
	 */
	public void extractZipFiles(String zip_file, String directory);	
	/**
	 * 
	 * @param path
	 */
	public void createZipFile(String path); 	
	/**
	 * 
	 * @param filePath
	 * @param newName
	 * @return
	 */
	public int renameTarget(String filePath, String newName);
	/**
	 * 
	 * @param path
	 * @param name
	 * @return
	 */
	public int createDir(String path, String name);
	
	
	/**
	 * The full path name of the file to delete.
	 * 
	 * @param path name
	 * @return
	 */
	public int deleteTarget(String path);	
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public boolean isDirectory(String name) ;
	
	
	/**
	 * 
	 * @param dir
	 * @param pathName
	 * @return
	 */
	public String searchInDirectory(String dir, String pathName);
	
	
	/**
	 * 
	 * @param path
	 * @return
	 */
	public long getDirSize(String path) ;	
	
	
}
