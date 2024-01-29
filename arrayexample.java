package javapractice3;

import java.util.Scanner;

public class arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int ar[] = new int[6];

		// single dimension
//		     ar[0]= 45;
//		     ar[1] = 65;
//		     ar[2]= 85;
//		     ar[3]= 62;
//		     ar[4] = 12;
//		     ar[5] = 45;
//		for (int i=0; i<=5; i++) {
//			System.out.println(ar[i]);
//		}

//		    int ar[] = new int[8];
//		    
//		     ar[0]= 455;
//		     ar[1] = 655;
//		     ar[2]= 855;
//		     ar[3]= 624;
//		     ar[4] = 124;
//		     ar[5] = 454;
//		     ar[6] =564;
//		     ar[7] =64;
//		     for (int i=0; i<=7; i++) {
//		    	 System.out.println(ar[i]);
//		     }

//		        int ar[] = {45,62,65,85,25,24};
//		        for (int i=0; i<=ar.length-1; i++) {
//		        	System.out.println(ar[i]);
//		        }

		// ascending
//		      int ar[] = {5,6,8,4,2,9,1,0,7};
//		      int temp;
//		      
//		      for (int i=0; i<=ar.length-1; i++) {
//		    	  for (int j=i; j<=ar.length-1; j++) {
//		    		  if (ar[i]>ar[j]) {
//		    			  temp= ar[i];
//		    			  ar[i]= ar[j];
//		    			  ar[j]= temp;
//		    		  }
//		    	  }
//		    	  System.out.println(ar[i]+" ");
//		      }

//		           int ar[] = {65,85,42,12,98,54,57};
//		           int temp;
//		           for (int i=0; i<=ar.length-1; i++) {
//		        	   for (int j=i; j<=ar.length-1; j++) {
//		        		   if (ar[i]>ar[j]) {
//		        			   temp = ar[i];
//		        			   ar[i] =ar[j];
//		        			   ar[j]= temp;
//		        		   }
//		        	   }
//		        	   System.out.println(ar[i]+" ");
//		           }
//		     

		// decending

//		              int ar[] = {5,65,85,45,6556,655,95,25,65,42,78};
//		              int temp;
//		              for (int i=0; i<=ar.length-1; i++) {
//		            	  for(int j=i; j<=ar.length-1; j++) {
//		            		  if (ar[i]<ar[j]) {
//		            			  temp=ar[i];
//		            			  ar[i]=ar[j];
//		            			  ar[j]=temp;
//		            		  }
//		            	  }
//		            	  System.out.println(ar[i]);
//		              }

		// maximum no.
//		                     int ar[]= {56,65,8998,654654,356,556,45,98,56,46,4565};
//		                     int max =0;
//		                     for (int i=0; i<=ar.length-1; i++) {
//		                    	 if (ar[i]>max) {
//		                    		 max=ar[i];
//		                    	 }
//		                    	 }
//		                    	 System.out.println(max);

//		                        int ar[] = {65,854,56564,135,56,84653,8465,56,6535,468568865,84,64,4,6,86,64546,355};
//		                        int max=0;
//		                        for(int i=0; i<=ar.length-1; i++) {
//		                        	if (ar[i]>max) {
//		                        		max = ar[i];
//		                        	}
//		                        }
//		                       System.out.println(max);

		// small no

//		                            int ar[] = {566,5,684,684,65,86,85,46,686364,84,6,68,86,8};
//		                            int small = ar[0];
//		                            for (int i=0; i<=ar.length-1; i++) {
//		                            	if (ar[i]<small) {
//		                            		small=ar[i];
//		                            	}
//		                            }
//		                           System.out.println(small);

//		                     int ar[] = {4,5,6,7,8,0,-15,9,2,-10,5,2};
//		                     int small = ar[0];
//		                     for (int i=0; i<=ar.length-1; i++) {
//		                    	 if (ar[i]<small) {
//		                    		 small=ar[i];
//		                    	 }
//		                     }
//		                System.out.println(small);

		// merge using these method not print sequentially
