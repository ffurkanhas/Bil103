import java.util.*;

class Soru1{
	static int aTemp;
	public static void main(String args[]){
		int[][] arr;
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int a = Integer.parseInt(args[2]);
		int b = Integer.parseInt(args[3]);
		aTemp = a;
		arr = new int[m][n];
		ArrayList<ArrayList<Integer>> arrayListCozum = createArray(m,n,a,b);

		int[][] array = createArray(arr,a,b);
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		int[][] clearArray = deleteDuplicates(array);
		for(int i=0;i<clearArray.length;i++){
			for(int j=0;j<clearArray[i].length;j++){
				if(clearArray[i][j] != aTemp-1)
					System.out.print(clearArray[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("---------Array List Cozumu---------");

		for(int i=0;i<arrayListCozum.size();i++){
			for(int j=0;j<arrayListCozum.get(i).size();j++){
				System.out.print(arrayListCozum.get(i).get(j) + " ");
			}
			System.out.println();
		}
		System.out.println("-------");
		ArrayList<ArrayList<Integer>> clearArrayList = deleteDuplicates(arrayListCozum);
		for(int i=0;i<clearArrayList.size();i++){
			for(int j=0;j<clearArrayList.get(i).size();j++){
				System.out.print(clearArrayList.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	public static int[][] createArray(int[][] arr, int a, int b){
		int[][] temp;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = (int) (Math.random() * (b-1)) + a;
			}
		}
		temp = arr;
		return temp;
	}

	public static int[][] deleteDuplicates(int[][] arr){
		int temp;
		int[][] tempArray;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				temp = arr[i][j];
					for(int l=j+1;l<arr[i].length;l++){
						if(arr[i][l] == temp){
							arr[i][l] = aTemp-1;
						}
					}
			}
		}
		tempArray = arr;
		return tempArray;
	}

	public static ArrayList<ArrayList<Integer>> createArray(int n, int m, int a, int b){
		ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++){
			temp.add(new ArrayList<Integer>());
			for(int j=0;j<m;j++){
				temp.get(i).add((int) (Math.random() * (b-1)) + a);
			}
		}
		return temp;
	}

	public static ArrayList<ArrayList<Integer>> deleteDuplicates(ArrayList<ArrayList<Integer>> arr){
		int temp;
		ArrayList<ArrayList<Integer>> tempArr = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<arr.size();i++){
			for(int j=0;j<arr.get(i).size();j++){
				temp = arr.get(i).get(j);
					for(int l=j+1;l<arr.get(i).size();l++){
						if(arr.get(i).get(l) == temp){
							arr.get(i).remove(l);
						}
					}
			}
		}
		tempArr = arr;
		return tempArr;
	}

}