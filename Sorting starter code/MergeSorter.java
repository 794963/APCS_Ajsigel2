
/**
 * Write a description of class MergeSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSorter extends Sorter
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class MergeSorter
     */
    public MergeSorter()
    {
        // initialise instance variables
        super();
    }
    public void sort(int[] a) {
        int n=a.length;
        if(n<2)return;
        int m = n/2;
        int[] l = new int[m];
        int[] r = new int[n-m];
        for(int i=0; i<m;i++){
            l[i]=a[i];
        }
        for(int j=0; j<n-m;j++){
            r[j]=a[m+j];
        }
        sort(l);
        sort(r);
        merge(a,l,r);
    }
    public void merge(int[] a, int[] l, int[] r){
    int i=0;
    int j=0;
    int k=0;
    while(i<l.length && j<r.length){
    if (l[i] <= r[j]) {
            a[k] = l[i];
            k++;
            i++;
        }else {
            a[k] = r[j];
            j++;
            k++;
        }

    }
    while(i<l.length){
       a[k] = l[i];
            k++;
            i++; 
    }
    while(j<r.length){
        a[k] = r[j];
            j++;
            k++;
    }
    }
}
