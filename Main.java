
import java.lang.*;
import java.io.*;

class PatternX
{
	void Display(int iNo1, int iNo2)
	{
		if(iNo1 == 0 || iNo2 == 0)
		{
			if(iNo1 == iNo2)
			{
				System.out.println("Unable to Print Pattern, Both Values are Zero");
			}
			if(iNo1 == 0)
			{
				System.out.println("Unable to Print Pattern, Rows count is Zero");
			}
			if(iNo2 == 0)
			{
				System.out.println("Unable to Print Pattern, Columns count is Zero");
			}
		}
		else
		{
			if(iNo1 < 0)
			{
				iNo1 = -iNo1;
			}
			if(iNo2 < 0)
			{
				iNo2 = -iNo2;
			}

			int iCnt = 1;

			for(int i = iNo1; i > 0; i--)
			{
				for(int j = 1; j <= iNo2; j++)
				{
					if(iCnt > 9)
					{
						iCnt = 1;
					}

					System.out.print(iCnt+"\t");
					iCnt += 1;
				}

				System.out.println();
			}
		}

	}
}

class Main
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));    

		System.out.println("Enter Count of Rows");
		int iValue1 = Integer.parseInt(bobj.readLine());

		System.out.println("Enter Count of Columns");
		int iValue2 = Integer.parseInt(bobj.readLine());

		PatternX pobj = new PatternX();
		pobj.Display(iValue1,iValue2);
	}
}