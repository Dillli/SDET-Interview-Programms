package javaProgram;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[] = new int[5]; //Array declaration
		a[0]=5; //value initializing
		a[1]=6;
		a[2]=4;
		a[3]=8;
		a[4]=11;
		for(int i=0;i<a.length;i++){ //retrieving values from array
		System.out.println((a[i]));
		}
		System.out.println("------------------------");
		//2nd way
		int b[] = {2,4,6,2,9};
		for(int i=0;i<b.length;i++){
		System.out.println((b[i]));
		}
		System.out.println("------------------------");
		System.out.println("Multidimesional Array");
//Multidimensional Array
		int ma[][] = new int[2][3]; //Array declaration-a[rows][cols]:
		ma[0][0]=5;
		ma[0][1]=6;
		ma[0][2]=4;
		ma[1][0]=8;
		ma[1][1]=11;
		ma[1][2]=34;
		//System.out.println((ma[1][2]));
		for(int i=0;i<ma.length;i++){
		for(int j=0;j<ma[i].length;j++){
			System.out.print(ma[i][j]+" ");
		}
		System.out.println();
		}
//2nd way
		System.out.println("------------------------");
		int mb[][] = {{2,4,2,9},{3,1,7,8},{5,8,2,1}};
		for(int i=0;i<mb.length;i++){
		for(int j=0;j<mb[i].length;j++){
		System.out.print(mb[i][j]+" ");
		}
		System.out.println();
		}
//min of array
		int min = mb[0][0];//Assuming that first value is smallest
		int mincol=0;
		for(int i=0;i<mb.length;i++){
		for(int j=0;j<mb[i].length;j++){
		if(mb[i][j]<min){
			min=mb[i][j];
			mincol=j;
		}}}
		System.out.println("minimum is: "+min);
	//Finding max num of th column
		int k=0;
		int max=mb[k][mincol];
		while(k<3){
			if(max<mb[k][mincol]){
				max=mb[k][mincol];
			}
			k++;
		}
		System.out.println("max of the column is: "+max);
	}

}
