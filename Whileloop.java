package javapractice3;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    // forword direction
//		       int i=1;
//		       while(i<=10) {
//		    	   System.out.println(i);
//		    	   i++;
//		       }
		 
		
		
		      //backword direction
		
//		        int i=10;
//		        while(i>=1) {
//		        	System.out.println(i);
//		        	i--;
//		        }
		
		         
		
		         //table
//		        int num= 5;
//		        int i =1;
//		        while(i<=10) {
//		        	System.out.println(num*i);
//		        	i++;
//		        }
		        
		
//		         int num = 5;
//		         int i = 10;
//		         while (i>=1) {
//		        	 System.out.println(i*num);
//		        	 i--;
//		         }
                      
		
		            // factorial
//		             int i= 1;
//		             int num = 5;
//		             while (i<5) {
//		            	 num=num*i;
//		            	 System.out.println(num);
//		            	 i++;
//		             }
		
		
		
//		            int i = 1;
//		            int num = 10;
//		            while (i<10) {
//		            	num= num*i;
//		            	System.out.println(num);
//		            	i++;
//		            } 
		              
		
		
		
		              // prime no.
//		            int num= 8;
//		            int i = 1 ,count=0;
//		            while (i<=num) {
//		            	if(num%i==0) {
//		            		count++;
//		            	}
//		            	i++;
//		            }
//		            if (count==2) {
//		            	System.out.println("prime");
//		            }else {
//		            	System.out.println("not a prime");
//		            }
		
		
		
//		              int num = 23;
//		              int i = 1 , count=0;
//		              while (i<=num) {
//		            	  if (num%i==0) {
//		            		  count++;
//		            	  }
//		            	  i++;
//		              }
//		              if (count==2) {
//		            	  System.out.println("prime");
//		              } else {
//		            	  System.out.println("not a prime");
//		              }
		 
//		              int num= 43;
//		              int i = 1, count=0;
//		              while (i<=num) {
//		            	  if (num%1==0) {
//		            		  count++;
//		            	  }
//		            	  i++;
//		              } if (count==2) {
//		            	  System.out.println("prime");
//		              } else {
//		            	  System.out.println("not a prime");
//		              }
		
		
		            //armstrong no.
		
//		                int num= 407;
//		                int temp = num;
//		                int r , arm=0;
//		                while (num !=0) {
//		                	r= num%10;
//		                	num= num/10;
//		                	arm = arm+(r*r*r);
//		                }
//		                if (temp==arm) {
//		                	System.out.println("armstrong no.");
//		                }else {
//		                	System.out.println("not a armstrong");
//		                }
		  
//		               int num = 157;
//		               int temp = num;
//		               int r, sum=0;
//		               while (num!= 0) {
//		            	   r = num%10;
//		            	   num = num/10;
//		            	   sum= sum+(r*r*r);
//		               }if (temp==sum) {
//		            	   System.out.println("armstong no.");
//		               } else {
//		            	   System.out.println("not a armstong no.");
//		               }
		   
		               // fibonacci
//		               int a=0 , b=1, c;
//		               int i=0;
//		               
//		               while (i<=8) {
//		            	   System.out.println(a+" ");
//		            	   c=a+b;
//		            	   a=b;
//		            	   b=c;
//		            	   
//		            	   i++;
//		            	   
//		               }
		                
		                // pattern
		                
		                  /*
		                   *  *
		                   *  * *
		                   *  * * *
		                   *  * * * *
		                   *  * * * * *
		                   *  
		                   *  * * * * * 
		                   *  * * * *
		                   *  * * *
		                   *  * *
		                   *  *
		                   *  
		                   *  1 
		                   *  1 2 
		                   *  1 2 3 
		                   *  1 2 3 4
		                   *  1 2 3 4 5
		                   *  
		                   *  1 2 3 4 5 
		                   *  1 2 3 4
		                   *  1 2 3
		                   *  1 2 
		                   *  1
		                   *
		                   * 
		                   *
		                   * */
		                
//		                       int a=4;
//		                       int i=0;
//		                       
//		                       while (i<=4) {
//		                    	   int j=0;
//		                    	
//		                        while (j<=i) {
//		                    	   System.out.print("* ");
//		                    	   j++;
//		                       } 
//		                        System.out.println();
//		                             i++;
//		                          }
		
//		                           int a=7;
//		                           int i=0;
//		                           while(i<=7) {
//		                        	   int j=0;
//		                          while (j<=i) {
//		                        	  System.out.print("* ");
//		                          j++;
//		                          }
//		                          System.out.println();
//		                          i++;
//		                           }
		
