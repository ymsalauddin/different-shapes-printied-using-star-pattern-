import java.util.Scanner;
class Geometry
        {
          public static void main(String [] args)
            {
              Scanner scan=new Scanner(System.in);
              System.out.print("enter your number");
              int n=scan.nextInt();
              for(int i=0;i<=n-1;++i)
                  {
                     // square pattern 
                     for(int j=0;j<=n-1;++j)
                        {
                             System.out.print("*");
                         }
                      System.out.println(" ");
                   }
                     System.out.println("The first pattern  is square");
                     System.out.println();
                     
                    // Rectangle pattern 
                    for(int i=0;i<=n-1;++i)
                       {
                            for(int j=0;j<=n-2;++j)
                              {
                                 System.out.print("*");
                             }
                           System.out.println();
                      } 
                     System.out.println("The second pattern is rectangle ");
                     System.out.println();
                    
                      // Right angle triangle
                        for(int i=0;i<=n-1;++i)
                           {
                               for(int j=0;j<=i;++j)
                                  {
                                    System.out.print("*");
                                  }
                              System.out.println();
                          }
                         System.out.println("The Third  pattern is Right angle triangle ");
                         System.out.println();
                        
                       // Inverse Right angle triangle
                        for(int i=n-1;i>=0;--i) // or for(int i=0;i<=n-1;++i)
                           {
                               for(int j=i;j>=0;--j) // or for(int j=0;j<=5-i+1;++j)
                                  {
                                    System.out.print("*");
                                  }
                              System.out.println();
                          }
                         System.out.println("The Fourth  pattern is Inverse Right angle triangle ");
                         System.out.println();
                   
                     //  Triangle flip pattern
                        for(int i=0;i<=n-1;++i)
                           {
                               for(int j=0;j<=i;++j)
                                  {
                                    System.out.print("*");
                                  }
                              System.out.println();
                          }
                         
                       // Inverse Right angle triangle
                        for(int i=n-2;i>=0;--i) // or for(int i=0;i<=n-1;++i)
                           {
                               for(int j=i;j>=0;--j) // or for(int j=0;j<=5-i+1;++j)
                                  {
                                    System.out.print("*");
                                  }
                              System.out.println();
                          }
                         System.out.println("The Fifth  pattern is Right pascal's Triangle ");
                         System.out.println();
                       // To print odd number of stars 
                         for(int i=0;i<=n-1;++i)
                               {
                                  for(int j=0;j<=2*i;++j)
                                      {
                                        System.out.print("*");
                                     }
                                    System.out.println();
                                 }
                              System.out.println("The sixth  pattern is printing odd  number of stars ");
                              System.out.println();
                         // To print even number of stars 
                         for(int i=0;i<=n-1;++i)
                               {
                                  for(int j=0;j<=2*i-1;++j)
                                      {
                                        System.out.print("*");
                                     }
                                    System.out.println();
                                 }
                              System.out.println("The seventh  pattern is printing even number of stars ");
                              System.out.println();
                      
                       // The last pattern sandglass star patter  
                           for(int i=0;i<=n-1;++i)
                             {
                                for(int j=0;j<=5-i+1;++j)
                                   {
                                       System.out.print("*");
                                   }
                             System.out.println();
                            }
                          for(int i=0;i<=n-1;++i)
                                {
                                   for(int j=0;j<=i;++j)
                                        {
                                           System.out.print("*");
                                        }
                                     System.out.println();
                                 }
                               System.out.println("The eightth pattern is sand glass pattern");
                               System.out.println();
                      




            }
    }