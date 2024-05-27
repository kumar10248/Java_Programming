public class dsa {
  static   boolean pair(int []a,int size,int x){
      for (int i=0;i<size-1;i++){
          for (int j=i;j<size;j++){
              if(a[i]+a[j]==x){
                 return true ;
              }

          }
      }
      return false;
  }

    public static void main(String[] args) {
        int[] arr={1,6,-9,7,5};
        int s= arr.length;
        int r=-2;
        if(pair(arr,s,r)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
