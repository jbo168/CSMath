public class CSMath
{
	public static void main(String [] args)
	{
		int [] setA = {1,0,1,1};
		int [] setB = {0,1,1,1};

		int [] or = bitOr(setA,setB);
		int [] and = bitAnd(setA,setB);
		for(int i=0; i<or.length; i++)
		System.out.print(or[i]);

		System.out.println();

		for(int i=0; i<and.length; i++)
		System.out.print(and[i]);
	}

	public static int[] getUnion(int [] setA, int [] setB)
	{
		int [] union = ArrayManip.combineArrays(setA,setB);
		ArrayManip.removeDuplicates(union);
		return union;
	}

	public static int[] getIntersection(int [] setA, int [] setB)
	{
		return ArrayManip.commonElements(setA,setB);
	}

	public static boolean isInjective(int[] setA, int[] setB, int[] firstF, int[] secF)
	{
		boolean duplicate = ArrayManip.hasDuplicates(secF);
		if(duplicate)
			return false;
		else
			return true;
	}

	public static boolean isSurjective(int[] setA, int[] setB, int[] firstF, int[] secF)
	{
		boolean surjective = ArrayManip.containsAll(secF,setB);
		if(surjective)
			return true;
		else
			return false;
	}

	public static boolean isBijective(int[] setA, int[] setB, int[] firstF, int[] secF)
	{
		boolean surjective = isSurjective(setA,setB,firstF,secF);
		boolean injective = isInjective(setA,setB,firstF,secF);

		if(injective == true && surjective == true)
			return true;
		else
			return false;
	}

	public static boolean isFunction(int[] setA, int[] setB, int[] firstF, int[] secF)
	{
		boolean contains = ArrayManip.containsAll(setA,firstF);
		boolean duplicates = ArrayManip.hasDuplicates(firstF);

		if(contains == true && duplicates == false)
			return true;
		else
			return false;
	}

	public static int[] bitAnd(int[] bitA, int[] bitB)
	{
		int[] result = new int[bitA.length];
		int ctr1 = 0;

		while(ctr1 < result.length)
		{
			if(bitA[ctr1] == 1 && bitB[ctr1] == 1)
				result[ctr1] = 1;
			else
				result[ctr1] = 0;

			ctr1++;
		}

		return result;
	}

	public static int[] bitOr(int[] bitA, int[] bitB)
	{
		int[] result = new int[bitA.length];
		int ctr1 = 0;

		while(ctr1 < result.length)
		{
			if(bitA[ctr1] == 0 && bitB[ctr1] == 0)
				result[ctr1] = 0;
			else
				result[ctr1] = 1;

			ctr1++;
		}

		return result;
	}

	public static int[] setToBitSequence(int setA[], int n)
	{
		int[] bitSequence = new int[n];
		int ctr1 = 0;
		int ctr2 = 0;

		while(ctr1<n)
		{
			if(ctr1 == setA[ctr2])
			{
				bitSequence[ctr1] =1;
				ctr2++;
			}
			else
				bitSequence[ctr1] = 0;

			ctr1++;
		}

		return bitSequence;
	}

	
}