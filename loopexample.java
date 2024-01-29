package javapractice3;

public class loopexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		      // forword direction
//		for(int i=1; i<=5; i++) {
//			System.out.println(i);
//		
//		}	
//
		        // backword direction
//		    for (int i=10; i>=1; i--) {
//		    	System.out.println(i);
//		    }
		  
		       // table 2
		
//		    int num =2;
//		    for (int i=1; i<=10; i++) { 
//			  System.out.println(i*num);
//		   }
//		    
		           //table 3
//		     int num1 =3;
//		    for (int i=1; i<=10; i++) { 
//			  System.out.println(i*num1);
//		   }
		
		
		     // factorial 5 10 , 25
//		  int num = 5;
//		  for(int i=1; i<=5; i++) {
//			 num = num*i;
//			 System.out.println(num);
//			 
//		  }
		
//		    int b = 10;
//		    for(int i=1; i<10; i++) {
//		    	b= b*i;
//		    	System.out.println(b);
//		    }
		    
//		       int c=25;
//		       for(int i=1; i<25; i++) {
//		    	   c=c*i;
//		    	   System.out.println(c);
//		       }
		 

//		        int lowerBound = 1;
//		        int upperBound = 100;
//
//		        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
//		        
//		        for (int number = lowerBound; number <= upperBound; number++) {
//		            boolean isPrime = true;
//
//		            // Check if the number is divisible by any number from 2 to its square root
//		            for (int i = 2; i <= Math.sqrt(number); i++) {
//		                if (number % i == 0) {
//		                    isPrime = false;
//		                    break;
//		                }
//		            } 
//
//		            if (isPrime) {
//		                System.out.println(number);
//		            }
//		        }
		
//	            int a= 100;
//	            for(int num=2; num<=100; num++) {
//	            	boolean isprime = true;
//	            	
//	            	for (int i= 2; i<= Math.sqrt(num); i++) {
//	            		if (num % i==0) {
//	            			isprime = false;
//	            			break;
//	            		}
//	            	}
//	            	
//	            	if (isprime) {
//	            		System.out.println(num);
//	            	}
//	            }
		  
		           // prime number
//	             int i, count=0;
//	              int num = 23;
//	                for ( i =1; i<=num; i++) {
//	                	 if (num%i==0) {
//	                		 count++;
//	                	 }
//	                }
//	                
//	                if (count ==2) {
//	                	System.out.println("prime no.");
//	                } else {
//	                	System.out.println("not a prime no.");
//	                }
	                
//	                int i, count=0;
//	                int num = 43;
//	                for (i = 1; i<=num; i++) {
//	                	if (num%i==0) {
//	                		count++;
//	                	   }
//	                	}
//	                if (count==2) {
//	                		System.out.println("prime");
//	                	}else {
//	                		System.out.println("not a prime no.");
//	                	}
	                
		
		              // fibonacci series
		
		              
//		              int a=0,b=1,c;
//		              
//		               for (int i=0; i<=8; i++) {
//		            	   System.out.print(a+" ");
//		               
//		                  c=a+b;
//		                  a=b;
//		                  b=c;
//		                  
//		            	  // System.out.println(c+" ");
//		            	   
//		               }
		    
//		               int p=0, q=1,s;
//		                for(int i=0; i<=8; i++) {
//		                	s=p+q;
//		                	p=q;
//		                	q=s;
//		                	System.out.print(p+" ");
//		                	
//		                } 
		   
		                 // armstong no. 
		
//		                int num = 153;
//		          int l=String.valueOf (num).length();
//		          int temp=num;
//		          int r, arm=0;
//		          
//		          for(int i=1; i<=l; i++) {
//		        	r = num % 10;  
//		        	num = num/10;
//		        	
//		        	arm = arm+(r*r*r);
//		        	
//		          }
//		          if (arm==temp) {
//		        	  System.out.println("armstong no.");
//		          }else {
//		        	  System.out.println("not a armstong no.");
//		          }
		       
		             // armstong no.  
