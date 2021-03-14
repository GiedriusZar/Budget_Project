package lt.academy.budget;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExpenseRecord {

    private float amount;
    private LocalDateTime dateTime;
    private String category;
    private String paymetType;
    private String additionalInfo;

    public ExpenseRecord(float amount, String category, String paymetType, String additionalInfo) {
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
        this.category = category;
        this.paymetType = paymetType;
        this.additionalInfo = additionalInfo;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPaymetType() {
        return paymetType;
    }

    public void setPaymetType(String paymetType) {
        this.paymetType = paymetType;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
