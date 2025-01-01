public class SultansDine {
    static int totalBranch = 0;
    static int totalSell = 0;
    static SultansDine[] branch = new SultansDine[3];

    String branchName;
    int branchSell;

    SultansDine(String branchName) {
        this.branchName = branchName;
        this.branchSell = 0;
        branch[totalBranch++] = this;
    }

    void sellQuantity(int num) {
        if (num < 10) {
            this.branchSell = num * 300;
        } else if (num < 20) {
            this.branchSell = num * 350;
        } else {
            this.branchSell = num * 400;
        }
        totalSell += this.branchSell;
    }

    double branchPercentage() {
        return (double) this.branchSell / totalSell * 100;
    }

    void branchInformation() {
        System.out.println("Branch Name: " + this.branchName);
        System.out.println("Branch Sell: " + this.branchSell + " Taka");
    }

    static void details() {
        System.out.println("Total Number of branch(s): " + totalBranch);
        System.out.println("Total Sell: " + totalSell + " Taka");
        for (int i = 0; i < totalBranch; i++) {
            System.out.print("Branch Name: " + branch[i].branchName + ", Branch Sell: " + branch[i].branchSell + " Taka" + "\nBranch consists of total sell's " + String.format("%.2f", branch[i].branchPercentage()) + "\n");
        }
    }
}