//		              int a= 407;
//		              int l = String.valueOf (a).length();
//		              int t=a;
//		              int b, sum=0;
//		               for(int i=1; i<=l; i++) {
//		            	   b=a%10;
//		            	   a=a/10;
//		            	   
//		            	   sum=sum+(b*b*b);
//		               }
//		               if (t==sum) {
//		            	   System.out.println("armstong");
//		              }else {
//		            	  System.out.println("not a armstrong");
//		              }
		               
		               // pattern   //nested loop 
		
		                /*
		                 *    *
		                 *    * *
		                 *    * * *
		                 *    * * * *
		                 *    * * * * *
		                 *    * * * * * *
		                 *    
		                 *    
		                 *    * * * * * * 
		                 *    * * * * * 
		                 *    * * * * 
		                 *    * * *
		                 *    * * 
		                 *    * 
		                 *    
		                 *    
		                 *    1
		                 *    1 2 
		                 *    1 2 3
		                 *    1 2 3 4 
		                 *    1 2 3 4 5
		                 *    
		                 *    1 2 3 4 5 
		                 *    1 2 3 4
		                 *    1 2 3
		                 *    1 2
		                 *    1
		                 * 
		                 * 
		                 * 
		                 *                 *
		                 *               *  *
		                 *              * * * 
		                 *             * * * *
		                 *              * * *
		                 *               * *
		                 *                *  
		                 * 
		                 * 
		                 * 
		                 * 
		                 * 
		                 * 
		                 * 
		                 * 
		                 * 
		                 * */
		             
		                  //1  *
//		               for (int i=0; i<=4; i++) {
//		            	   for (int j=0; j<=i; j++) {
//		            		   
//		            		   System.out.print(" * ");
//		            	   }
//		            	   System.out.println();
//                    	}	
		
		           // 1.1  *
//		                for (int i=0; i<=8; i++) {
//		                	for (int j=0; j<=i; j++) {
//		                		System.out.print(" * ");
//		                	}
//		                	System.out.println();
//		                }
		                
		           // 2  *
//		                for(int i=5; i>=1; i--) {
//		                	for(int j=1; j<=i; j++) {
//		                		System.out.print(" * ");
//		                	}
//		                System.out.println();
//		                }
		                 // 3 no.
//		                for (int i=1; i<=5; i++) {
//		                	for(int j=1; j<=i; j++) {
//		                		
//		             
//		                		System.out.print(j+"  ");
//		                	}
//		                	System.out.println();
//		                }
		                 
		                     // 4 no. reverse
//		                      for (int i =5; i>=1; i--) {
//		                	 for (int j=1; j<=i; j++) {
//		                		 System.out.print(j+" ");
//		                	 }
//		                	 System.out.println();
//		                 }
		 
		
		               // diamond pattern
//		                     for(int i=0; i<=4; i++) {
//		                    	 for(int k=0; k<4-i; k++) {
//		                    		 System.out.print(" ");
//		                    	 } 
//		                    	 for (int j=0; j<=i; j++ ) {
//		                    		 System.out.print("* ");
//		                    	 }
//		                    	 System.out.println();
//		                     }
//
//		                     for (int i=3; i>=0; i--) {
//		                    	 for (int k=0; k<4-i; k++) {
//		                    		 System.out.print(" ");
//		                    	 } for (int j=0; j<=i; j++) 
//		                    	 {
//		                    		 System.out.print("* ");
//		                    	 }
//		                    	 System.out.println();
//		                     }
		                
		
		                       // diamond pattern
		
//		                        for (int a=0; a<=7; a++) {
//		                        	for (int b=0; b<=7-a; b++) {
//		                        		System.out.print(" ");
//		                        	}for (int c=0; c<=a; c++) {
//		                        		System.out.print("* ");
//		                        	}
//		                        	System.out.println();
//		                        }
//		                        
//		                        for (int a=6; a>=0; a--) {
//		                        	for (int b=0; b<=7-a; b++) {
//		                        		System.out.print(" ");
//		                        	} for (int c=0; c<=a; c++) {
//		                        		System.out.print("* ");
//		                        	}
//		                        	System.out.println();
//		                        }
		   
		/*
		 * 
		 *  i=0 *
		 *  i=1 # *
		 *  i=2 * # *
		 *  i=3 # * # *
		 *  i=4 * # * # *
		 *      j j j j j
		 *      0 1 2 3 4
		 *      
		 *      (i+j)%2==0, *
		 *      (0+0)%2
		 *      (1+1)%2
		 *      (2+0)
		 *      (2+2)
		 * 
		 * */
		                   
//	                 for (int i=0; i<=5; i++) {
//	                	 for (int j=0; j<=i; j++) {
//	                		 if ((i+j)%2==0) {
//	                			 System.out.print("* ");
//	                		 }else {
//	                			 System.out.print("# ");
//	                		 }
//	                	 }
//	                		 System.out.println();
//	                	 }
	                 
		                  
	
	
	
	
	
	
	}
	}


