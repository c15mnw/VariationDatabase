package com.roslin.mwicks.spring.variation.offline;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import com.roslin.mwicks.utility.FileUtil;
import com.roslin.mwicks.utility.Wrapper;
import com.roslin.mwicks.spring.variation.model.SNPChromosome;
import com.roslin.mwicks.spring.variation.routines.ConvertFiletoSNPChromosomeList;


public class InsertTest {

	// Constants ----------------------------------------------------------------------------------
    private static final String MSGLEVEL = "*";
	private static final String INFOLEVEL = "**";
	private static final String START = "*";
	private static final String STOP = "*";

	
	public static void main(String args[]){  

    	try {

        	int intReturnCode = 0;
        	

        	long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());
            
    		if (args.length != 1 ) {
    			
    		    Wrapper.printMessage("ERROR! There MUST be 1 Command Line Arguments passed to this program!", MSGLEVEL, MSGLEVEL);
    			intReturnCode = -1;
            }
            else {
            
                
        		String directory = args[0];
        		
                File dir = new File(directory);

                if ( dir.exists() ) {
                	
            		File[] filesFile = FileUtil.listAllFilesInDirectory(directory);
            		
            		for ( File file : filesFile ) {
                		 
                        System.out.println("Directory : " + directory + " : " + file.getName());
                        
                        List<SNPChromosome> snpchromosomeList = ConvertFiletoSNPChromosomeList.run(file);

        	     		System.out.println( "snpchromosomeList.size() : " + snpchromosomeList.size() );

                        Iterator<SNPChromosome> iteratorsnpchromosomeList = snpchromosomeList.iterator();
            	        
                        int i = 0;
                        
            	     	while (iteratorsnpchromosomeList.hasNext()) {
            	    		
            	     		i++;
            	     		
            	     		SNPChromosome snpchromosome = iteratorsnpchromosomeList.next();
            	     		System.out.println( i + " " + snpchromosome.toString() );
            	     	}
            		}
                }
                else {
                	
                    System.out.println("Directory " + directory + " DOES NOT exist!!!");
                }
                    
            }
    		
            Wrapper.printEpilogue(STOP, Wrapper.getExecutingClass(), startTime);

        	System.exit(intReturnCode);

    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
