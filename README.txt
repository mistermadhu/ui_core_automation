 
******* Core Test Automation Framework *******
Developed by : ProKarma Inc
Requires : JDK 1.8 or above
**********************************************

COMMAND : mvn verify [OPTION]...  

DESCRIPTION          

       This tool is used for testing web applications. This is developed using Selenium and Cucumber.

      OPTIONS

	   -DdryRun=true  
	         The tool will scan through all the features/scenarios and tags that have been specified 
			 without actually executing any of the steps and gives a snippet of any missing step definitions
			 
	   -DisALMUpdate=true	  
	         The tool connects to ALM, creates a testRun an updates the execution status.