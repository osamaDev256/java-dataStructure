package Lap10;

import java.util.*;
//import java.io.IOException;
import java.nio.file.Paths;

public class test {
	
	public static void main(String[] args)throws Exception{
		 Scanner input = new Scanner (Paths.get("Employee.txt"));
	        Employee [] employees = new Employee [6];
	         int counter=0;
	        while (input.hasNextLine()){

	            Employee em1= new Employee(input.next(),input.nextInt(),input.nextInt(),input.next(),input.next(),input.nextInt(),input.nextInt());
	            employees[counter]=em1;
	            counter++;
	        }
	       System.out.println("Employees Info : ");
	        for(int i =0 ; i<employees.length;i++){
	            System.out.print(employees[i]);
	        }
	       

	         System.out.println("--------");
	         System.out.println();
	         System.out.println("After the insertion sort : ");
	         Employee.sortBySalary(employees);
	         for(int i =0 ; i<employees.length;i++){
	            System.out.println(employees[i]);
	        }

	       

	        System.out.println("--------");
	        System.out.println("After the quick sort");
	        Employee.sortById(employees,0 , employees.length-1);
	        for(int i =0 ; i<employees.length;i++){
	            System.out.println(employees[i]);
	        }
	           
	        System.out.println("---------");
	        System.out.println("Binary search");
	        Employee.PrintEmployee( employees, 0 , employees.length-1, 113);

	    }






	}

