class Classroom{
    public static void changeArr(int arr[],int i,int val){
       if(i==arr.length){
        printArr(arr);
        return;
       }
        //recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1);//fnx call step
        arr[i]=arr[i]-2;//backtracking
        //time omplexity O(n)
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); 
    }
    public static void findSubsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }

            System.out.println(ans);
            return;
        }

         //recursion -Yes choice
        findSubsets(str,ans+str.charAt(i),i+1);
        //no choice
        findSubsets(str, ans, i+1);
    }
    public static void FindPer(String str,String ans){
       if(str.length()==0){
        System.out.println(ans);
        return;
       } 
       for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String Newstr=str.substring(0,i)+str.substring(i+1);
            FindPer(Newstr,ans+curr);
        }
    }

    public static void main(String args[]){
        //int arr[]=new int[5];
        //changeArr(arr,0,1);
        //printArr(arr);//calling backtracked array after return 
        String str="abc";
        //findSubsets(str, "", 0);
        FindPer(str," ");
    }
}