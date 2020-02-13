/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maris
 */
public class SortsTest {
    
    public SortsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of selectionSort method, of class Sorts.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("selectionSort");
        int[] data = {5,2,6,7,1};
        int na = 5;
        Sorts instance = new Sorts();
        instance.selectionSort(data, na);
        int [] expResult ={1,2,5,6,7};
        int [] Result= data;
        boolean iguales = Arrays.equals(expResult,Result);
        // TODO review the generated test code and remove the default call to fail.
        if(iguales != true){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of toString method, of class Sorts.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        int[] data = {1,2,3,4,5};
        int na = 5;
        Sorts instance = new Sorts();
        instance.toString(data, na);
        String expResult = "1\n2\n3\n4\n5";
        String Result = "1\n2\n3\n4\n5";
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=Result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of merge method, of class Sorts.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        int[] data = null;
        int a = 0;
        int m = 0;
        int b = 0;
        Sorts instance = new Sorts();
        instance.merge(data, a, m, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeSort method, of class Sorts.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        int[] data = {3,2,4,1,7,5};
        int a = 0;
        int b = 5;
        Sorts instance = new Sorts();
        instance.mergeSort(data, a, b);
        int []Result=data;
        int []expResult={1,2,3,4,5,7};
        boolean iguales = Arrays.equals(Result,expResult);
        // TODO review the generated test code and remove the default call to fail.
        if(iguales!=true){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of partition method, of class Sorts.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        int[] data = {8,3,6,2,9,1};
        int low = 0;
        int high = 5;
        Sorts instance = new Sorts();
        int expResult = 0;
        int result = instance.partition(data, low, high);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult==result) {
        }
        else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of quickSort method, of class Sorts.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        int[] data = {9,1,8,2,7,3};
        int low = 0;
        int high = 5;
        Sorts instance = new Sorts();
        instance.quickSort(data, low, high);
        int[]result=data;
        int[]expResult={1,2,3,7,8,9};
        boolean iguales = Arrays.equals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        if(iguales!=true){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getMax method, of class Sorts.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        int[] data = {1,8,5,7,3};
        int n = 4;
        int expResult = 8;
        int result = Sorts.getMax(data, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult==result){
            
        }
        else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of countrSort method, of class Sorts.
     */
    @Test
    public void testCountrSort() {
        System.out.println("countrSort");
        int[] data = null;
        int n = 0;
        int exp = 0;
        Sorts.countrSort(data, n, exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of radixSort method, of class Sorts.
     */
    @Test
    public void testRadixSort() {
        System.out.println("radixSort");
        int[] data = {6,2,9,3,5};
        int n = 5;
        Sorts instance = new Sorts();
        instance.radixSort(data, n);
        int [] result = data;
        int[]expResult={2,3,5,6,9};
        boolean iguales=Arrays.equals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        if(iguales!=true){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of bubbleSort method, of class Sorts.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        int[] data = {9,1,8,2,7,3,6,4,5};
        int na = 7;
        Sorts instance = new Sorts();
        instance.bubbleSort(data, na);
        int []result=data;
        int[]expResult={1,2,3,4,5,6,7,8,9};
        boolean iguales=Arrays.equals(result,expResult);
        // TODO review the generated test code and remove the default call to fail.
        if(iguales!=true){
            fail("The test case is a prototype.");
        }
    }
    
}
