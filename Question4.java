import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    /**Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int i,j;
    for(i=num;i>=1;i--)
    		{
        		for(j=1;j<=i;j++)
        		{
            			System.out.print("*");
        		}
        		System.out.println("");**/
     Scanner in = new Scanner(System.in);

  
    int num = in.nextInt();

    int i = 1;
    String tri = ("");


    ArrayList<String> list = new ArrayList<>();


    while(i <= num){

      tri += "*";
      list.add(tri);

      i++;

    }


    for (int k = list.size()-1; k > -1; k--){

        System.out.println(list.get(k));

      }
  }
}
    		}	
    
  }
}