//		                  int ar1[] = {1,2,3};
//		                  int ar2[] = {4,5,6};
//		                  int length = ar1.length;
//		                  for (int i= 0; i<length; i++) {
//		                	  System.out.print(ar1[i]+" "+ar2[i]+" ");
//		                  }

//		                 int ar1[] = {1,5,3};
//		                 int ar2[] = {4,25,6};
//		                  int length = ar1.length;
//		                 for (int i=0; i<length; i++) {
//		                	 System.out.print(ar1[i]+ar2[i]+" ");
//		                 }

		// merge sequentially
//		                 int ar1[] = {1,2,3};
//		                 int ar2[] = {4,5,6};
//		                 int ar3[] = new int [ar1.length+ar2.length];
//		                 
//		                 for (int i=0; i<=ar1.length-1; i++) {
//		                	 ar3[i] = ar1[i];
//		                 }
//		                	 for (int i=0; i<=ar3.length-1; i++) {
//		                		 System.out.println(ar3[i]);
//		                	 }
//		                	 
//		                	 for (int i=0; i<=ar2.length-1; i++) {
//		                		 ar3[ar1.length+i] = ar2[i];
//		                	 }
//		                	 
//		                	 for (int i=0; i<=ar3.length-1; i++) {
//		                		 System.out.println(ar3[i]);
//		                	 }

//		                      int ar1[]= {5,6,8,9};
//		                      int ar2[] = {4,7,6,2};
//		                      int ar3[]= new int [ar1.length+ar2.length];	
//		                      
//		                      for(int i=0; i<=ar1.length-1; i++) {
//		                    	  ar3[i] = ar1[i];
//		                      }
//		                      
//	                             for(int i=0; i<=ar3.length-1; i++) {
//	                            	 System.out.println(ar3[i]);
//	                             }
//	                             
//	                             for(int i =0; i<=ar2.length-1; i++) {
//	                            	 ar3[ar1.length+i] = ar2[i];
//	                             }
//	                            for(int i=0; i<=ar3.length-1; i++) {
//	                            	System.out.println(ar3[i]);
//	                            }

		// addition

//		                      int ar1[] = {1,12,53};
//		                      int ar2[] = {4,5,6};
//		                      int ar3[] = new int [ar1.length+ar2.length];
//		                      for (int i=0; i<=ar1.length-1; i++) {
//		                    	  System.out.println(ar1[i]+ar2[i]);
//		                      }

		// second maximum

//		               int ar[] = {15,8,4,16,3,16};
//		
//		                int max = 0;
//	                	int secMax = 0;
//		
//		                for(int i=0; i<=ar.length-1; i++) {
//	             		if(ar[i]>max) {
//				        secMax = max;
//			           	max = ar[i];
//			          }else if(ar[i]>secMax && ar[i]<max){
//				        secMax = ar[i];
//			               }
//		                 }System.out.println("max = "+ max + " secMax = "+ secMax);

//		                int ar[] = {54,565,15,85,865,865,55,56,85,98,9256,9256,325,654,45};
//		                    int max =0;
//		                    int secMax = 0;
//		                for (int i=0; i<=ar.length-1; i++) {
//		                	if (ar[i]>max) {
//		                		secMax=max;
//		                		max=ar[i];
//		                     }else if(ar[i] > secMax && ar[i]<max ) {
//		            	                  secMax = ar[i];
//		                     } 
//		             }
//		                	System.out.println("max ="+max+" secmax="+secMax);

		// secnond small
