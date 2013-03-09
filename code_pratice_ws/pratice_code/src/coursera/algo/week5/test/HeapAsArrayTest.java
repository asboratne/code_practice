package coursera.algo.week5.test; 

import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
import coursera.algo.week5.*;  

/** 
* HeapAsArray Tester. 
* 
* @author <Premkumar Bhaskal> 
* @since <pre>Mar 9, 2013</pre> 
* @version 1.0 
*/ 
public class HeapAsArrayTest { 
    
    HeapAsArray testClass;
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


	@Test
	public void testHeapWorking() {
		int[] nums = new int[]{4,3,5,6,7,2};

		testClass = new HeapAsArray(nums);

		for (int i=0;i<nums.length;i++) {
			System.out.println((i+1) + " min element is " + testClass.extractMin());
		}
	}

	@Test
	public void testHeapPerformance() {
		int[] array = getRandomArray(1000000);

		System.out.println("minimum element is " + findMin(array));

		testClass = new HeapAsArray(array);

		System.out.println("minimum element is " + testClass.extractMin());

	}

	private int findMin(int[] a) {
		int min = Integer.MAX_VALUE;

		for (int i : a) {
			min = Math.min(i, min);
		}
		return min;
	}

	private int[] getRandomArray(int size) {
		int[] array = new int[size];

		Random random = new Random(23242424);

		for (int i=0;i<size;i++) {
			array[i] = random.nextInt(size);
		}

		return array;
	}
} 
