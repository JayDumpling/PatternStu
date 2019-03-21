package com.stu.pattern.prototype;

public class Gw_exammingForm {
    private Long examinationPaper_id;//试卷主键
    private String leavTime;//剩余时间
    private String organization_id;//单位主键
    private String id;//考试主键
    private Long examroom_id;//考场主键

    public Long getExaminationPaper_id() {
        return examinationPaper_id;
    }

    public void setExaminationPaper_id(Long examinationPaper_id) {
        this.examinationPaper_id = examinationPaper_id;
    }

    public String getLeavTime() {
        return leavTime;
    }

    public void setLeavTime(String leavTime) {
        this.leavTime = leavTime;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(String organization_id) {
        this.organization_id = organization_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getExamroom_id() {
        return examroom_id;
    }

    public void setExamroom_id(Long examroom_id) {
        this.examroom_id = examroom_id;
    }
}