//		               int ar[] = {556,85,8,46,65,3,865,89,665,46,6,56,5};
//		               int small = ar[0];
//		               int secsmall = ar[0];
//		               
//		               for (int i=0; i<=ar.length-1; i++) {
//		            	   if (ar[i]<small) {
//		            		   secsmall=small;
//		            		   small = ar[i];
//		            	   } else if(ar[i]<secsmall) {
//		            		   secsmall = ar[i];
//		            		}
//		               }System.out.println("small ="+small+" secsmall="+secsmall);

		/*
		 * multidimensional syntax:- int ar[] = new int[5]; int ar[r][c] = new
		 * int[2][2];
		 * 
		 * int ar[][] = {{1,2},{3,4}};
		 * 
		 * i=0 1 2 i=1 3 4 j j 0 1
		 * 
		 */

		// matric create

//	              int ar[] [] = {{1,2} ,{3,4}};
//		
//		           for(int i=0; i<=ar.length-1; i++) {
//		        	   for (int j=0; j<=ar.length-1; j++) {
//		        		   
//		        	   
//		        	   System.out.print(ar[i][j] +" ");
//		           }
//		        	   System.out.println();
//		           }		

		// max no.

//		               int ar[][] = {{1,2},{4,5}}; 
//		               int max = 0;
//		               
//		               
//		               for(int i=0; i<=ar.length-1; i++) {
//		            	   for (int j=0; j<=ar.length-1; j++) {
//		            		   if (max<ar[i][j]) { 
//		            			   max=ar[i][j]; 
//		            		   }
//		            	   }
//		               }  
//		               System.out.println(max);

		// maximum

//		           int ar[][] = {{1,2,3},{4,5,6}};//2d
//		           
//		           
//		           // int ar[][][] = {{1,2,3},{4,5,6},{41,15,61}};//3d
//		           int max= 0;   
//		           
//		           for(int i=0; i<=ar.length-1; i++) {
//		        	   for (int j=0; j<=ar[i].length-1; j++) {
//		        		   		if(ar[i][j]>max) {
//		        		   			max = ar[i][j];
//		        		   		}
//		        		   }
//		        	   
//		           }
//		               System.out.println(max);

		// second maximum no.

//		           int ar[][] = {{1,2,3},{4,25,26}};//2d
//                   int max= 0;   
//                   int secmax =0;
//                      for(int i=0; i<=ar.length-1; i++) {
//                    	  for (int j=0; j<=ar[i].length-1; j++) {
//                    		  if (ar[i][j]>max) {
//                    			  secmax= max;
//                    			  max = ar[i][j];
//                    		  } else if (ar[i][j]>secmax && ar[i][j]<max) {
//                    			  secmax=ar[i][j];
//                    		  }
//                    	  }  
//                    	  }
//                    		  System.out.println("max="+max+"secmax="+secmax+" ");

		// second small :-

		// int ar[][] = { { 91, 22, 3 }, { 4, 25, 26 } };// 2d
		/*
		 * 0 91 22 3 1 4 25 26 0 1 2
		 * 
		 */

//		                int small = ar[0][0];
//		                int secsmall = ar[0][0];
//		            for (int i = 0; i <= ar.length - 1; i++) {
//			        for (int j = 0; j <= ar[i].length - 1; j++) {
//			        	
//				         if (ar[i][j] < small) {
//					         secsmall = small;
//					        small = ar[i][j];
//				      } else if (ar[i][j] < secsmall && ar[i][j] > small) {
//					     secsmall = ar[i][j];
//			       	}
//			       }
//		          }
//		         System.out.println("small=" + small +" "+ "secsmall=" + secsmall + " ");

		// ascending increasing order...

