package com.demo;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		MathsCourse rajesh=new MathsCourse("rajesh");
		MathsCourse pankaj=new MathsCourse("pankaj");
		MathsCourse suraj=new MathsCourse("suraj");
		
		Coursetype course1=new Coursetype(rajesh,"Maths");
		course1.display();
		rajesh.fee();
		
		CandidateList list1=new CandidateList();
		Candidate candidate1=new Candidate("rajesh","MATHS",1);
		list1.addMaths(candidate1);
		
		Candidate candidate2=new Candidate("pankaj","MATHS",2);
		list1.addMaths(candidate2);
		
		Candidate candidate3=new Candidate("suraj","MATHS",3);
		list1.addMaths(candidate3);
		
		list1.display_Maths();
		
//		list1.deleteMaths();
			
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your choice");
//		System.out.println("1 for Registration");
//		System.out.println("2 for Deregistration");
//		int ch=sc.nextInt();
//		switch(ch){
//			case 1:System.out.println("Choose 1:Maths, 2:English, 3:Hindi");
//			       int ch1=sc.nextInt();
//			       switch(ch1){
//			       case 1:
//			    	   System.out.println("Enter name and rollno of the candidate");
//			           String str1=sc.next();
//			           int rollno1=sc.nextInt();
//			           MathsCourse math=new MathsCourse(str1);
//			    	   Coursetype course1=new Coursetype(math,"Maths"); 
//			    	   course1.display();
//			    	   math.fee();
//			    	   CandidateList clist1=new CandidateList();
//			    	   Candidate candidate1=new Candidate(str1,"MATHS",rollno1);
//			    	   clist1.addMaths(candidate1);
//			    	   break;
//			       case 2:
//			    	   System.out.println("Enter name and rollno of the candidate");
//			           String str2=sc.next();
//			           int rollno2=sc.nextInt();
//			           EnglishCourse eng=new EnglishCourse(str2);
//			    	   Coursetype course2=new Coursetype(eng,"English"); 
//			    	   course2.display();
//			    	   eng.fee();
//			    	   CandidateList clist2=new CandidateList();
//			    	   Candidate candidate2=new Candidate(str2,"ENGLISH",rollno2);
//			    	   clist2.addEnglish(candidate2);
//			    	   break; 
//			       case 3:
//			    	   System.out.println("Enter name and rollno of the candidate");
//			           String str3=sc.next();
//			           int rollno3=sc.nextInt();
//			           HindiCourse hindi=new HindiCourse(str3);
//			    	   Coursetype course3=new Coursetype(hindi,"Hindi"); 
//			    	   course3.display();
//			    	   hindi.fee();
//			    	   CandidateList clist3=new CandidateList();
//			    	   Candidate candidate3=new Candidate(str3,"ENGLISH",rollno3);
//			    	   clist3.addEnglish(candidate3);
//			    	   break;
//			    	default: System.out.println("Invalid choice");
//			    	         break;
//			       } 
//			       break;
//			case 2:System.out.println("Enter 1:Maths, 2:English, 3:Hindi");
//			       int ch2=sc.nextInt();
//			       switch(ch2) {
//			       case 1: CandidateList clist1=new CandidateList();
//			               clist1.deleteMaths();
//			               break;
//			       case 2:CandidateList clist2=new CandidateList();
//			              clist2.deleteEnglish();
//			              break;
//			       case 3:CandidateList clist3=new CandidateList();
//			              clist3.deleteHindi();
//			              break;
//			        default: System.out.println("Invalid choice");
//			                 break;
//			       }
//                   break;
//			case 3: System.out.println("Enter 1: Maths , 2:English , 3:Hindi");
//			       int ch3=sc.nextInt();
//			       switch(ch3){
//			       case 1: CandidateList clist1=new CandidateList();
//	               clist1.display_Maths();
//	               break;
//	               case 2:CandidateList clist2=new CandidateList();
//	               clist2.display_English();
//	               break;
//	               case 3:CandidateList clist3=new CandidateList();
//	               clist3.display_Hindi();
//	               break;
//	               default: System.out.println("Invalid choice");
//	                break;
//	               }
//            default:
//            	System.out.println("Invalid choice");
//            	break;
//		}

	}


}
