public class Addition {
    /*
    new file --> any name
    new class --> Addition (accept 2 parameters, returns sum of 2 nums
    1) test class (first)
    2) write test cases for addition class
    3) run test case (fails)
    4) write code to make it pass
    5) naming convention
    6) statuc funcn --> print num of objects
    7) create default constructor (print statement whenever called)
    8) default destructor???? (print statement whenever called)
    */
    int num1,num2,ans;
    static int count=0;
    public int sum(){
        ans=num1+num2;
        return ans;
    }
    public Addition() {
        this.num1=0;
        this.num2=0;
        count+=1;
        System.out.println(count+"object(s) created");
    }
    public Addition(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        count+=1;
        System.out.println(count+" object(s) created");
    }
}
