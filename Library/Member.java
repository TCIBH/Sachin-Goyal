package Library;

class Member {
    private String memberId;
    private  String name;
    public Member(String memberId,String name)
    {
        this.memberId=memberId;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public String getMemberId() {
        return memberId;
    }
}

