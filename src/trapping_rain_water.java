public class trapping_rain_water {
    public static int trapped_water(int []height){
        int n=height.length;
        int lmax[]= new int[n];
        int rmax[]= new int[n];

        lmax[0]=height[0];
        for(int i=1;i<n;i++){
        lmax[i]=Math.max(height[i],lmax[i-1]);
        }

        rmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(height[i],rmax[i+1]);
        }

        int trappedwater=0;
        for(int i=0;i<height.length;i++) {
           int waterLevel= Math.min(lmax[i],rmax[i]);
          trappedwater += waterLevel-height[i];
        }
        return trappedwater;
    }

    public static void main(String[]args){
        int height[]={4,2,0,6,3,2,5};
       System.out.println(trapped_water(height));
    }
}
