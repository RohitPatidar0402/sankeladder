
class Demos 
{
	public static void main (String ar[]){
		int x[]={10,20,30,40,50};
		int y[]=new int[];
		for(int i=0;i<5;i++)
		{
			y[i]=x[i];
		}
		y[2]=55;
		System.out.println("array x=");
		for(int i : x)
		{
		System.out.print(i+" ");
			}
		System.out.println("array y=");
		for(int i : y)
		{
		System.out.print(i+" ");
			}	
} 
}