import java.util.Arrays;

public class test {
    public static void main(String[] args) {
int[] a={1,0,2,1,0,2};
int[] res=moveZ(a,a.length);
for(int i=0;i<a.length;i++){
    System.out.print(a[i]+" ");
}
    }
    private static int[] moveZ(int[] a,int n){
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                cnt0++;
            }
            else if(a[i]==1){
                cnt1++;
            }
            else cnt2++;
        }
        for(int i=0;i<cnt0;i++){
            a[i]=0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++){
            a[i]=1;
        }
        for(int i=cnt0+cnt1;i<n;i++){
            a[i]=2;
        }
        return a;
    }

}