//                    			        int[][] ar = {{11, 2}, {13, 4}};
//                    			        for(int i=0; i<=ar.length-1; i++) {
//                    			        	for(int j=0; j<=ar.length-1; j++) {
//                    			        		System.out.print(ar[i][j]+" ");
//                    			        	}
//                    			        	System.out.println();
//                    			        }
//                    			         //Sort each inner array individually
//                    			        for (int i = 0; i < ar.length; i++) {
//                    			            for (int j = 0; j < ar[i].length - 1; j++) {
//                    			            	for (int k = 0; k < ar[i].length - j - 1; k++) {
//                    			                    if (ar[i][k] > ar[i][k + 1]) {
//                    			                        // Swap elements
//                    			                        int temp = ar[i][k];
//                    			                        ar[i][k] = ar[i][k + 1];
//                    			                        ar[i][k + 1] = temp;
//                    			                    }
//                    			                }
//                    			            }
//                    			        }
//
//                    			        // Print the sorted multidimensional array
//                    			       // for (int[] innerArray : ar) {
//                    			       //     System.out.println(Arrays.toString(innerArray));
//                    			     //   }
//                    			        for(int i=0; i<=ar.length-1; i++) {
//                    			        	for(int j=0; j<=ar.length-1; j++) {
//                    			        		System.out.print(ar[i][j]+" ");
//                    			        	}
//                    			        	System.out.println();
//                    			        }

		// 3d array

		// not ans. proper
//		                          int ar[][][] = {{{1,2,3}},{{4,5,6}},{{7,8,9}}} ;
//		                         int ar1[][][] = new int [2][2][2];
//		                          ar1 [0][0][0] = 1;
//		                          ar1 [0][0][1] = 2;
//		                          System.out.println(ar1[0][0][0]);
//		                          System.out.println(ar1[0][0][1]);
//		                          
//		                          for(int i=0; i<=ar.length-1; i++) {
//		                        	  for (int j=0; j<=ar[i].length-1; j++) {
//		                        		  for (int k=0; k<=ar[j].length-1; k++) {
//		                        			  System.out.print(ar[i][j][k]+" ");
//		                        		  }
//		                        	  }
//		                        	  System.out.println();
//		                          }

//	                         int ar[][][] = {{{4,5},{8,7}},{{6,7},{8,9}}} ;
//	                         for (int i=0; i<2; i++) {
//	                        	 for (int j=0; j<2; j++) {
//	                        		 for (int k=0; k<2; k++) {
//	                        			 System.out.print(ar[i][j][k]+" ");
//	                        		 }
//	                        	 }
//	                        	 System.out.println();
//	                         }

		// jegged array

//	                         int ar[][]=new int [4][];		
//		                      ar[0] = new int [5];
//	                          ar[1] = new int [3];
//	                          ar[2] = new int [7];
//	                          ar[3] = new int [4];
//	                         Scanner sc = new Scanner(System.in); 
//	                          
//	                          
//	                          for (int i=0; i<=ar.length-1; i++) {
//	                        	  for (int j=0; j<ar[i].length; j++) {
//	                        		  System.out.print("ar["+i+"]["+j+"] =" );     // input the value 
//	                        		  
//	                        		 ar[i][j] = sc.nextInt();     
//	                        	  }
//	                          System.out.println();
//	                          }
//	                          for (int i=0; i<=ar.length-1; i++) {
//	                        	  for (int j=0; j<ar[i].length; j++) {
//	                        		  System.out.print(ar[i][j]+" ");
//	                        		 
//	                        	  }
//	                          System.out.println();
//	                          }

//		                    int ar[][] = new int[5][];
//		                    ar[0] =new int[4];
//		                    ar[1] = new int [5];
//		                    ar[2] = new int [7];
//		                    ar[3] = new int [5];
//		                    ar[4] = new int [3];
//		                    Scanner sc = new Scanner(System.in);
//		                    
//		                    for(int i=0; i<5; i++) {
//		                    	for(int j=0; j<ar[i].length; j++) {
//		                    		System.out.print("ar["+i+"]["+j+"]");	
//		                    		ar[i][j] = sc.nextInt();                            
//		                     }
//		                    	System.out.println();
//		                    }
//		                    for(int i=0; i<5; i++) {
//		                    	for(int j=0; j<ar[i].length; j++) {
//		                    		System.out.print(ar[i][j]+" ");	
//		                    	
//		                    	}
//		                    	System.out.println();
//		                    }
//	                          

		// Object

//		Object ar[] = {12, 1.2f, 12.23, true, 'x', "xxx"};
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}

	}

}
