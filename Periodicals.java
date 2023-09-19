public class Periodicals extends Item{
    private int issueNum;

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    Periodicals(){

    }

    Periodicals(int i,String t){
        issueNum = i;
        setTitle(t);
    }

    @Override
    public String getListing(){
        return "Periodical Title - " + getTitle()  + "\nIssue # - " + issueNum;
    }
}
