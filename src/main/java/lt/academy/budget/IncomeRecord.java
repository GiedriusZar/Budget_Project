package lt.academy.budget;

import java.time.LocalDate;

public class IncomeRecord {



    private float amount;
    private LocalDate date;
    private String categoryIndex;
    private String type;
    private String additionalInfo;
    private int incomeCounter;


    public IncomeRecord(float amount, String categoryIndex, String toBank, String additionalInfo) {
        this.amount = amount;
        this.date = LocalDate.now();
        this.categoryIndex = categoryIndex;
        this.type = type;
        this.additionalInfo = additionalInfo;
        this.incomeCounter = Budget.recordCounter;


    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategoryIndex() {
        return categoryIndex;
    }

    public void setCategoryIndex(String categoryIndex) {
        this.categoryIndex = categoryIndex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public int getIncomeCounter() {
        return incomeCounter;
    }


}
