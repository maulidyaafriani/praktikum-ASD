public class Sum15 {
    double keuntungan[];

    Sum15(int el){
        keuntungan = new double[el];

    }
    double totalBF() {
        double total =0;
        for(int i=0;i<keuntungan.length;i++){
            total = total+keuntungan[1];
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if(l==r){
            return arr[1];
        }
        int mid = (l+r)/2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid+1, r);
        return lsum+rsum;
        
    }
}
