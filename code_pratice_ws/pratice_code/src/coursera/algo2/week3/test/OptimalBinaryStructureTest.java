package coursera.algo2.week3.test; 

import java.util.Scanner;
import java.io.PrintWriter;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
import coursera.algo2.week3.*;  

/** 
* OptimalBinaryStructure Tester. 
* 
* @author <Premkumar Bhaskal> 
* @since <pre>Sep 26, 2013</pre> 
* @version 1.0 
*/ 
public class OptimalBinaryStructureTest { 
    
    OptimalBinaryStructure testClass = new OptimalBinaryStructure();
    long starttime;
    
    @Before
    public void before() throws Exception {
          starttime = System.nanoTime(); 
    } 
    
    @After
    public void after() throws Exception {
		long now = System.nanoTime();
		System.out.println("elapsed time " + (now-starttime)/1000000 + "milli secs");
    } 
    
        /** 
    * 
    * Method: getOptimalSearchTime(InputReader in) 
    * 
    */ 
    @Test
    public void testGetOptimalSearchTime() throws Exception { 
        
    } 
    
        
} 