//		                          int a=0;
//		                          int i=5;
//		                          while(i>=0) {
//		                        	  int j=0;
//		                        	  while(j<=i) {
//		                        		  System.out.print("* ");
//		                        		  j++;
//		                          }
//		                          System.out.println();
//		                            i--;
//		                          }
		                           
//		                          int a= 0;
//		                          int i = 5;
//		                          while (i>=0) {
//		                        	  int j =0;
//		                        	  while (j<=i) {
//		                        		  System.out.print("* ");
//		                        	  j++;
//		                        	  }
//		                        	  System.out.println();
//		                        	  i--;
//		                          }
		                          
//		                            int a=5;
//		                            int i= 1;
//		                            while (i<=5) {
//		                            	int j =1;
//		                            	while (j<=i) {
//		                            	System.out.print(j+" ");	
//		                            	j++;
//		                            	}
//		                            	System.out.println();
//		                            	i++;
//		                            } 
		  
//		                           int a= 8;
//		                           int i =1;
//		                           while(i<=8) {
//		                        	   int j=1;
//		                        	   while (j<=i) {
//		                        		   System.out.print(j+" ");
//		                        	   j++;
//		                        		   }
//		                        	   System.out.println();
//		                        	   i++;
//		                           }
		    
//		                          int a=1;
//		                          int i= 5;
//		                          while (i>=1) {
//		                           int j =1;
//		                           while(j<=i) {
//		                        	System.out.print(j+" ");   
//		                           j++;
//		                           }
//		                           System.out.println();
//		                           i--;
//		                          }
		
		
		                // diamond pattern
		
//		                            int a = 5;
//		                            int i = 0;
//		                            while (i<=5) {
//		                            	int j= 0;
//		                            while(j<= 5-i) {
//		                                  System.out.print(" ");
//		                            		j++;
//		                            	} 
//		                            	int k = 0;
//		                            	while (k<= i) {
//		                              	System.out.print("* ");
//		                            		k++;
//		                            	}
//		                               System.out.println();
//		                            i++;
//		                            }
//		                               int I = 4;
//		                             while (I>=0) {
//		                            	 int J = 0;
//		                            	 while (J<=5-I) {
//		                            		 System.out.print(" ");
//		                            		 J++;
//		                            	 } int K = 0;
//		                            	 while (K<=I) {
//		                            		 System.out.print("* ");
//		                            		 K++;
//		                            	 }
//		                            	 System.out.println();
//		                            	 I--;
//		                            	 
//		                             }
		 
//		                               int a = 8;
//		                               int i = 0;
//		                               while (i<=8) {
//		                            	   int j= 0;
//		                            	   while (j<=8-i) {
//		                            		   System.out.print(" ");
//		                            		   j++;
//		                            	   }
//		                            	   int k = 0;
//		                            	   while (k<=i) {
//		                            		   System.out.print("* ");
//		                            		   k++;
//		                            		   }
//		                            	   System.out.println();
//		                            	   i++;
//		                               }
//		                                  
//		                                  int I = 7;
//		                                  while (I>=0) {
//		                                	  int J=0;
//		                                	  while (J<=8-I) {
//		                                		  System.out.print(" ");
//		                                		  J++;
//		                                	 } 
//		                                	  int K=0;
//		                                	  while (K<=I) {
//		                                		  System.out.print("* ");
//		                                		  K++;
//		                                	  }
//		                                	  System.out.println();
//		                                	  I--;
//		                                  }
		 
//		                              
//		                       int a=4;
//		                       int i=0;
//		                       while(i<=4) {
//		                    	   int j=0;
//		                    	   while(j<=i) {
//		                    		   if ((i+j)%2==0) {
//		                    			   System.out.print(" # ");
//		                    			  
//		                    		   }else
//		                    			   System.out.print(" @ ");
//		                    		   j++;
//		                    	   }
//		                    	   System.out.println();
//		                    	   i++;
//		                       }
		                            
		                                  int a=0;
                                          int i=4;
                                       while(i>=0) {
     	                                  int j=0;
     	                                 while(j<=i) {
     		                            if ((i+j)%2==0) {
     			                            System.out.print(" #");
     			  
     		                                  }else
     			                        System.out.print(" @");
     		                                   j++;
     	                                         }
     	                               System.out.println();
     	                                          i--;
                                       }
		                                
		                                   
		                                  
	}

}
