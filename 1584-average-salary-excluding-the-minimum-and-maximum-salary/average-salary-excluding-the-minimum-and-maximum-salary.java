class Solution {
    public double average(int[] salary) {

        Arrays.sort(salary);
        double deno = salary.length-2;
        double nume=0;
        for(int i=1 ; i < salary.length-1;i++){
            nume += salary[i];
        }
        double ans = nume/deno;
        return ans;
        
    }
}